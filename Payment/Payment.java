public class Payment extends javax.swing.JFrame {

    /* Creates new form Payment */
    public Payment() {
        initComponents();
    }
    
    int payTotal = 0;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        payBtnNick = new javax.swing.JButton();
        payBtnDime = new javax.swing.JButton();
        payBtnQuar = new javax.swing.JButton();
        payLastEnter = new javax.swing.JLabel();
        payReadyDisp = new javax.swing.JLabel();
        payTotalDisp = new javax.swing.JLabel();
        payCostDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        payBtnNick.setText("Nickel");
        payBtnNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnNickActionPerformed(evt);
            }
        });

        payBtnDime.setText("Dime");
        payBtnDime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnDimeActionPerformed(evt);
            }
        });

        payBtnQuar.setText("Quarter");
        payBtnQuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnQuarActionPerformed(evt);
            }
        });

        payLastEnter.setText("Click a button to enter money");

        payReadyDisp.setFont(new java.awt.Font("Tahoma", 1, 24));

        payTotalDisp.setText("Total: ");

        payCostDisp.setFont(new java.awt.Font("Tahoma", 1, 14));
        payCostDisp.setText("Please enter 85 cents to play");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payLastEnter)
                    .addComponent(payReadyDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payCostDisp))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(payTotalDisp)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payBtnNick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(payBtnDime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payBtnQuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payBtnNick, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payCostDisp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(payBtnDime, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBtnQuar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(payReadyDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payLastEnter)
                    .addComponent(payTotalDisp))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payBtnNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnNickActionPerformed
        payLastEnter.setText("5 Cents Entered");
        payTotal = payTotal + 5;
        payTotalDisp.setText("Total: " + payTotal);
        if (payTotal >= 85) {
            payReadyDisp.setText("Ready!");
            payCostDisp.setText("Thank you, payment received");
        }
    }//GEN-LAST:event_payBtnNickActionPerformed

    private void payBtnDimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnDimeActionPerformed
        payLastEnter.setText("10 Cents Entered");
        payTotal = payTotal + 10;     
        payTotalDisp.setText("Total: " + payTotal);
        if (payTotal >= 85) {
            payReadyDisp.setText("Ready!");
            payCostDisp.setText("Thank you, payment received");
        }
    }//GEN-LAST:event_payBtnDimeActionPerformed

    private void payBtnQuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnQuarActionPerformed
        payLastEnter.setText("25 Cents Entered");
        payTotal = payTotal + 25;  
        payTotalDisp.setText("Total: " + payTotal);        
        if (payTotal >= 85) {//GEN-LAST:event_payBtnQuarActionPerformed
            payReadyDisp.setText("Ready!");
            payCostDisp.setText("Thank you, payment received");            
        }
    }
    
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton payBtnDime;
    private javax.swing.JButton payBtnNick;
    private javax.swing.JButton payBtnQuar;
    private javax.swing.JLabel payCostDisp;
    private javax.swing.JLabel payLastEnter;
    private javax.swing.JLabel payReadyDisp;
    private javax.swing.JLabel payTotalDisp;
    // End of variables declaration//GEN-END:variables
    
}
