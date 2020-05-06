
package com.sujon.pojo;


public class Fee {
    public int studentId;
    public String name;
    public String cls;
    public String section;
    public int year;
    public int month;
    public int amount;

    public Fee(int studentId, String name, String cls, String section, int year, int month, int amount) {
        this.studentId = studentId;
        this.name = name;
        this.cls = cls;
        this.section = section;
        this.year = year;
        this.month = month;
        this.amount = amount;
    }

    public Fee(String name, String cls, String section, int year, int month, int amount) {
        this.name = name;
        this.cls = cls;
        this.section = section;
        this.year = year;
        this.month = month;
        this.amount = amount;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCls() {
        return cls;
    }

    public String getSection() {
        return section;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

    
}
