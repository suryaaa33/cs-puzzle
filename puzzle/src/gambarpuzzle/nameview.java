package gambarpuzzle;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class nameview extends javax.swing.JFrame {

    /**
     * Creates new form nameview
     */
    public nameview() {
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

        jPanel1 = new javax.swing.JPanel();
        nama_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        muncul_nama = new javax.swing.JTextField();
        enter_nama = new javax.swing.JButton();
        hal_selanjutnya = new javax.swing.JButton();
        hal_selanjutnya1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 119, 39));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 0)));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(587, 346));

        nama_user.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        nama_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_userActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER NAME");

        muncul_nama.setBackground(new java.awt.Color(204, 119, 39));
        muncul_nama.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        muncul_nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        muncul_nama.setBorder(null);
        muncul_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muncul_namaActionPerformed(evt);
            }
        });

        enter_nama.setBackground(new java.awt.Color(153, 153, 153));
        enter_nama.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        enter_nama.setText("ENTER");
        enter_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_namaActionPerformed(evt);
            }
        });

        hal_selanjutnya.setBackground(new java.awt.Color(153, 153, 153));
        hal_selanjutnya.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        hal_selanjutnya.setText(">");
        hal_selanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hal_selanjutnyaActionPerformed(evt);
            }
        });

        hal_selanjutnya1.setBackground(new java.awt.Color(153, 153, 153));
        hal_selanjutnya1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        hal_selanjutnya1.setText("<");
        hal_selanjutnya1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hal_selanjutnya1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(hal_selanjutnya1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(muncul_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hal_selanjutnya, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nama_user, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enter_nama)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nama_user)
                    .addComponent(enter_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muncul_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hal_selanjutnya1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hal_selanjutnya, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void nama_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_userActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nama_userActionPerformed

    private void hal_selanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hal_selanjutnyaActionPerformed
        // TODO add your handling code here:
        if (nama_user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ISI DONG NAMANYAA!!!", "PUNTEN SLURRR", JOptionPane.ERROR_MESSAGE);
        }else
        {
            levelview lv = new levelview();
            lv.setLocationRelativeTo(null);
            lv.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_hal_selanjutnyaActionPerformed

    private void muncul_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muncul_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muncul_namaActionPerformed

    private void enter_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_namaActionPerformed
        // TODO add your handling code here:
        String isi_nama = nama_user.getText();
        
        if (nama_user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ISI DONG NAMANYAA!!!", "PUNTEN SLURRR", JOptionPane.ERROR_MESSAGE);
        } else {
            muncul_nama.setText("H1 " + isi_nama + ", S3m4n64T mainnya yaaaa ^_^");
        }
        
    }//GEN-LAST:event_enter_namaActionPerformed

    private void hal_selanjutnya1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hal_selanjutnya1ActionPerformed
        // TODO add your handling code here:
            homeview hv = new homeview();
            hv.setLocationRelativeTo(null);
            hv.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_hal_selanjutnya1ActionPerformed

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
            java.util.logging.Logger.getLogger(nameview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nameview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nameview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nameview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            nameview nv = new nameview();
            nv.setLocationRelativeTo(null);
            nv.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter_nama;
    private javax.swing.JButton hal_selanjutnya;
    private javax.swing.JButton hal_selanjutnya1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField muncul_nama;
    private javax.swing.JTextField nama_user;
    // End of variables declaration//GEN-END:variables
}