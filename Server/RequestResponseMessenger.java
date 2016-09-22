/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Sundu
 */
public class RequestResponseMessenger extends DataObject {

    private String uid;
    private int pin;
    private int no_checking_account;
    private int no_savings_account;
    private String chk_bal;
    private String sav_bal;
    private String fname;
    private String lname;
    private String chk_acc_no;
    private String sav_acc_no;
    private int ano;
    private Boolean isAdmin;
    private String isFreezed;
   
    private String aType;
    private String addr;
    private int ssn;
    private Calendar date;
    private int amt;
    private String from;
    private String to;
    private java.sql.Timestamp currentTimestamp;
    private String comments;
    private List<Transaction> transactions;

    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the no_checking_account
     */
    public int getNo_checking_account() {
        return no_checking_account;
    }

    /**
     * @param no_checking_account the no_checking_account to set
     */
    public void setNo_checking_account(int no_checking_account) {
        this.no_checking_account = no_checking_account;
    }

    /**
     * @return the no_savings_account
     */
    public int getNo_savings_account() {
        return no_savings_account;
    }

    /**
     * @param no_savings_account the no_savings_account to set
     */
    public void setNo_savings_account(int no_savings_account) {
        this.no_savings_account = no_savings_account;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the chk_acc_no
     */
    public String getChk_acc_no() {
        return chk_acc_no;
    }

    /**
     * @param chk_acc_no the chk_acc_no to set
     */
    public void setChk_acc_no(String chk_acc_no) {
        this.chk_acc_no = chk_acc_no;
    }

    /**
     * @return the sav_acc_no
     */
    public String getSav_acc_no() {
        return sav_acc_no;
    }

    /**
     * @param sav_acc_no the sav_acc_no to set
     */
    public void setSav_acc_no(String sav_acc_no) {
        this.sav_acc_no = sav_acc_no;
    }

    
    /**
     * @return the aType
     */
    public String getaType() {
        return aType;
    }

    /**
     * @param aType the aType to set
     */
    public void setaType(String aType) {
        this.aType = aType;
    }

    /**
     * @return the addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr the addr to set
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the ssn
     */
    public int getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the date
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * @return the amt
     */
    public int getAmt() {
        return amt;
    }

    /**
     * @param amt the amt to set
     */
    public void setAmt(int amt) {
        this.amt = amt;
    }

    /**
     * @return the chk_bal
     */
    public String getChk_bal() {
        return chk_bal;
    }

    /**
     * @param chk_bal the chk_bal to set
     */
    public void setChk_bal(String chk_bal) {
        this.chk_bal = chk_bal;
    }

    /**
     * @return the sav_bal
     */
    public String getSav_bal() {
        return sav_bal;
    }

    /**
     * @param sav_bal the sav_bal to set
     */
    public void setSav_bal(String sav_bal) {
        this.sav_bal = sav_bal;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return the currentTimestamp
     */
    public java.sql.Timestamp getCurrentTimestamp() {
        return currentTimestamp;
    }

    /**
     * @param currentTimestamp the currentTimestamp to set
     */
    public void setCurrentTimestamp(java.sql.Timestamp currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the getI
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin the isAdmin to set
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * @return the isFreezed
     */
    public String isIsFreezed() {
        return isFreezed;
    }

    /**
     * @param isFreezed the isFreezed to set
     */
    public void setIsFreezed(String isFreezed) {
        this.isFreezed = isFreezed;
    }

    
}
