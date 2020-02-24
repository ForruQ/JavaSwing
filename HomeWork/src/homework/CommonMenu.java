
package homework;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {
    public static void getCommonMenu(JFrame f) {
         JMenuBar jMenuBar = new JMenuBar();
         
           JMenu dashbord = new JMenu("Dashboard");
           jMenuBar.add(dashbord);
           
          
           JMenu productCatagory = new JMenu("Product Catagory");
           jMenuBar.add(productCatagory);
        
           JMenu product = new JMenu("Product");
           jMenuBar.add(product);
           
            JMenu purchase = new JMenu("Purchase");
           jMenuBar.add(purchase);
           
           
           JMenu sales = new JMenu("Sales");
           jMenuBar.add(sales);
          
           
           
           JMenu report = new JMenu("Report");
           jMenuBar.add(report);
           
            JMenu bill = new JMenu("Billing System");
           jMenuBar.add(bill);
           
           JMenuItem dashbordO = new JMenuItem("Open");
           JMenuItem dashbordC = new JMenuItem("Close");
           JMenuItem productCatagoryO = new JMenuItem("Open");
           JMenuItem productCatagoryC = new JMenuItem("Close");
           JMenuItem productO = new JMenuItem("Open");
           JMenuItem productC = new JMenuItem("Close");
           JMenuItem purchaseO = new JMenuItem("Open");
           JMenuItem purchaseC = new JMenuItem("Close");
           JMenuItem salesO = new JMenuItem("Open");
           JMenuItem salesC = new JMenuItem("Close");
           JMenuItem reportO = new JMenuItem("Open");
           JMenuItem reportC = new JMenuItem("Close");
            JMenuItem billO = new JMenuItem("Open");
            JMenuItem billC = new JMenuItem("Close");
           
        
           
            dashbordO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoard().setVisible(true);
            }
        });
            dashbordC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
            
             productO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Product().setVisible(true);
            }
        });
            productC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
             purchaseO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Purchase().setVisible(true);
            }
        });
            purchaseC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
            salesO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Sales().setVisible(true);
            }
        });
           salesC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
             reportO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Report().setVisible(true);
            }
        });
            reportC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
             productCatagoryO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductCatagory().setVisible(true);
            }
        });
            productCatagoryC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
            
             billO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new BillingSystem().setVisible(true);
            }
        });
            billC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogInPage().setVisible(true);
            }
        });
           
            dashbord.add(dashbordO);
           dashbord.add(dashbordC);
           productCatagory.add(productCatagoryO);
           productCatagory.add(productCatagoryC);
           product.add(productO);
           product.add(productC);
           purchase.add(purchaseO);
           purchase.add(purchaseC);
           sales.add(salesO);
           sales.add(salesC);
           report.add(reportO);
           report.add(reportC);
           bill.add(billO);
           bill.add(billC);
 
      
        f.setJMenuBar(jMenuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
