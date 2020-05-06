package com.sujon.serviceImpl;


import com.sujon.connection.DbConnection;
import com.sujon.pojo.Admission;

import com.sujon.service.CommonServiceAdapter;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdmissionServiceImpl extends CommonServiceAdapter<Admission> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Admission t) {
        String sql = "insert into admission(name, cls, section, gender, birthDate, father, mother, mobile, address) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCls());
            ps.setString(3, t.getSection());
            ps.setString(4, t.getGender());
            ps.setString(5,  t.getBirthDate());
            ps.setString(6, t.getFather());
            ps.setString(7, t.getMother());
            ps.setString(8, t.getMobile());
            ps.setString(9, t.getAddress());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(AdmissionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



    @Override
    public List<Admission> getList() {
        List<Admission> admissions = new ArrayList<>();
        String sql = "select * from admission";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Admission admission = new Admission(rs.getInt("id"),rs.getString("name"), rs.getString("cls"), rs.getString("section"), rs.getString("gender"), rs.getString("birthDate"), rs.getString("father"), rs.getString("mother"), rs.getString("mobile"), rs.getString("address"));
                admissions.add(admission);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdmissionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return admissions;
    }
 
    
    @Override
    public void createTable() {
        String sql = "create table admission(id int(5) primary key auto_increment,"
                + "name varchar(30) not null,"
                + "cls varchar(15),"
                + "section varchar(10),"
                + "gender varchar(10) ,"
                + "birthDate varchar(20),"
                + "father varchar(30),"
                + "mother varchar(30),"
                + "mobile varchar(15),"
                + "address varchar(50))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Admission t) {
        String sql = "update admission set name=?, cls=?, section=?, gender=?, birthDate=?, father=?,mother=?,mobile=?, address=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCls());
            ps.setString(3, t.getSection());
            ps.setString(4, t.getGender());
            ps.setString(5,  t.getBirthDate());
            ps.setString(6, t.getFather());
            ps.setString(7, t.getMother());
            ps.setString(8, t.getMobile());
            ps.setString(9, t.getAddress());
            ps.setInt(10, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(AdmissionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void delete(int id) {
        String sql = "delete from admission where id= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(AdmissionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
@Override
    public Admission get(int id) {
        Admission admission = null;
        String sql = "select * from admission where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                admission = new Admission(rs.getInt("id"), rs.getString("name"), rs.getString("cls"), rs.getString("section"), rs.getString("gender"), rs.getString("birthDate"), rs.getString("father"), rs.getString("mother"), rs.getString("mobile"), rs.getString("address"));
                
                        }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdmissionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admission;
    }
     @Override
    public List<Admission> getListById(int id) {
         List<Admission> admissions = new ArrayList<>();
        String sql = "select * from admission where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
     
            ps.setInt(1, id);
         
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Admission admission = new Admission(rs.getInt("id"), rs.getString("name"), rs.getString("cls"), rs.getString("section"), rs.getString("gender"), rs.getString("birthDate"), rs.getString("father"), rs.getString("mother"), rs.getString("mobile"), rs.getString("address"));
                 admissions.add(admission);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClassServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return admissions;
        
    }
 
    

  

}
