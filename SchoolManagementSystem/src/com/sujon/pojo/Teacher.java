
package com.sujon.pojo;


public class Teacher {
    private int id;
    private String name;
    private int salary;
    private String mobile;
    private String address;

    public Teacher(int id, String name, int salary, String mobile, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.mobile = mobile;
        this.address = address;
    }

    public Teacher(String name, int salary, String mobile, String address) {
        this.name = name;
        this.salary = salary;
        this.mobile = mobile;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
    
    
    
}
