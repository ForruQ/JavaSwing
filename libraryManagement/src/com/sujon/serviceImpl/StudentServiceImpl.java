
package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.Student;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;






public class StudentServiceImpl extends AdapterService<Student> {
    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
       String sql = "create table student(id int(5) primary key auto_increment,"
               + "name varchar(30),"
               + "roll varchar(30),"
               + "department varchar(30),"
               + "shift varchar(30),"
               + "house_no varchar(30),"
               + "road_no varchar(30),"
               + "block varchar(30),"
               + "thana varchar(30),"
               + "district varchar(30),"
               + "division varchar(30),"
               + "country varchar(30))";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Student t) {
       String sql = "insert into student(name, roll, department, shift, house_no, road_no, block, thana, district, division, country) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getRoll());
            ps.setString(3, t.getDepartment());
            ps.setString(4, t.getShift());
            ps.setString(5, t.getHouseNo());
            ps.setString(6, t.getRoadNo());
            ps.setString(7, t.getBlockOrVillage());
            ps.setString(8, t.getThana());
            ps.setString(9, t.getDistrict());
            ps.setString(10, t.getDivision());
            ps.setString(11, t.getCountry());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Student> getList() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from student";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Student student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("roll"),rs.getString("department"), rs.getString("shift"), rs.getString("house_no"), rs.getString("road_no"),rs.getString("block"), rs.getString("thana"),rs.getString("district"), rs.getString("division"), rs.getString("country"));
                students.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return students;
    }

    @Override
    public void update(Student t) {
      String sql = "update student set name = ?, roll =?, department = ?, shift = ?, house_no =?, road_no = ?, block= ?, thana=?, district=?, division = ?, country= ? where id = ?";
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, t.getName());
            ps.setString(2, t.getRoll());
            ps.setString(3, t.getDepartment());
            ps.setString(4, t.getShift());
            ps.setString(5, t.getHouseNo());
            ps.setString(6, t.getRoadNo());
            ps.setString(7, t.getBlockOrVillage());
            ps.setString(8, t.getThana());
            ps.setString(9, t.getDistrict());
            ps.setString(10, t.getDivision());
            ps.setString(11, t.getCountry());
            ps.setInt(12, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }

    @Override
    public void delete(int id) {
        String sql = "delete from student where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
