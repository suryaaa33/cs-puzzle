
import gambarpuzzle.kinaneasy;
import gambarpuzzle.marioeasy;
import gambarpuzzle.radieasy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Tuti
 */
public class opsieasy extends javax.swing.JFrame {

    /**
     * Creates new form opsieasy
     */
    public opsieasy() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tombolmario = new javax.swing.JButton();
        tombolradi = new javax.swing.JButton();
        tombolkinan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backbtneasy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 119, 39));
        setMaximumSize(new java.awt.Dimension(587, 344));
        setMinimumSize(new java.awt.Dimension(587, 344));
        setPreferredSize(new java.awt.Dimension(587, 350));

        jPanel1.setBackground(new java.awt.Color(204, 119, 39));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(587, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(587, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(588, 344));

        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mariofixbgt.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 3, true));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radi.jpeg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 3, true));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinan.jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 3, true));

        tombolmario.setBackground(new java.awt.Color(153, 153, 153));
        tombolmario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tombolmario.setText("MARIO");
        tombolmario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolmarioActionPerformed(evt);
            }
        });

        tombolradi.setBackground(new java.awt.Color(153, 153, 153));
        tombolradi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tombolradi.setText("RADI");
        tombolradi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolradiActionPerformed(evt);
            }
        });

        tombolkinan.setBackground(new java.awt.Color(153, 153, 153));
        tombolkinan.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tombolkinan.setText("KINAN");
        tombolkinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkinanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("CHOOSE YOUR CHARACTER");

        backbtneasy.setBackground(new java.awt.Color(204, 204, 204));
        backbtneasy.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        backbtneasy.setText("<");
        backbtneasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtneasyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(tombolmario)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(tombolradi)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tombolkinan)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtneasy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tombolmario)
                    .addComponent(tombolradi)
                    .addComponent(tombolkinan))
                .addGap(10, 10, 10)
                .addComponent(backbtneasy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolradiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolradiActionPerformed
        // TODO add your handling code here:
            radieasy re = new radieasy();
            re.setLocationRelativeTo(null);
            re.setVisible(true);
            this.setVisible(false);
            
        
    }//GEN-LAST:event_tombolradiActionPerformed

    private void backbtneasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtneasyActionPerformed
        // TODO add your handling code here:
            levelview lv = new levelview();
            lv.setLocationRelativeTo(null);
            lv.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_backbtneasyActionPerformed

    private void tombolmarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolmarioActionPerformed
        // TODO add your handling code here: 
            marioeasy me = new marioeasy();
            me.setLocationRelativeTo(null);
            me.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_tombolmarioActionPerformed

    private void tombolkinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkinanActionPerformed
        // TODO add your handling code here:
            kinaneasy ke = new kinaneasy();
            ke.setLocationRelativeTo(null);
            ke.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_tombolkinanActionPerformed

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
            java.util.logging.Logger.getLogger(opsieasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opsieasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opsieasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opsieasy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            opsieasy oe = new opsieasy();
            oe.setLocationRelativeTo(null);
            oe.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtneasy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton tombolkinan;
    public javax.swing.JButton tombolmario;
    public javax.swing.JButton tombolradi;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
