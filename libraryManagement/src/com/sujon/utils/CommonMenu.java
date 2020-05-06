package com.sujon.utils;

import com.sujon.view.AuthorView;
import com.sujon.view.BookRecieveView;
import com.sujon.view.CategoryView;
import com.sujon.view.DepartmentView;
import com.sujon.view.EditionView;
import com.sujon.view.IssueBookView;
import com.sujon.view.LogInView;
import com.sujon.view.PublisherView;
import com.sujon.view.PurchaseView;
import com.sujon.view.SessionView;
import com.sujon.view.StudentView;
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
        JMenuItem student = new JMenuItem("Student");
        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new StudentView().setVisible(true);
              f.setVisible(false);
            }
        });
        JMenuItem purchase = new JMenuItem("Purchase Book");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new PurchaseView().setVisible(true);
               f.setVisible(false);
            }
        });
        JMenuItem issueBook = new JMenuItem("Book Issue");
        issueBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new IssueBookView().setVisible(true);
              f.setVisible(false);
            }
        });
        JMenuItem bookRecieve = new JMenuItem("Recieve Book");
        bookRecieve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new BookRecieveView().setVisible(true);
               f.setVisible(false);
            }
        });
        
        file.add(student);
        file.add(purchase);
        file.add(issueBook);
        file.add(bookRecieve);
       
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
        JMenuItem category = new JMenuItem("Create Category");
        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new CategoryView().setVisible(true);
               f.setVisible(false);
            }
        });
         JMenuItem department = new JMenuItem("Create Department");
        department.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new DepartmentView().setVisible(true);
               f.setVisible(false);
            }
        });
        
         JMenuItem edition = new JMenuItem("Create Edition");
        edition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new EditionView().setVisible(true);
               f.setVisible(false);
            }
        });
        
         JMenuItem publisher = new JMenuItem("Create Publisher");
        publisher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new PublisherView().setVisible(true);
               f.setVisible(false);
            }
        });
        
         JMenuItem session = new JMenuItem("Create Session");
        session.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new SessionView().setVisible(true);
               f.setVisible(false);
            }
        });
        JMenuItem author = new JMenuItem("Create Author");
        author.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new AuthorView().setVisible(true);
               f.setVisible(false);
            }
        });
        
        setting.add(createUser);
        setting.add(department);
        setting.add(category);
        setting.add(publisher);
        setting.add(author);
        setting.add(edition);
        setting.add(session);
        menuBar.add(setting);
        
        JMenu log = new JMenu("Log");
        JMenuItem logout = new JMenuItem("Log Out");
        logout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                new LogInView().setVisible(true);
               f.setVisible(false);
            }
        });
        log.add(logout);
        menuBar.add(log);
        f.setJMenuBar(menuBar);
    }
}
