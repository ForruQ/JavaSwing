package com.sujon.serviceImpl;


import com.sujon.connection.DbConnection;
import com.sujon.pojo.Classes;
import com.sujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassServiceImpl extends CommonServiceAdapter<Classes> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Classes t) {
        String sql = "insert into classes( name, section) values(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getSection());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Classes t) {
        String sql = "update classes set name =?, section=? where id =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getSection());
            ps.setInt(3, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public Classes get(int id) {
        Classes cls = null;
        String sql = "select * from classes where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cls = new Classes(rs.getInt("id"), rs.getString("name"),rs.getString("section"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cls;
    }
    
    @Override
    public List<Classes> getList() {
        List<Classes> classes = new ArrayList<>();
        String sql = "select * from classes";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Classes cls = new Classes(rs.getInt("id"), rs.getString("name"),  rs.getString("section"));
                classes.add(cls);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return classes;
    }

    @Override
    public void createTable() {
        String sql= "create table classes(id int(5) primary key auto_increment,"
                + "name varchar(50) not null,"
                + "section varchar(50) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Classes getByName(String name) {
         Classes section = null;
        String sql = "select * from classes where name=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                section = new Classes(rs.getInt("id"), rs.getString("name"),rs.getString("section"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return section;
      
    }

    @Override
    public List<Classes> getListByName(String name) {
         List<Classes> classes = new ArrayList<>();
        String sql = "select * from classes where name = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
     
            ps.setString(1, name);
         
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Classes cls = new Classes( rs.getInt("id"), rs.getString("name"), rs.getString("section"));
                classes.add(cls);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return classes;
        
    }
 
    


}
