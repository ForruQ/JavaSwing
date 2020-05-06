package com.sujon.serviceImpl;


import com.sujon.connection.DbConnection;
import com.sujon.pojo.Teacher;
import com.sujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeacherServiceImpl extends CommonServiceAdapter<Teacher> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Teacher t) {
        String sql = "insert into teacher(name, salary, mobile, address) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setInt(2, t.getSalary());
            ps.setString(3, t.getMobile());
            ps.setString(4, t.getAddress());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Teacher t) {
        String sql = "update teacher set name=?,salary=?,mobile=?, address=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setInt(2, t.getSalary());
            ps.setString(3, t.getMobile());
            ps.setString(4, t.getAddress());
            ps.setInt(5, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from teacher where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Teacher get(int id) {
        Teacher teacher = null;
        String sql = "select * from teacher where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                teacher = new Teacher(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"),
                        rs.getString("mobile"), rs.getString("address"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacher;
    }
    
    @Override
    public List<Teacher> getList() {
        List<Teacher> teachers = new ArrayList<>();
        String sql = "select * from teacher";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Teacher teacher = new Teacher(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"),
                        rs.getString("mobile"),  rs.getString("address"));
                teachers.add(teacher);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return teachers;
    }

    @Override
    public void createTable() {
        String sql= "create table teacher(id int(5) primary key auto_increment,"
                + "name varchar(50) not null,"
                + "salary int(20) ,"
                + "mobile varchar(50),"
                + "address varchar(500))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    @Override
    public List<Teacher> getListById(int id) {
        List<Teacher> teachers = new ArrayList<>();
        String sql = "select * from teacher where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Teacher teacher = new Teacher(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"),
                        rs.getString("mobile"),  rs.getString("address"));
                teachers.add(teacher);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TeacherServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return teachers;
    }
     

}
