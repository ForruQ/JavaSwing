
package com.sujon.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Start extends javax.swing.JFrame {

    
    public Start() {
        initComponents();
        setLocationRelativeTo(null);
        tm.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Downloads\\Picture\\a.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 440);

        progressBar.setBackground(new java.awt.Color(204, 153, 255));
        progressBar.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(progressBar);
        progressBar.setBounds(0, 440, 720, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int i = 0;
   Timer tm = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
           progressBar.setValue(i++);
           if(i>=100){
               tm.stop();
               cls();
           }
        }
    });
   
   private void cls(){
       this.dispose();
       LogIn log = new LogIn();
       log.show();
   }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
