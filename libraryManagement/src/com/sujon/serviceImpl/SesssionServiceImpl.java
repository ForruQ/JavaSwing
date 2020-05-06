
package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.Session;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;





public class SesssionServiceImpl extends AdapterService<Session> {
    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
       String sql = "create table session(id int(5) primary key auto_increment,"
               + "name varchar(30) )";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(SesssionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Session t) {
       String sql = "insert into session(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(SesssionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Session> getList() {
        List<Session> sessions = new ArrayList<>();
        String sql = "select * from session";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Session session = new Session(rs.getInt("id"), rs.getString("name"));
                sessions.add(session);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SesssionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return sessions;
    }

    @Override
    public void update(Session t) {
      String sql = "update session set name = ? where id = ?";
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setInt(2, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(SesssionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }

    @Override
    public void delete(int id) {
        String sql = "delete from session where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(SesssionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
