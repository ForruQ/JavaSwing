package com.sujon.pojo;

public class IssueBook {

    private int id;
    private int bookId;
    private int studentId;
    private String issueDate;
    private String returnDate;
    private int qty;

    public IssueBook(int id, int bookId, int studentId, String issueDate, String returnDate, int qty) {
        this.id = id;
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.qty = qty;
    }

    public IssueBook(int bookId, int studentId, String issueDate, String returnDate, int qty) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getQty() {
        return qty;
    }

}
