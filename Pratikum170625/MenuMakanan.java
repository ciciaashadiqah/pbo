/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum170625;

/**
 *
 * @author asiah
 */
public class MenuMakanan extends javax.swing.JFrame {

    private MenuUtama utama;
    
    public MenuMakanan() {
        initComponents();
    }
    
    public MenuMakanan(MenuUtama Utama)
    {
        this.utama = Utama;
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

        jLabel1 = new javax.swing.JLabel();
        chkNasgor = new javax.swing.JCheckBox();
        chkMigor = new javax.swing.JCheckBox();
        chkSate = new javax.swing.JCheckBox();
        chkSoto = new javax.swing.JCheckBox();
        txtNasgor = new javax.swing.JTextField();
        txtMigor = new javax.swing.JTextField();
        txtSate = new javax.swing.JTextField();
        txtSoto = new javax.swing.JTextField();
        cbNasgor = new javax.swing.JComboBox<>();
        totalNasgor = new javax.swing.JTextField();
        totalMigor = new javax.swing.JTextField();
        totalSate = new javax.swing.JTextField();
        totalSoto = new javax.swing.JTextField();
        cbMigor = new javax.swing.JComboBox<>();
        cbSate = new javax.swing.JComboBox<>();
        cbSoto = new javax.swing.JComboBox<>();
        btnTotalMakanan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        totalMakanan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MENU MAKANAN");

        chkNasgor.setText("Nasi Goreng");
        chkNasgor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNasgorActionPerformed(evt);
            }
        });

        chkMigor.setText("Mie Goreng");
        chkMigor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMigorActionPerformed(evt);
            }
        });

        chkSate.setText("Sate");
        chkSate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSateActionPerformed(evt);
            }
        });

        chkSoto.setText("Soto");
        chkSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSotoActionPerformed(evt);
            }
        });

        txtNasgor.setText(" ");
        txtNasgor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNasgorActionPerformed(evt);
            }
        });

        txtMigor.setText(" ");

        txtSate.setText(" ");

        txtSoto.setText(" ");

        cbNasgor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbNasgor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNasgorActionPerformed(evt);
            }
        });

        totalNasgor.setText("0");
        totalNasgor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalNasgorActionPerformed(evt);
            }
        });

        totalMigor.setText("0");

        totalSate.setText("0");
        totalSate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSateActionPerformed(evt);
            }
        });

        totalSoto.setText("0");

        cbMigor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbMigor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMigorActionPerformed(evt);
            }
        });

        cbSate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbSate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSateActionPerformed(evt);
            }
        });

        cbSoto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        btnTotalMakanan.setText("Total");
        btnTotalMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalMakananActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali ke Menu Utama");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        totalMakanan.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkNasgor)
                                    .addComponent(chkMigor)
                                    .addComponent(chkSate)
                                    .addComponent(chkSoto))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMigor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnKembali))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTotalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbSate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalSate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbMigor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalMigor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(totalNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNasgor)
                    .addComponent(txtNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMigor)
                    .addComponent(txtMigor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalMigor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMigor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSate)
                    .addComponent(txtSate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalSate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSoto)
                    .addComponent(txtSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalMakanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMigorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMigorActionPerformed
        txtMigor.setText("12500");
    }//GEN-LAST:event_chkMigorActionPerformed

    private void chkNasgorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNasgorActionPerformed
        txtNasgor.setText("15000");
    }//GEN-LAST:event_chkNasgorActionPerformed

    private void chkSateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSateActionPerformed
        txtSate.setText("18000");
    }//GEN-LAST:event_chkSateActionPerformed

    private void chkSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSotoActionPerformed
        txtSoto.setText("10000");
    }//GEN-LAST:event_chkSotoActionPerformed

    private void cbNasgorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNasgorActionPerformed
        int jml = (int)cbNasgor.getSelectedIndex();
        double harga = Double.parseDouble(txtNasgor.getText());
        double total = jml*harga;
        totalNasgor.setText(Double.toString(total));
    }//GEN-LAST:event_cbNasgorActionPerformed

    private void totalNasgorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalNasgorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalNasgorActionPerformed

    private void cbMigorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMigorActionPerformed
        int jml = (int)cbMigor.getSelectedIndex();
        double harga = Double.parseDouble(txtMigor.getText());
        double total = jml*harga;
        totalMigor.setText(Double.toString(total));
    }//GEN-LAST:event_cbMigorActionPerformed

    private void cbSateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSateActionPerformed
        int jml = (int)cbSate.getSelectedIndex();
        double harga = Double.parseDouble(txtSate.getText());
        double total = jml*harga;
        totalSate.setText(Double.toString(total));
    }//GEN-LAST:event_cbSateActionPerformed

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        int jml = (int)cbSoto.getSelectedIndex();
        double harga = Double.parseDouble(txtSoto.getText());
        double total = jml*harga;
        totalSoto.setText(Double.toString(total));
    }//GEN-LAST:event_cbSotoActionPerformed

    private void txtNasgorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNasgorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNasgorActionPerformed

    private void btnTotalMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalMakananActionPerformed
        double nasgor = Double.parseDouble(totalNasgor.getText());
        double migor = Double.parseDouble(totalMigor.getText());
        double sate = Double.parseDouble(totalSate.getText());
        double soto = Double.parseDouble(totalSoto.getText());
        double total = nasgor + migor + sate + soto;
        totalMakanan.setText(String.valueOf(total));
    }//GEN-LAST:event_btnTotalMakananActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        String total = totalMakanan.getText();
        utama.setTotalMakanan(total);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void totalSateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSateActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTotalMakanan;
    private javax.swing.JComboBox<String> cbMigor;
    private javax.swing.JComboBox<String> cbNasgor;
    private javax.swing.JComboBox<String> cbSate;
    private javax.swing.JComboBox<String> cbSoto;
    private javax.swing.JCheckBox chkMigor;
    private javax.swing.JCheckBox chkNasgor;
    private javax.swing.JCheckBox chkSate;
    private javax.swing.JCheckBox chkSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField totalMakanan;
    private javax.swing.JTextField totalMigor;
    private javax.swing.JTextField totalNasgor;
    private javax.swing.JTextField totalSate;
    private javax.swing.JTextField totalSoto;
    private javax.swing.JTextField txtMigor;
    private javax.swing.JTextField txtNasgor;
    private javax.swing.JTextField txtSate;
    private javax.swing.JTextField txtSoto;
    // End of variables declaration//GEN-END:variables
}
