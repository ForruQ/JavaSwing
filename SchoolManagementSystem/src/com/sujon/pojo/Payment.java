
package com.sujon.pojo;


public class Payment {
    private int id;
    private String name;
    private String Address;
    private int year;
    private int month;
    private int salary;

    public Payment(int id, String name, String Address, int year, int month, int salary) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.year = year;
        this.month = month;
        this.salary = salary;
    }

    public Payment(String name, String Address, int year, int month, int salary) {
        this.name = name;
        this.Address = Address;
        this.year = year;
        this.month = month;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getSalary() {
        return salary;
    }

    
}
