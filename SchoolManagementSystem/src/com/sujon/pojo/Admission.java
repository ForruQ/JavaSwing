
package com.sujon.pojo;

import java.util.Date;


public class Admission {
    private int id;
    private String name;
    private String cls;
    private String section;
    private String gender;
    private String birthDate;
    private String father;
    private String mother;
    private String mobile;
    private String address;

    public Admission(int id, String name, String cls, String section, String gender, String birthDate, String father, String mother, String mobile, String address) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.section = section;
        this.gender = gender;
        this.birthDate = birthDate;
        this.father = father;
        this.mother = mother;
        this.mobile = mobile;
        this.address = address;
    }

    public Admission(String name, String cls, String section, String gender, String birthDate, String father, String mother, String mobile, String address) {
        this.name = name;
        this.cls = cls;
        this.section = section;
        this.gender = gender;
        this.birthDate = birthDate;
        this.father = father;
        this.mother = mother;
        this.mobile = mobile;
        this.address = address;
    }

    public int getId() {
        return id;
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

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

   
}
