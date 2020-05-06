package com.sujon.pojo;


public class BookRecieve {
    private int id;
    private int bookId;
    private int studentId;
    private String returnDate;
    private int qty;

    public BookRecieve(int id, int bookId, int studentId, String returnDate, int qty) {
        this.id = id;
        this.bookId = bookId;
        this.studentId = studentId;
        this.returnDate = returnDate;
        this.qty = qty;
    }

    public BookRecieve(int bookId, int studentId, String returnDate, int qty) {
        this.bookId = bookId;
        this.studentId = studentId;
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

    public String getReturnDate() {
        return returnDate;
    }

    public int getQty() {
        return qty;
    }
 
    
    
}
