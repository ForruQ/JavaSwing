
package com.sujon.serviceImpl;


import com.sujon.connection.DbConnection;
import com.sujon.pojo.Author;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AuthorServiceImpl extends AdapterService<Author> {
    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
       String sql = "create table author(id int(5) primary key auto_increment,"
               + "name varchar(30) )";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(AuthorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Author t) {
       String sql = "insert into author(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(AuthorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Author> getList() {
        List<Author> authors = new ArrayList<>();
        String sql = "select * from author";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Author author = new Author(rs.getInt("id"), rs.getString("name"));
                authors.add(author);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return authors;
    }

    @Override
    public void update(Author t) {
      String sql = "update author set name = ? where id = ?";
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setInt(2, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(AuthorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }

    @Override
    public void delete(int id) {
        String sql = "delete from author where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(AuthorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
