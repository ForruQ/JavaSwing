
package com.sujon.pojo;


public class BookSummary {
    private int id;
    private String bookCode;
     private String bookName;
    private int  totalStack;
    private  int availableStack;
    private int alreadyLend;
    private int lostQty;

    public BookSummary(int id, String bookCode, String bookName, int totalStack, int availableStack, int alreadyLend, int lostQty) {
        this.id = id;
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.totalStack = totalStack;
        this.availableStack = availableStack;
        this.alreadyLend = alreadyLend;
        this.lostQty = lostQty;
    }

    public BookSummary(String bookCode, String bookName, int totalStack, int availableStack, int alreadyLend, int lostQty) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.totalStack = totalStack;
        this.availableStack = availableStack;
        this.alreadyLend = alreadyLend;
        this.lostQty = lostQty;
    }

    public int getId() {
        return id;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public int getTotalStack() {
        return totalStack;
    }

    public int getAvailableStack() {
        return availableStack;
    }

    public int getAlreadyLend() {
        return alreadyLend;
    }

    public int getLostQty() {
        return lostQty;
    }
    

    
    
}
