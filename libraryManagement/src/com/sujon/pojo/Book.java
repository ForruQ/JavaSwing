
package com.sujon.pojo;


public class Book {
    private int id;
    private String name;
    private String code;
    private String author;
    private String publisher;
    private String edition;
    private double unitPrice;
    private int qty;
    private double totalPrice;
    private String rackNo;
    private String issnNo;
    private String category;
    private String purchaseDate;

    public Book() {
    }

    public Book(int id, String name, String code, String author, String publisher, String edition, double unitPrice, int qty, double totalPrice, String rackNo, String issnNo, String category, String purchaseDate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.rackNo = rackNo;
        this.issnNo = issnNo;
        this.category = category;
        this.purchaseDate = purchaseDate;
    }

    public Book(String name, String code, String author, String publisher, String edition, double unitPrice, int qty, double totalPrice, String rackNo, String issnNo, String category, String purchaseDate) {
        this.name = name;
        this.code = code;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.rackNo = rackNo;
        this.issnNo = issnNo;
        this.category = category;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getEdition() {
        return edition;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getRackNo() {
        return rackNo;
    }

    public String getIssnNo() {
        return issnNo;
    }

    public String getCategory() {
        return category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }
    
    
    
}
