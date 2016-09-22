/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Sundu
 */
public class Server {

    //Server Class runs at port 3023 and accepts requests from Client socket.For each request 
    //handler thread is initiated to service the request.
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://sql1.njit.edu/edu", "2738", "APqdNdndj");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/piggyBank", "root", "");
            System.out.println("Connected to the database");
            ServerSocket s = new ServerSocket(6000);
            System.out.println("-- Server running on port 6000 --");
            for (;;) {
                Socket incoming = s.accept();
                new ThreadedDataObjectHandler(incoming, conn).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ThreadedDataObjectHandler extends Thread {

    public Connection conn;
    //Thread class which receives all requests, calls appropriate DAO method and returns data back to client.
    public RequestResponseMessenger recv_obj;
    public RequestResponseMessenger send_obj;
    public Socket incoming;

    ObjectInputStream in;
    ObjectOutputStream out;

    public ThreadedDataObjectHandler(Socket i, Connection conn) {
        this.incoming = i;
        this.conn = conn;
    }

    public void run() {
        try {
            System.out.println("Run!");
            System.out.println("0");
            in = new ObjectInputStream(incoming.getInputStream());
            out = new ObjectOutputStream(incoming.getOutputStream());
            recv_obj = (RequestResponseMessenger) in.readObject();
            send_obj = new RequestResponseMessenger();
            System.out.println("2");
            String cmd = recv_obj.getMessage().toLowerCase();
            Calendar d = Calendar.getInstance();
            java.util.Date now = d.getTime();
            System.out.println("1");
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
            System.out.println(cmd);

            switch (cmd) {
                case "requestlogin":
                    //Boolean selection=recv_obj.isIsAdmin();
                    String sql = "SELECT count(*) as rec FROM creds where uid='" + recv_obj.getUid() + "' and pin=" + recv_obj.getPin();
                    Statement stat = conn.createStatement();
                    ResultSet rs = stat.executeQuery(sql);
                    rs.next();
                    if (rs.getInt(1) == 1) {
                        System.out.println("Login Succeeded");
                        sql = "select isFreezed,is_Admin from creds where uid='" + recv_obj.getUid() + "'";
                        rs = stat.executeQuery(sql);
                        rs.next();

                        send_obj.setIsAdmin(rs.getBoolean(2));
                        send_obj.setIsFreezed(rs.getString(1));
                        System.out.println(send_obj.getIsAdmin());
                        sql = "select count(*) as checking from accounts where uid='" + recv_obj.getUid() + "' and type='checkings'";
                        rs = stat.executeQuery(sql);
                        rs.next();
                        send_obj.setNo_checking_account(Integer.parseInt(rs.getString(1)));
                        //send_obj.setIsAdmin("0");
                        sql = "select count(*) as savings from accounts where uid='" + recv_obj.getUid() + "' and type='savings'";
                        rs = stat.executeQuery(sql);
                        rs.next();
                        send_obj.setNo_checking_account(Integer.parseInt(rs.getString(1)));

                        sql = "select fname, lname,addr,ssn,dob,ano,type,balance FROM users u inner join accounts a on u.uid = a.uid where u.uid='" + recv_obj.getUid() + "'";
                        rs = stat.executeQuery(sql);
                        while (rs.next()) {
                            if ("savings".equals(rs.getString(7))) {
                                send_obj.setSav_acc_no(rs.getString(6));
                                send_obj.setSav_bal(rs.getString(8));

                            }
                            if ("checkings".equals(rs.getString(7))) {
                                send_obj.setChk_acc_no(rs.getString(6));
                                send_obj.setChk_bal(rs.getString(8));
                            }

                            send_obj.setFname(rs.getString(1));
                            send_obj.setLname(rs.getString(2));
                            send_obj.setAddr(rs.getString(3));
                            send_obj.setSsn((rs.getInt(4)));

                        }
                        send_obj.setUid(recv_obj.getUid());

                        send_obj.setMessage("Logged in");

                        sql = "INSERT INTO transactions VALUES(NULL,'" + recv_obj.getUid() + "','" + currentTimestamp + "','Last Login!') ";

                        stat.execute(sql);
                        sql = "COMMIT";
                        stat.execute(sql);
                    } else {

                        System.out.println("Login Failed");
                        send_obj.setMessage("Login Failed");
                    }

                    out.writeObject(send_obj);
                    break;

                case "transfer":
                    String uid = recv_obj.getUid();
                    int amt = recv_obj.getAmt();
                    String from = recv_obj.getFrom();
                    String to = recv_obj.getTo();
                    int bal;
                    if (from.equalsIgnoreCase("checkings")) {
                        bal = Integer.parseInt(recv_obj.getChk_bal());
                    } else {
                        bal = Integer.parseInt(recv_obj.getSav_bal());
                    }
                    if (bal > amt) {
                        String sql5 = "UPDATE accounts SET balance=balance-" + amt + " WHERE  type='" + from + "' and uid='" + uid + "'";
                        System.out.println(sql5);
                        Statement stat5 = conn.createStatement();
                        stat5.execute(sql5);
                        sql5 = "COMMIT";
                        stat5.execute(sql5);
                        sql5 = "UPDATE accounts SET balance=balance+" + amt + " WHERE type='" + to + "' and uid='" + uid + "'";
                        System.out.println(sql5);
                        stat5 = conn.createStatement();
                        stat5.execute(sql5);
                        sql5 = "COMMIT";
                        stat5.execute(sql5);

                        sql5 = "INSERT INTO transactions VALUES(NULL,'" + recv_obj.getUid() + "','" + currentTimestamp + "','Transfer Performed!') ";

                        stat5.execute(sql5);
                        sql5 = "COMMIT";
                        stat5.execute(sql5);
                    }

                    out.writeObject(send_obj);

                    break;
                case "transactions":
                    List<Transaction> tt = new ArrayList<Transaction>();
                    String uid3 = recv_obj.getUid();
                    tt = getTransactions(uid3);
                    send_obj.setTransactions(tt);
                    out.writeObject(send_obj);
                    break;
                case "create":
                    String uid1 = recv_obj.getUid();
                    String fname = recv_obj.getFname();
                    String lname = recv_obj.getLname();
                    Calendar dob = recv_obj.getDate();
                    //Timestamp date=dob.toString;
                    //dob.
                    int ssn = recv_obj.getSsn();
                    String addr = recv_obj.getAddr();
                    String type = recv_obj.getaType();
                    int cno = Integer.parseInt(recv_obj.getChk_acc_no());
                    int sno = Integer.parseInt(recv_obj.getSav_acc_no());
                    int aNo;
                    int pin=recv_obj.getPin();
                    //String isAdmin=Integer.parseInt(recv_obj.getIsAdmin());
                   // int isFreeze=recv_obj.get
                            System.out.println("hello");
                    System.out.println(dob);
                    
                    Calendar calendar = dob;
                    //java.sql.Date date = new java.sql.Date(calendar.getTimeInMillis());
                    int day=dob.get(Calendar.DATE);
                    int month=dob.get(Calendar.MONTH);
                    int year=dob.get(Calendar.YEAR);
                    
                    
                    String sql1 = "INSERT INTO users VALUES (NULL,'" + uid1 + "','" + fname + "','" + lname + "','"+year+"-"+month+"-"+day+"'," + ssn + ",'" + addr + "');";
                    System.out.println(sql1);
                    Statement stat1 = conn.createStatement();
                    stat1.execute(sql1);
                    sql1 = "COMMIT";
                    stat1.execute(sql1);

                    sql1 = "INSERT INTO transactions VALUES(NULL,'" + recv_obj.getUid() + "','" + currentTimestamp + "','User Created!') ";
                    stat1.execute(sql1);
                    sql1 = "COMMIT";
                    stat1.execute(sql1);

                    sql1 = "INSERT INTO creds VALUES ('" + uid1 + "'," + pin + "," + 0 + "," +0+ ")";
                    stat1.execute(sql1);
                    sql1 = "COMMIT";
                    stat1.execute(sql1);

                    if (type.equalsIgnoreCase("checkings")) {
                        aNo = cno;
                        sql1 = "INSERT INTO accounts (uid,ano,type,balance) VALUES ('" + uid1 + "'," + aNo + ",'" + type + "',0);";
                        stat1.execute(sql1);
                        sql1 = "COMMIT";
                        stat1.execute(sql1);
                    } else if (type.equalsIgnoreCase("savings")) {
                        aNo = sno;
                        sql1 = "INSERT INTO accounts (uid,ano,type,balance) VALUES ('" + uid1 + "'," + aNo + ",'" + type + "',0);";
                        stat1.execute(sql1);
                        sql1 = "COMMIT";
                        stat1.execute(sql1);
                    } else {
                        aNo = cno;
                        sql1 = "INSERT INTO accounts (uid,ano,type,balance) VALUES ('" + uid1 + "'," + aNo + ",'checkings',0);";
                        stat1.execute(sql1);
                        sql1 = "COMMIT";
                        stat1.execute(sql1);
                        aNo = sno;
                        sql1 = "INSERT INTO accounts (uid,ano,type,balance) VALUES ('" + uid1 + "'," + aNo + ",'savings',0);";
                        stat1.execute(sql1);
                        sql1 = "COMMIT";
                        stat1.execute(sql1);

                    }
                    send_obj.setMessage("created");
                    out.writeObject(send_obj);
                    break;
                case "withdraw":
                    int amount = recv_obj.getAmt();
                    //System.out.println(amount);
                    String sql2 = "UPDATE accounts SET balance=balance-" + amount + " WHERE uid='" + recv_obj.getUid() + "' and type='" + recv_obj.getaType() + "'";
                    System.out.println(sql2);
                    Statement stat2 = conn.createStatement();
                    stat2.execute(sql2);
                    sql2 = "COMMIT";
                    stat2.execute(sql2);
                    sql2 = "INSERT INTO transactions VALUES(NULL,'" + recv_obj.getUid() + "','" + currentTimestamp + "','Money Withdrawn!')";

                    stat2.execute(sql2);
                    sql2 = "COMMIT";
                    stat2.execute(sql2);
                    send_obj.setMessage("withdrawn");
                    out.writeObject(send_obj);
                    break;
                case "deposit":
                    int amount1 = recv_obj.getAmt();

                    String sql3 = "UPDATE accounts SET balance=balance+" + amount1 + " WHERE uid='" + recv_obj.getUid() + "' and type='" + recv_obj.getaType() + "'";
                    Statement stat3 = conn.createStatement();
                    stat3.execute(sql3);
                    sql3 = "COMMIT";
                    stat3.execute(sql3);
                    sql3 = "INSERT INTO transactions VALUES(NULL,'" + recv_obj.getUid() + "','" + currentTimestamp + "','Money Deposited!') ";

                    stat3.execute(sql3);
                    sql3 = "COMMIT";
                    stat3.execute(sql3);
                    send_obj.setMessage("deposited");

                    out.writeObject(send_obj);
                    break;
                case "retrieve":
                    System.out.println("retrieving");
                    String sql6 = "SELECT u.fname,u.lname,u.addr,a.ano,a.balance,a.type FROM accounts a inner join users u on u.uid=a.uid where u.uid='" + recv_obj.getUid() + "'";
                    System.out.println("sql>>"+sql6);
                    Statement stat6 = conn.createStatement();
                    ResultSet rs6 = stat6.executeQuery(sql6);
                    //rs6.next();

                    while (rs6.next()) {
                        System.out.println(rs6.getRow());
                        send_obj.setFname(rs6.getString(1));
                        send_obj.setLname(rs6.getString(2));
                        send_obj.setAddr(rs6.getString(3));

                        if (rs6.getString(6).equals("checkings")) {
                            send_obj.setChk_acc_no(rs6.getString(4));
                            send_obj.setChk_bal(rs6.getString(5));
                        } else if (rs6.getString(6).equals("savings")) {
                            send_obj.setSav_acc_no(rs6.getString(4));
                            send_obj.setSav_bal(rs6.getString(5));
                        }

                    }

                    send_obj.setMessage("retrieved");
                    out.writeObject(send_obj);
                    break;
                case "freeze":

                    String sql7 = "UPDATE creds SET isFreezed=" + 1 + " WHERE uid='" + recv_obj.getUid() + "'";
                    Statement stat7 = conn.createStatement();
                    stat7.execute(sql7);
                    sql7 = "COMMIT";
                    stat7.execute(sql7);
                    sql7 = "INSERT INTO transactions VALUES(NULL,'" + recv_obj.getUid() + "','" + currentTimestamp + "','Freezed!')";

                    stat7.execute(sql7);
                    sql7 = "COMMIT";
                    stat7.execute(sql7);
                    send_obj.setMessage("freezed");

                    out.writeObject(send_obj);
                    break;

            }

            in.close();
            out.close();

        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public List<Transaction> getTransactions(String uid) throws SQLException {
        String sql = "select uid, comments, datetime from transactions where uid='" + uid + "' ORDER BY datetime DESC;";
        Statement stat = this.conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        List<Transaction> ls = new ArrayList<Transaction>();
        while (rs.next()) {
            // System.out.println(rs.getString(1) + rs.getString(2) + rs.getTimestamp(3));
            ls.add(new Transaction(rs.getString(1), rs.getString(2), rs.getTimestamp(3)));
        }
        return ls;

    }

}
