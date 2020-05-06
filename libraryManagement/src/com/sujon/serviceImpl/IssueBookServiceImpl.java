package com.sujon.serviceImpl;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.IssueBook;
import com.sujon.service.AdapterService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IssueBookServiceImpl extends AdapterService<IssueBook> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void creatTable() {
        String sql = "create table issue_book(id int(5) primary key auto_increment,"
                + "book_id int(5),"
                + "student_id int(5),"
                + "issue_date varchar(20),"
                + "return_date varchar(20),"
                + "qty int(5),"
                + "foreign key (book_id) references purchase(id),"
                + "foreign key (student_id) references student(id) )";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println(":::Table Created:::");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(IssueBook t) {
        String sql = "insert into issue_book(book_id, student_id, issue_date, return_date, qty) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getBookId());
            ps.setInt(2, t.getStudentId());
            ps.setString(3, t.getIssueDate());
            ps.setString(4, t.getReturnDate());
            ps.setInt(5, t.getQty());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<IssueBook> getList() {
        List<IssueBook> issueBooks = new ArrayList<>();
        String sql = "select * from issue_book";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                IssueBook issueBook = new IssueBook(rs.getInt("id"), rs.getInt("book_id"), rs.getInt("student_id"), rs.getString("issue_date"), rs.getString("return_date"), rs.getInt("qty"));
                issueBooks.add(issueBook);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return issueBooks;
    }

    @Override
    public void update(IssueBook t) {
        String sql = "update issue_book set book_id = ?, student_id =?, issue_date = ?, return_date = ?, qty =? where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getBookId());
            ps.setInt(2, t.getStudentId());
            ps.setString(3, t.getIssueDate());
            ps.setString(4, t.getReturnDate());
            ps.setInt(5, t.getQty());
            ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        String sql = "delete from issue_book where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
