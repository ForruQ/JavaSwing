package com.sujon.serviceImpl;


import com.sujon.connection.DbConnection;
import com.sujon.pojo.Fee;
import com.sujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FeeServiceImpl extends CommonServiceAdapter<Fee> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Fee t) {
        String sql = "insert into fee(student_id, name, cls, section, year, month, amount) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, t.getStudentId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getCls());
            ps.setString(4, t.getSection());
            ps.setInt(5, t.getYear());
            ps.setInt(6, t.getMonth());
            ps.setInt(7, t.getAmount());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(FeeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Fee t) {
        String sql = "update fee set name=?,cls=?,section=?, year=?, month=?, amount=? where student_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, t.getName());
            ps.setString(2, t.getCls());
            ps.setString(3, t.getSection());
            ps.setInt(4, t.getYear());
            ps.setInt(5, t.getMonth());
            ps.setInt(6, t.getAmount());
            ps.setInt(7, t.getStudentId());
            
           
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(FeeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from fee where student_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(FeeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    
    @Override
    public List<Fee> getList() {
        List<Fee> fees = new ArrayList<>();
        String sql = "select * from fee";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Fee fee = new Fee(rs.getInt("student_id"), rs.getString("name"), rs.getString("cls"),
                        rs.getString("section"),  rs.getInt("year"), rs.getInt("month"),  rs.getInt("amount"));
                fees.add(fee);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FeeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fees;
    }

    @Override
    public void createTable() {
        String sql= "create table fee(student_id int(5),"
                + "name varchar(50),"
                + "cls varchar(50),"
                + "section varchar(50) ,"
                + "year int(50),"
                + "month int(50),"
                + "amount int(20),"
               + "FOREIGN KEY(student_id) REFERENCES Admission(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
     
}
