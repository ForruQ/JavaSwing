
package com.sujon.serviceImpl;


import com.sujon.connection.DbConnection;
import com.sujon.pojo.Author;
import com.sujon.pojo.Category;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CategoryServiceImpl extends AdapterService<Category> {
    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
       String sql = "create table category(id int(5) primary key auto_increment,"
               + "name varchar(30) )";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Category t) {
       String sql = "insert into category(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Category> getList() {
        List<Category> categorys = new ArrayList<>();
        String sql = "select * from category";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Category category = new Category(rs.getInt("id"), rs.getString("name"));
                categorys.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return categorys;
    }

    @Override
    public void update(Category t) {
      String sql = "update category set name = ? where id = ?";
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setInt(2, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }

    @Override
    public void delete(int id) {
        String sql = "delete from category where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
