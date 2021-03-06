/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoprogram;

/**
 *
 * @author Jordan
 */
public class welcomePane extends javax.swing.JFrame {

    /**
     * Creates new form welcomePane
     */
    public welcomePane() {
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

        pressTextLabel = new javax.swing.JLabel();
        eitherTextLabel = new javax.swing.JLabel();
        lottoPlusBtn = new javax.swing.JButton();
        madeByTextLabel = new javax.swing.JLabel();
        lottoBtn = new javax.swing.JButton();
        rulesBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pressTextLabel.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        pressTextLabel.setForeground(new java.awt.Color(153, 0, 0));
        pressTextLabel.setText("Press a button below to take to ");

        eitherTextLabel.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        eitherTextLabel.setForeground(new java.awt.Color(153, 0, 0));
        eitherTextLabel.setText("either lotto or lotto and the plus draws");

        lottoPlusBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lottoBp.png"))); // NOI18N
        lottoPlusBtn.setBorderPainted(false);
        lottoPlusBtn.setContentAreaFilled(false);
        lottoPlusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lottoPlusBtnActionPerformed(evt);
            }
        });

        madeByTextLabel.setText("Made by Jordan, Keith, Warren, Fabio");

        lottoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lottoBpp.png"))); // NOI18N
        lottoBtn.setBorder(null);
        lottoBtn.setBorderPainted(false);
        lottoBtn.setContentAreaFilled(false);
        lottoBtn.setDefaultCapable(false);
        lottoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lottoBtnActionPerformed(evt);
            }
        });

        rulesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rules.png"))); // NOI18N
        rulesBtn.setBorderPainted(false);
        rulesBtn.setContentAreaFilled(false);
        rulesBtn.setDefaultCapable(false);
        rulesBtn.setFocusPainted(false);
        rulesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesBtnActionPerformed(evt);
            }
        });

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LottoLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(madeByTextLabel)
                .addGap(0, 341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(pressTextLabel)
                                    .addGap(22, 22, 22))
                                .addComponent(eitherTextLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lottoBtn)
                                .addGap(43, 43, 43)
                                .addComponent(lottoPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rulesBtn)
                                .addGap(143, 143, 143)))
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(pressTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eitherTextLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lottoPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lottoBtn))
                .addGap(18, 18, 18)
                .addComponent(rulesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(madeByTextLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lottoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoBtnActionPerformed
        // TODO add your handling code here:
        // this button is to take the user to the lotto (phase one) draw
        // dispose of the current (welcomePane)
        dispose();
        // create object to call other frame
        lottoPhaseOneGUI lPhaseOne = new lottoPhaseOneGUI();
        // set the lottoPhaseOneGUI frame
        lPhaseOne.setVisible(true);
        // center frame to center of screen
        lPhaseOne.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_lottoBtnActionPerformed

    private void lottoPlusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoPlusBtnActionPerformed
        // TODO add your handling code here:
        // this button is to take the user to the lotto plus + and lotto draw (Phase two)
        dispose();
        lottoPhaseTwoGUI phaseOneTwo = new lottoPhaseTwoGUI();
        phaseOneTwo.setVisible(true);
        phaseOneTwo.setLocationRelativeTo(null);
     
    }//GEN-LAST:event_lottoPlusBtnActionPerformed

    private void rulesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesBtnActionPerformed
        // TODO add your handling code here:
        //rules button so when dispose of current jframe 
        //set visible
        // set the location to the center of the screen 
        dispose();
        rulesPane ruPane = new rulesPane();
        ruPane.setVisible(true);
        ruPane.setLocationRelativeTo(null);
    }//GEN-LAST:event_rulesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(welcomePane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomePane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomePane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomePane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomePane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eitherTextLabel;
    private javax.swing.JButton lottoBtn;
    private javax.swing.JButton lottoPlusBtn;
    private javax.swing.JLabel madeByTextLabel;
    private javax.swing.JLabel pressTextLabel;
    private javax.swing.JButton rulesBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
