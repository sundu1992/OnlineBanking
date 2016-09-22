package UIComponents;

import Server.RequestResponseMessenger;
import Server.Transaction;
import java.awt.CardLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sundu
 */
public class UserFrame extends javax.swing.JFrame {

    private CardLayout clayout;
    String camt, samt, cano, sano, uid, cbal, sbal, comments;
    int cno, sno,pin;
    java.sql.Timestamp currentTimestamp;

    /**
     * Creates new form UserFrame
     */
    public UserFrame(RequestResponseMessenger obj) {
        initComponents();

        camt = obj.getChk_bal();
        samt = obj.getSav_bal();
        cno = obj.getNo_checking_account();
        sno = obj.getNo_savings_account();
        cano = obj.getChk_acc_no();
        sano = obj.getSav_acc_no();
        uid = obj.getUid();

        //checkText.setText(camt);
        //saveText.setText(samt);
        cbal = obj.getChk_bal();
        sbal = obj.getSav_bal();
        currentTimestamp = obj.getCurrentTimestamp();
        comments = obj.getComments();
    

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayName = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        basePanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        deposit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        history = new javax.swing.JButton();
        cardBase = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        depositPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        DepositButton = new javax.swing.JButton();
        checkings = new javax.swing.JRadioButton();
        savings = new javax.swing.JRadioButton();
        withdrawPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        withdrawButton = new javax.swing.JButton();
        checkings1 = new javax.swing.JRadioButton();
        savings1 = new javax.swing.JRadioButton();
        transferPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        amtText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fromCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        toCombo = new javax.swing.JComboBox();
        TransferButton = new javax.swing.JButton();
        transactionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(740, 700));
        setPreferredSize(new java.awt.Dimension(740, 700));

