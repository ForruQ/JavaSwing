package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.User;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UserServiceImpl extends AdapterService<User> {

    static Connection con = DbConnection.getInstance();

   @Override
    public void creatTable() {
        String sql = "create table user(id int(5) primary key auto_increment,"
                + "name varchar(30),"
                + "email varchar(30),"
                + "mobile varchar(15),"
                + "username varchar(30),"
                + "password varchar(30),"
                + "usertype varchar(30) )";
                
               

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(User t) {
        String sql = "insert into user( name, email, mobile, username, password, usertype) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getMobile());
            ps.setString(4, t.getUsername());
            ps.setString(5, t.getPassword());
            ps.setString(6, t.getUserType());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> getList() {
        List<User> users = new ArrayList<>();
        String sql = "select * from user";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("mobile"), rs.getString("username"), rs.getString("password"), rs.getString("usertype"));
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    @Override
    public void update(User t) {
        String sql = "update user set name = ?, email =?, mobile = ?, username = ?, password =?, usertype=? where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getMobile());
            ps.setString(4, t.getUsername());
            ps.setString(5, t.getPassword());
            ps.setString(6, t.getUserType());
            ps.setInt(7, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
     public User getUserByUsernameAndPassword(String userName, String password) {
        User user = null;
        String sql = "select * from user where username=? and password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                  user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("mobile"), rs.getString("username"), rs.getString("password"), rs.getString("usertype"));
              
            }

        } catch (SQLException ex) {
            user = null;
        }
        return user;
    }




}
