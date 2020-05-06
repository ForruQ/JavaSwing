package com.sujon.utils;


import com.sujon.view.AdmissionView;
import com.sujon.view.ClassesView;
import com.sujon.view.FeeView;
import com.sujon.view.PaymentView;
import com.sujon.view.TeacherView;
import com.sujon.view.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {
    
    public void getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
      
        
        JMenu file = new JMenu("File");
        JMenuItem admission = new JMenuItem("Admission");
        admission.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new AdmissionView().setVisible(true);
              f.setVisible(false);
            }
        });
        JMenuItem teacher = new JMenuItem("Teacher");
        teacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new TeacherView().setVisible(true);
               f.setVisible(false);
            }
        });
        JMenuItem fee = new JMenuItem("Fee");
        fee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new FeeView().setVisible(true);
              f.setVisible(false);
            }
        });
        JMenuItem payment = new JMenuItem("Payment");
        payment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new PaymentView().setVisible(true);
               f.setVisible(false);
            }
        });
        
        file.add(admission);
        file.add(teacher);
        file.add(fee);
        file.add(payment);
       
        menuBar.add(file);
        
          JMenu setting = new JMenu("Settings");
        JMenuItem createUser = new JMenuItem("Create User");
        createUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new UserView().setVisible(true);
               f.setVisible(false);
            }
        });
        JMenuItem cls = new JMenuItem("Create Class");
        cls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new ClassesView().setVisible(true);
               f.setVisible(false);
            }
        });
        
        setting.add(createUser);
        setting.add(cls);
        menuBar.add(setting);
        
        JMenu log = new JMenu("Log");
        JMenuItem logout = new JMenuItem("Log Out");
        logout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               f.setVisible(false);
            }
        });
        log.add(logout);
        menuBar.add(log);
        f.setJMenuBar(menuBar);
    }
}
