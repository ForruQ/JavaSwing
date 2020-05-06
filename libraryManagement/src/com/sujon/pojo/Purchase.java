
package com.sujon.pojo;

import java.time.LocalDateTime;


public class Purchase {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private String edition;
    private double unitPrice;
    private int qty;
    private double totalPrice;
    private String rackNo;
    private String category;
    private String purchaseDate;

    public Purchase(int id, String name, String author, String publisher, String edition, double unitPrice, int qty, double totalPrice, String rackNo, String category, String purchaseDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.rackNo = rackNo;
        this.category = category;
        this.purchaseDate = purchaseDate;
    }

    public Purchase(String name, String author, String publisher, String edition, double unitPrice, int qty, double totalPrice, String rackNo, String category, String purchaseDate) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.rackNo = rackNo;
        this.category = category;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getCategory() {
        return category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

  
    
    
    
}
