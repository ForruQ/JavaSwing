package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.Payment;

import com.sujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentServiceImpl extends CommonServiceAdapter<Payment> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Payment t) {
        String sql = "insert into payment(id, name, address, year, month, salary) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getAddress());
            ps.setInt(4, t.getYear());
            ps.setInt(5, t.getMonth());
            ps.setInt(6, t.getSalary());

            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Payment t) {
        String sql = "update payment set name=?,address=?,year=?, month=?, salary=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getAddress());
            ps.setInt(3, t.getYear());
            ps.setInt(4, t.getMonth());
            ps.setInt(5, t.getSalary());
            ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from payment where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Payment get(int id) {
        Payment payment = null;
        String sql = "select * from payment where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                payment = new Payment(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
                        rs.getInt("year"), rs.getInt("month"),rs.getInt("salary"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return payment;
    }

    @Override
    public List<Payment> getList() {
        List<Payment> payments = new ArrayList<>();
        String sql = "select * from payment";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Payment payment = new Payment(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
                        rs.getInt("year"), rs.getInt("month"), rs.getInt("salary"));
                payments.add(payment);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return payments;
    }

    @Override
    public void createTable() {
        String sql = "create table payment(id int(5),"
                + "name varchar(50) not null,"
                + "address Varchar(100) ,"
                + "year int(20),"
                + "month int(20),"
                + "salary int(50),"
                + "FOREIGN KEY(id) REFERENCES teacher(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public List<Payment> getListById() {
        List<Payment> payments = new ArrayList<>();
        String sql = "select * from payment where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Payment payment = new Payment(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
                        rs.getInt("year"), rs.getInt("month"), rs.getInt("salary"));
                payments.add(payment);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaymentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return payments;
    }

}