        displayName.setFont(new java.awt.Font("Lucida Grande", 0, 70)); // NOI18N
        displayName.setForeground(new java.awt.Color(255, 153, 153));
        displayName.setText("Piggy Bank");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        basePanel.setMaximumSize(new java.awt.Dimension(740, 700));
        basePanel.setPreferredSize(new java.awt.Dimension(740, 700));

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        withdraw.setText("Withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        history.setText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(withdraw)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(history)
                        .addComponent(transfer))
                    .addComponent(deposit, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(deposit)
                .addGap(61, 61, 61)
                .addComponent(withdraw)
                .addGap(40, 40, 40)
                .addComponent(transfer)
                .addGap(62, 62, 62)
                .addComponent(history)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardBase.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cardBase.add(firstPanel, "card2");

        jLabel4.setText("Amount : ");

        DepositButton.setText("Deposit");
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        checkings.setText("Checkings");

        savings.setText("Savings");

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGap(79, 139, Short.MAX_VALUE)
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addComponent(checkings)
                        .addGap(107, 107, 107)
                        .addComponent(savings))
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(107, 107, 107)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepositButton)
                .addGap(172, 172, 172))
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(savings))
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(checkings)))
                .addGap(52, 52, 52)
                .addComponent(DepositButton)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        cardBase.add(depositPanel, "card2");

        jLabel2.setText("Amount :");

        amount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount1ActionPerformed(evt);
            }
        });

        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        checkings1.setText("Checkings");
        checkings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkings1ActionPerformed(evt);
            }
        });

        savings1.setText("Savings");

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(checkings1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savings1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amount1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdrawButton)
                .addGap(120, 120, 120))
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkings1)
                    .addComponent(savings1))
                .addGap(26, 26, 26)
                .addComponent(withdrawButton)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        cardBase.add(withdrawPanel, "card2");

        jLabel3.setText("Amount :");

        jLabel5.setText("From :");

        fromCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Checkings", "Savings" }));

        jLabel6.setText("To :");

        toCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Savings", "Checkings" }));

        TransferButton.setText("Transfer");
        TransferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transferPanelLayout = new javax.swing.GroupLayout(transferPanel);
        transferPanel.setLayout(transferPanelLayout);
        transferPanelLayout.setHorizontalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(amtText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TransferButton)
                .addGap(140, 140, 140))
        );
        transferPanelLayout.setVerticalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(TransferButton)
                .addGap(14, 14, 14))
        );

        cardBase.add(transferPanel, "card2");

        jLabel1.setText("Transactions ");

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Comments", "Timestamp "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transactionTable);

        javax.swing.GroupLayout transactionPanelLayout = new javax.swing.GroupLayout(transactionPanel);
        transactionPanel.setLayout(transactionPanelLayout);
        transactionPanelLayout.setHorizontalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(transactionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        transactionPanelLayout.setVerticalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardBase.add(transactionPanel, "card2");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIComponents/piggy_bank_icon.jpg"))); // NOI18N

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardBase, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon)
                .addGap(234, 234, 234))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(displayName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayName)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(logoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        cardBase.removeAll();
        cardBase.repaint();
        cardBase.revalidate();

        cardBase.add(transactionPanel);
        cardBase.repaint();
        cardBase.revalidate();

        System.out.println("Contacting Server");
        Socket client = null;
        try {
            client = new Socket("localhost", 6000);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(client.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestResponseMessenger sendObj = new RequestResponseMessenger();
        sendObj.setMessage("transactions");
        sendObj.setUid(uid);

        try {
            outputStream.writeObject(sendObj);

            System.out.println("Sent");
            RequestResponseMessenger recvObj = (RequestResponseMessenger) inputStream.readObject();

            System.out.println("Details Displayed!!");
            List<Transaction> transactions = recvObj.getTransactions();
            int i = 0;
            for (Transaction t : transactions) {
                transactionTable.getModel().setValueAt(i,i,0);
                transactionTable.getModel().setValueAt(t.getComments(),i, 1);
                transactionTable.getModel().setValueAt(t.getDt(),i, 2);
                i++;
            }

        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_historyActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        cardBase.removeAll();
        cardBase.repaint();
        cardBase.revalidate();

        cardBase.add(depositPanel);
        cardBase.repaint();
        cardBase.revalidate();


    }//GEN-LAST:event_depositActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        cardBase.removeAll();
        cardBase.repaint();
        cardBase.revalidate();

        cardBase.add(withdrawPanel);
        cardBase.repaint();
        cardBase.revalidate();


    }//GEN-LAST:event_withdrawActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        cardBase.removeAll();
        cardBase.repaint();
        cardBase.revalidate();

        cardBase.add(transferPanel);
        cardBase.repaint();
        cardBase.revalidate();
    }//GEN-LAST:event_transferActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        
       OnlineBanking ob=new OnlineBanking();
       ob.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void TransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferButtonActionPerformed

        int amt = Integer.parseInt(this.amtText.getText());
        String from = this.fromCombo.getSelectedItem().toString();
        String to = this.toCombo.getSelectedItem().toString();

        System.out.println("Contacting Server");
        Socket client = null;
        try {
            client = new Socket("localhost", 6000);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(client.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestResponseMessenger sendObj = new RequestResponseMessenger();
        sendObj.setMessage("Transfer");
        System.out.println("About to tranfer");
        if (from.equalsIgnoreCase("checkings")) {
            sendObj.setFrom("checkings");

            sendObj.setTo("savings");
        } else if (from.equalsIgnoreCase("savings")) {
            sendObj.setFrom("savings");
            sendObj.setTo("checkings");

        }

        sendObj.setUid(uid);
        sendObj.setAmt(amt);
        sendObj.setChk_bal(cbal);
        sendObj.setSav_bal(sbal);

        try {
            outputStream.writeObject(sendObj);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sent");
        try {
            RequestResponseMessenger recvObj = (RequestResponseMessenger) inputStream.readObject();
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Transferred!!");
    }//GEN-LAST:event_TransferButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:

        int amt = Integer.parseInt(this.amount1.getText());

        System.out.println("Contacting Server");
        Socket client = null;
        try {
            client = new Socket("localhost", 6000);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(client.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestResponseMessenger sendObj = new RequestResponseMessenger();
        sendObj.setMessage("withdraw");
        System.out.println("About to withdraw");
        if (checkings1.isSelected()) {
            sendObj.setaType("checkings");
            
        }
        if (savings1.isSelected()) {
            sendObj.setaType("savings");
        }

        sendObj.setUid(uid);
        sendObj.setAmt(amt);

        try {
            outputStream.writeObject(sendObj);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sent");
        try {
            RequestResponseMessenger recvObj = (RequestResponseMessenger) inputStream.readObject();
            if(recvObj.getMessage().equalsIgnoreCase("withdrawn"))
                JOptionPane.showMessageDialog(basePanel, "Withdraw Successful!!");
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void amount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount1ActionPerformed

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositButtonActionPerformed
        // TODO add your handling code here:

        int amt = Integer.parseInt(this.amount.getText());

        System.out.println("Contacting Server");
        Socket client = null;
        try {
            client = new Socket("localhost", 6000);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(client.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestResponseMessenger sendObj = new RequestResponseMessenger();
        sendObj.setMessage("Deposit");
        System.out.println("About to deposit");
        if (checkings.isSelected()) {
            sendObj.setaType("checkings");
        }
        if (savings.isSelected()) {
            sendObj.setaType("savings");
        }

        sendObj.setUid(uid);
        sendObj.setAmt(amt);

        try {
            outputStream.writeObject(sendObj);
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sent");
        try {
            RequestResponseMessenger recvObj = (RequestResponseMessenger) inputStream.readObject();
            if(recvObj.getMessage().equalsIgnoreCase("deposited"))
                JOptionPane.showMessageDialog(basePanel, "Deposited Successful!!");
        } catch (IOException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Deposited!!");
    }//GEN-LAST:event_DepositButtonActionPerformed

    private void checkings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkings1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkings1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /* public static void main(String args[]) {
     /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    /*   try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form */
    /* java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     new UserFrame().setVisible(true);
     }
     });
     }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepositButton;
    private javax.swing.JButton TransferButton;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amtText;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel cardBase;
    private javax.swing.JRadioButton checkings;
    private javax.swing.JRadioButton checkings1;
    private javax.swing.JButton deposit;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JLabel displayName;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JComboBox fromCombo;
    private javax.swing.JButton history;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JRadioButton savings;
    private javax.swing.JRadioButton savings1;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JComboBox toCombo;
    private javax.swing.JPanel transactionPanel;
    private javax.swing.JTable transactionTable;
    private javax.swing.JButton transfer;
    private javax.swing.JPanel transferPanel;
    private javax.swing.JButton withdraw;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}
