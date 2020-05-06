package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.BookRecieve;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BookRecieveServiceImpl extends AdapterService<BookRecieve> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
        String sql = "create table book_recieve(id int(5) primary key auto_increment,"
                + "book_id int(5),"
                + "student_id int(5),"
                + "return_date varchar(20),"
                + "qty int(5),"
                + "foreign key (book_id) references purchase(id),"
                + "foreign key (student_id) references student(id) )";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(BookRecieveServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(BookRecieve t) {
        String sql = "insert into book_recieve(book_id, student_id, return_date, qty) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getBookId());
            ps.setInt(2, t.getStudentId());
            ps.setString(3, t.getReturnDate());
            ps.setInt(4, t.getQty());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(BookRecieveServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookRecieve> getList() {
        List<BookRecieve> bookRecieves = new ArrayList<>();
        String sql = "select * from book_recieve";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookRecieve bookRecieve = new BookRecieve(rs.getInt("id"), rs.getInt("book_id"), rs.getInt("student_id"), rs.getString("return_date"), rs.getInt("qty"));
                bookRecieves.add(bookRecieve);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRecieveServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookRecieves;
    }

    @Override
    public void update(BookRecieve t) {
        String sql = "update book_recieve set book_id = ?, student_id =?, return_date = ?, qty =? where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getBookId());
            ps.setInt(2, t.getStudentId());
            ps.setString(3, t.getReturnDate());
            ps.setInt(4, t.getQty());
            ps.setInt(5, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(BookRecieveServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        String sql = "delete from book_recieve where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(BookRecieveServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
