
package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.Purchase;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class PurchaseServiceImpl extends AdapterService<Purchase> {
    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
       String sql = "create table purchase(id int(5) primary key auto_increment,"
               + "name varchar(30),"
               + "author varchar(30),"
               + "publisher varchar(30),"
               + "edition varchar(30),"
               + "unit_price double,"
               + "qty int(10),"
               + "total_price double,"
               + "rack_no varchar(30),"
               + "category varchar(30),"
               + "purchase_date varchar(30))";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Purchase t) {
       String sql = "insert into purchase(name, author, publisher, edition, unit_price, qty, total_price, rack_no, category, purchase_Date) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getAuthor());
            ps.setString(3, t.getPublisher());
            ps.setString(4, t.getEdition());
            ps.setDouble(5, t.getUnitPrice());
            ps.setInt(6, t.getQty());
            ps.setDouble(7, t.getTotalPrice());
            ps.setString(8, t.getRackNo());
            ps.setString(9, t.getCategory());
            ps.setString(10, t.getPurchaseDate());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Purchase> getList() {
        List<Purchase> purchases = new ArrayList<>();
        String sql = "select * from purchase";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Purchase purchase = new Purchase(rs.getInt("id"), rs.getString("name"), rs.getString("author"),rs.getString("publisher"), rs.getString("edition"), rs.getDouble("unit_price"), rs.getInt("qty"),rs.getDouble("total_price"), rs.getString("rack_no"),rs.getString("category"), rs.getString("purchase_date"));
                purchases.add(purchase);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return purchases;
    }

    @Override
    public void update(Purchase t) {
      String sql = "update purchase set name = ?, author =?, publisher = ?, edition = ?, unit_price =?, qty = ?, total_price= ?, rack_no=?, category=?, purchase_date = ? where id = ?";
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, t.getName());
            ps.setString(2, t.getAuthor());
            ps.setString(3, t.getPublisher());
            ps.setString(4, t.getEdition());
            ps.setDouble(5, t.getUnitPrice());
            ps.setInt(6, t.getQty());
            ps.setDouble(7, t.getTotalPrice());
            ps.setString(8, t.getRackNo());
            ps.setString(9, t.getCategory());
            ps.setString(10, t.getPurchaseDate());
            ps.setInt(11, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }

    @Override
    public void delete(int id) {
        String sql = "delete from purchase where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
