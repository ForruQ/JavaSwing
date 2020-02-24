
package homework;


public class BillingSystem extends javax.swing.JFrame {
    String operations;
    String answers;
    double firstNum, secondNum, result;
    
    public BillingSystem() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        bmultiply = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        bans = new javax.swing.JButton();
        bdevide = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 360));
        jPanel1.setLayout(null);

        txtDisplay.setEditable(false);
        txtDisplay.setBackground(new java.awt.Color(153, 255, 204));
        txtDisplay.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(txtDisplay);
        txtDisplay.setBounds(10, 0, 310, 40);

        b8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b8.setText("8");
        b8.setPreferredSize(new java.awt.Dimension(60, 50));
        b8.setVerifyInputWhenFocusTarget(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(100, 50, 60, 50);

        b7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b7.setText("7");
        b7.setPreferredSize(new java.awt.Dimension(60, 50));
        b7.setVerifyInputWhenFocusTarget(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(10, 50, 60, 50);

        badd.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        badd.setText("+");
        badd.setPreferredSize(new java.awt.Dimension(60, 50));
        badd.setVerifyInputWhenFocusTarget(false);
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        jPanel1.add(badd);
        badd.setBounds(260, 50, 60, 50);

        b9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(60, 50));
        b9.setVerifyInputWhenFocusTarget(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(180, 50, 60, 50);

        b4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b4.setText("4");
        b4.setPreferredSize(new java.awt.Dimension(60, 50));
        b4.setVerifyInputWhenFocusTarget(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(10, 110, 60, 50);

        b5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b5.setText("5");
        b5.setPreferredSize(new java.awt.Dimension(60, 50));
        b5.setVerifyInputWhenFocusTarget(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(100, 110, 60, 50);

        b6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b6.setText("6");
        b6.setPreferredSize(new java.awt.Dimension(60, 50));
        b6.setVerifyInputWhenFocusTarget(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(180, 110, 60, 50);

        bminus.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bminus.setText("-");
        bminus.setPreferredSize(new java.awt.Dimension(60, 50));
        bminus.setVerifyInputWhenFocusTarget(false);
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });
        jPanel1.add(bminus);
        bminus.setBounds(260, 110, 60, 50);

        bmultiply.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bmultiply.setText("*");
        bmultiply.setPreferredSize(new java.awt.Dimension(60, 50));
        bmultiply.setVerifyInputWhenFocusTarget(false);
        bmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(bmultiply);
        bmultiply.setBounds(260, 170, 60, 50);

        b2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b2.setText("2");
        b2.setPreferredSize(new java.awt.Dimension(60, 50));
        b2.setVerifyInputWhenFocusTarget(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(100, 170, 60, 50);

        b3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b3.setText("3");
        b3.setPreferredSize(new java.awt.Dimension(60, 50));
        b3.setVerifyInputWhenFocusTarget(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(180, 170, 60, 50);

        b1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b1.setText("1");
        b1.setPreferredSize(new java.awt.Dimension(60, 50));
        b1.setVerifyInputWhenFocusTarget(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(10, 170, 60, 50);

        bmod.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bmod.setText("%");
        bmod.setPreferredSize(new java.awt.Dimension(60, 50));
        bmod.setVerifyInputWhenFocusTarget(false);
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });
        jPanel1.add(bmod);
        bmod.setBounds(180, 230, 60, 50);

        bans.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bans.setText("=");
        bans.setPreferredSize(new java.awt.Dimension(60, 50));
        bans.setVerifyInputWhenFocusTarget(false);
        bans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bansActionPerformed(evt);
            }
        });
        jPanel1.add(bans);
        bans.setBounds(200, 300, 110, 50);

        bdevide.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bdevide.setText("/");
        bdevide.setPreferredSize(new java.awt.Dimension(60, 50));
        bdevide.setVerifyInputWhenFocusTarget(false);
        bdevide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdevideActionPerformed(evt);
            }
        });
        jPanel1.add(bdevide);
        bdevide.setBounds(260, 230, 60, 50);

        bdot.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bdot.setText(".");
        bdot.setPreferredSize(new java.awt.Dimension(60, 50));
        bdot.setVerifyInputWhenFocusTarget(false);
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });
        jPanel1.add(bdot);
        bdot.setBounds(100, 230, 60, 50);

        b0.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b0.setText("0");
        b0.setPreferredSize(new java.awt.Dimension(60, 50));
        b0.setVerifyInputWhenFocusTarget(false);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(10, 230, 60, 50);

        bce.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bce.setText("CE");
        bce.setPreferredSize(new java.awt.Dimension(60, 50));
        bce.setVerifyInputWhenFocusTarget(false);
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });
        jPanel1.add(bce);
        bce.setBounds(20, 300, 100, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 330, 360);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 370));
        jPanel2.setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox1.setText("Burger");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(30, 220, 125, 53);

        jCheckBox2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox2.setText("Fruits");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(30, 10, 110, 53);

        jCheckBox3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox3.setText("Pizza");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3);
        jCheckBox3.setBounds(30, 60, 99, 53);

        jCheckBox4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox4.setText("Chicken");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4);
        jCheckBox4.setBounds(30, 110, 141, 53);

        jCheckBox5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jCheckBox5.setText("Beef");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox5);
        jCheckBox5.setBounds(30, 160, 93, 53);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 220, 90, 36);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(200, 20, 90, 36);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(200, 70, 90, 36);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(200, 120, 90, 36);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(200, 170, 90, 36);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 330));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Total cost of items");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(40, 10, 190, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Total Delivery cost");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 70, 184, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Total cost of Mileage");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 130, 208, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("CGST");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 180, 51, 30);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jPanel3.add(jTextField7);
        jTextField7.setBounds(430, 70, 170, 36);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jPanel3.add(jTextField8);
        jTextField8.setBounds(430, 120, 170, 36);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jPanel3.add(jTextField6);
        jTextField6.setBounds(430, 10, 170, 36);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jPanel3.add(jTextField10);
        jTextField10.setBounds(430, 240, 170, 36);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jPanel3.add(jTextField9);
        jTextField9.setBounds(430, 180, 170, 36);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("SGST");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 240, 49, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(300, 20, 630, 330);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(340, 80, 930, 370);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setMinimumSize(new java.awt.Dimension(1250, 170));
        jPanel4.setPreferredSize(new java.awt.Dimension(1250, 150));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Total Amount");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(40, 100, 138, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("Sub Total");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(40, 0, 93, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("Tax");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 50, 35, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("$ 0.00");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField11);
        jTextField11.setBounds(360, 0, 200, 40);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("$ 0.00");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField12);
        jTextField12.setBounds(360, 50, 200, 40);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("$ 0.00");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField13);
        jTextField13.setBounds(360, 100, 200, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(780, 10, 190, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(780, 80, 190, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 450, 1270, 150);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel9.setText("Online Billing System");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(480, 10, 430, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1310, 70);

        pack();
    }// </editor-fold>                        

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b3.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {                                    
      txtDisplay.setText("");
    }                                   

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       String enterNumber = txtDisplay.getText() + b0.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b1.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b2.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b4.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       String enterNumber = txtDisplay.getText() + b5.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b6.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      String enterNumber = txtDisplay.getText() + b7.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b8.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        String enterNumber = txtDisplay.getText() + b9.getText();
       txtDisplay.setText(enterNumber);
    }                                  

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {                                     
       if(! txtDisplay.getText().contains(".")) {
           String enterNumber = txtDisplay.getText() + bdot.getText();
       txtDisplay.setText(enterNumber);
       }
    }                                    

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {                                     
       firstNum = Double.parseDouble(txtDisplay.getText());
       txtDisplay.setText("");
       operations = "+";
    }                                    

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstNum = Double.parseDouble(txtDisplay.getText());
       txtDisplay.setText("");
       operations = "-";
    }                                      

    private void bmultiplyActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstNum = Double.parseDouble(txtDisplay.getText());
       txtDisplay.setText("");
       operations = "*";
    }                                         

    private void bdevideActionPerformed(java.awt.event.ActionEvent evt) {                                        
       firstNum = Double.parseDouble(txtDisplay.getText());
       txtDisplay.setText("");
       operations = "/";
    }                                       

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {                                     
       firstNum = Double.parseDouble(txtDisplay.getText());
       txtDisplay.setText("");
       operations = "%";
    }                                    

    private void bansActionPerformed(java.awt.event.ActionEvent evt) {                                     
        secondNum = Double.parseDouble(txtDisplay.getText());
        if(operations == "+") {
            result= firstNum + secondNum;
            answers = String.format("%.2f", result);
            txtDisplay.setText(answers);
        } else if(operations == "-") {
            result= firstNum - secondNum;
            answers = String.format("%.2f", result);
            txtDisplay.setText(answers);
        } else if(operations == "*") {
            result= firstNum * secondNum;
            answers = String.format("%.2f", result);
            txtDisplay.setText(answers);
        } else if(operations == "/") {
            result= firstNum / secondNum;
            answers = String.format("%.2f", result);
            txtDisplay.setText(answers);
        } else {
            result= firstNum % secondNum;
            answers = String.format("%.2f", result);
            txtDisplay.setText(answers);
        }
    }                                    

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
         if(jCheckBox1.isSelected()) {
           jTextField1.setEditable(true);
           jTextField1.setText("");
           jTextField1.requestFocus();
           
       }
       else {
           jTextField1.setEditable(false);
           jTextField1.setText("0");
       }
    }                                          

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       if(jCheckBox2.isSelected()) {
           jTextField2.setEditable(true);
           jTextField2.setText("");
           jTextField2.requestFocus();
           
       }
       else {
           jTextField2.setEditable(false);
           jTextField2.setText("0");
       }
    }                                          

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(jCheckBox3.isSelected()) {
           jTextField3.setEditable(true);
           jTextField3.setText("");
           jTextField3.requestFocus();
           
       }
       else {
           jTextField3.setEditable(false);
           jTextField3.setText("0");
       }
    }                                          

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(jCheckBox4.isSelected()) {
           jTextField4.setEditable(true);
           jTextField4.setText("");
           jTextField4.requestFocus();
           
       }
       else {
           jTextField4.setEditable(false);
           jTextField4.setText("0");
       }
    }                                          

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(jCheckBox5.isSelected()) {
           jTextField5.setEditable(true);
           jTextField5.setText("");
           jTextField5.requestFocus();
           
       }
       else {
           jTextField5.setEditable(false);
           jTextField5.setText("0");
       }
    }                                          

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       txtDisplay.setText("");
       jTextField1.setText("0");
       jTextField2.setText("0");
       jTextField3.setText("0");
       jTextField4.setText("0");
       jTextField5.setText("0");
       jTextField6.setText("0");
       jTextField7.setText("0");
       jTextField8.setText("0");
       jTextField9.setText("0");
       jTextField10.setText("0");
       jTextField11.setText("$ 0.00");
       jTextField12.setText("$ 0.00");
       jTextField13.setText("$ 0.00");
       
       jCheckBox1.setSelected(false);
       jCheckBox2.setSelected(false);
       jCheckBox3.setSelected(false);
       jCheckBox4.setSelected(false);
       jCheckBox5.setSelected(false);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if((jCheckBox1.isSelected()) || (jCheckBox2.isSelected()) || (jCheckBox3.isSelected()) || (jCheckBox4.isSelected()) || (jCheckBox5.isSelected()) ) {
            double f =Double.parseDouble(jTextField2.getText()) * 100;
            double p =Double.parseDouble(jTextField3.getText()) * 300;
            double c =Double.parseDouble(jTextField4.getText()) * 50;
            double b =Double.parseDouble(jTextField5.getText()) * 500;
            double bu =Double.parseDouble(jTextField1.getText()) * 150;

            double totalItem = f + p + c + b + bu;
            double del = totalItem * 5/100;
            double mile = del * 50/100;

            double subTotal = totalItem + del + mile;
            double cgst = subTotal * 9/100;
            double sgst = cgst;

            double  tax = cgst + sgst;

            double amount = subTotal + tax;

            String item = String.format("%.2f", totalItem);
            jTextField6.setText((String)item);

            String d = String.format("%.2f", del);
            jTextField7.setText((String)d);

            String mil = String.format("%.2f", mile);
            jTextField8.setText((String)mil);

            String cg = String.format("%.2f", cgst);
            jTextField9.setText((String) cg);

            String s = String.format("%.2f", sgst);
            jTextField10.setText((String) s);

            String sub = String.format("%.2f", subTotal);
            jTextField11.setText((String) sub);

            String t = String.format("%.2f", tax);
            jTextField12.setText((String) t);

            String total = String.format("%.2f", amount);
            jTextField13.setText((String) total);

        } else {
            txtDisplay.setText("Enter choice");
        }
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

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
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bans;
    private javax.swing.JButton bce;
    private javax.swing.JButton bdevide;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmultiply;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration                   
}
