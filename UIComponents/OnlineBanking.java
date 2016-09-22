/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIComponents;

import Server.RequestResponseMessenger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Sundu
 */
public class OnlineBanking extends javax.swing.JFrame {

    /**
     * Creates new form OnlineBanking
     */
    public OnlineBanking() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        accNoLabel = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        pinLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        adminCheckbox = new javax.swing.JCheckBox();
        pinLabelText = new javax.swing.JPasswordField();
        displayName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piggy Bank");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(100, 30));

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIComponents/piggy_bank_icon.jpg"))); // NOI18N
        icon.setMaximumSize(new java.awt.Dimension(1000, 1000));
        icon.setPreferredSize(new java.awt.Dimension(600, 600));
        icon.setSize(new java.awt.Dimension(600, 600));

        accNoLabel.setText("User ID:");

        pinLabel.setText("Pin");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        adminCheckbox.setText("Admin");
        adminCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCheckboxActionPerformed(evt);
            }
        });

        pinLabelText.setText("pwd");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addGap(28, 28, 28)
                        .addComponent(adminCheckbox)
                        .addGap(36, 36, 36))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accNoLabel)
                            .addComponent(pinLabel))
                        .addGap(74, 74, 74)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uidText)
                            .addComponent(pinLabelText, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accNoLabel)
                    .addComponent(uidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinLabel)
                    .addComponent(pinLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(adminCheckbox))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        displayName.setFont(new java.awt.Font("Lucida Grande", 0, 70)); // NOI18N
        displayName.setForeground(new java.awt.Color(255, 153, 153));
        displayName.setText("Piggy Bank");
        displayName.setSize(new java.awt.Dimension(740, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(displayName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(displayName)
                .addGap(66, 66, 66)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String uid;
        int pin;
        Boolean selected;
        
        try {
                    
            try{
                    uid = uidText.getText();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Invalid Acconunt No","Error",ERROR_MESSAGE);
            return;
            }
        
            try{
                pin = Integer.parseInt( 
                    this.pinLabelText.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Invalid pin","Error",ERROR_MESSAGE);
                return;
            }
            try{
                selected = adminCheckbox.isSelected();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Invalid pin","Error",ERROR_MESSAGE);
                return;
            }
            
            
        
            System.out.println("Contacting Server");
            Socket client = new Socket("afsconnect1.njit.edu", 6000);
            ObjectOutputStream outputStream = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(client.getInputStream());
            RequestResponseMessenger sendObj=new RequestResponseMessenger();
            sendObj.setMessage("RequestLogin");
            System.out.println("About to send");
            sendObj.setUid(uid);
            sendObj.setPin(pin);
            //boolean selected = adminCheckbox.isSelected();  
            
            sendObj.setIsAdmin(selected);
            
            
            outputStream.writeObject(sendObj);
            System.out.println("Sent");
            RequestResponseMessenger recvObj = (RequestResponseMessenger) inputStream.readObject();
            selected=recvObj.getIsAdmin();
            System.out.println("received");
            if(recvObj.getMessage().equals("Login Failed")){
                JOptionPane.showMessageDialog(loginPanel, "Login Failed!!");
                //OnlineBanking o=new OnlineBanking();
            }
            else
            {                
            if(selected==true){
                admin a = new admin(recvObj);
                a.setVisible(true);
                this.setVisible(false);
            }
            else{
                UserFrame u=new UserFrame(recvObj);
                u.setVisible(true);
                this.setVisible(false);
            }
           }
        } catch (IOException ex) {
            Logger.getLogger(OnlineBanking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OnlineBanking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void adminCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminCheckboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineBanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accNoLabel;
    private javax.swing.JCheckBox adminCheckbox;
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel icon;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel pinLabel;
    private javax.swing.JPasswordField pinLabelText;
    private javax.swing.JTextField uidText;
    // End of variables declaration//GEN-END:variables
}
