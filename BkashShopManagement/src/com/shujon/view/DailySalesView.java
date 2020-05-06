package com.shujon.view;

import com.shujon.pojo.DailySales;
import com.shujon.pojo.Sales;
import com.shujon.service.CommonServiceAdapter;
import com.shujon.serviceImpl.DailySalesServiceImpl;
import com.shujon.serviceImpl.SalesServiceImpl;
import java.security.Timestamp;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

public class DailySalesView extends javax.swing.JFrame {

    CommonServiceAdapter commonService = new SalesServiceImpl();
    CommonServiceAdapter dailySales = new DailySalesServiceImpl();
    DailySalesServiceImpl dd = new DailySalesServiceImpl();

    public DailySalesView() {
        initComponents();
        setlastDate();
        txtLastSales.setText(String.valueOf(lastSales()));
    }

    public double lastSales() {
        double lastSales;
        try {
            List<DailySales> list = dailySales.getList();
            int i;
            for (i = 0; i < list.size() - 1; i++) {
            }
            lastSales = list.get(i).getTotalSales();
        } catch (Exception e) {
            lastSales = 0;
        }
        return lastSales;
    }

    public void setlastDate() {
        try {
            List<DailySales> list = dailySales.getList();
            int i;
            for (i = 0; i < list.size() - 1; i++) {
            }
            String lastDate = list.get(i).getShowDate().toLocalDate().toString();
            txtShowDate.setText(lastDate);
        } catch (Exception e) {

        }
    }

    public void setTodaysSales() {
        double total = total();
        double lastSales = lastSales();
        double todaysSales = total - lastSales;
    }

    public double total() {
        List<Sales> list = commonService.getList();
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            double totalPrice = list.get(i).getTotalPrice();
            sum += totalPrice;
        }
        return sum;
    }

    public void todaysSales() {
        double totalSales = total();
        double lastSales = lastSales();
        double todaysSales = totalSales - lastSales;
        try {
            txtTodaysSales.setText(String.valueOf(todaysSales));

        } catch (NullPointerException e) {
            txtTodaysSales.setText(String.valueOf(totalSales));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtLastSales = new javax.swing.JTextField();
        txtTodaysSales = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalSales = new javax.swing.JTextField();
        txtShowDate = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 180));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Daily Sales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 50, 552, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Last Update");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 115, -1, -1));

        txtLastSales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLastSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastSalesActionPerformed(evt);
            }
        });
        txtLastSales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastSalesKeyReleased(evt);
            }
        });
        getContentPane().add(txtLastSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 153, 344, -1));

        txtTodaysSales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTodaysSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTodaysSalesActionPerformed(evt);
            }
        });
        txtTodaysSales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTodaysSalesKeyReleased(evt);
            }
        });
        getContentPane().add(txtTodaysSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 194, 344, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 367, 552, 10));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 395, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 395, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 395, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Last Sales");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 156, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Todays Sales");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 197, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Total Sales");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 247, -1, -1));

        txtTotalSales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalSalesActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 244, 344, -1));

        txtShowDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtShowDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShowDateActionPerformed(evt);
            }
        });
        txtShowDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtShowDateKeyReleased(evt);
            }
        });
        getContentPane().add(txtShowDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 112, 344, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastSalesActionPerformed

    private void txtTotalSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalSalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        todaysSales();
        txtTotalSales.setText(String.valueOf(total()));
       
        double tot = lastSales();
        if(txtTotalSales.getText().equalsIgnoreCase(String.valueOf(tot))) {
            JOptionPane.showMessageDialog(null, "Already Updated");
        } else{
        DailySales sales = new DailySales(LocalDateTime.now(), Double.parseDouble(txtLastSales.getText()),
                Double.parseDouble(txtTodaysSales.getText()), Double.parseDouble(txtTotalSales.getText()));
        dailySales.save(sales);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLastSalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastSalesKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtLastSalesKeyReleased

    private void txtTodaysSalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTodaysSalesKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTodaysSalesKeyReleased

    private void txtTodaysSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTodaysSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTodaysSalesActionPerformed

    private void txtShowDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShowDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShowDateActionPerformed

    private void txtShowDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtShowDateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShowDateKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailySalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailySalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtLastSales;
    private javax.swing.JTextField txtShowDate;
    private javax.swing.JTextField txtTodaysSales;
    private javax.swing.JTextField txtTotalSales;
    // End of variables declaration//GEN-END:variables
}
