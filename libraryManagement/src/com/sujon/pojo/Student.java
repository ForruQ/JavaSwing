package com.sujon.pojo;

public class Student {

    private int id;
    private String name;
    private String roll;
    private String department;
    private String shift;
    private String houseNo;
    private String roadNo;
    private String blockOrVillage;
    private String thana;
    private String district;
    private String division;
    private String country;

    public Student(int id, String name, String roll, String department, String shift, String houseNo, String roadNo, String blockOrVillage, String thana, String district, String division, String country) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.department = department;
        this.shift = shift;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.blockOrVillage = blockOrVillage;
        this.thana = thana;
        this.district = district;
        this.division = division;
        this.country = country;
    }

    public Student(String name, String roll, String department, String shift, String houseNo, String roadNo, String blockOrVillage, String thana, String district, String division, String country) {
        this.name = name;
        this.roll = roll;
        this.department = department;
        this.shift = shift;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.blockOrVillage = blockOrVillage;
        this.thana = thana;
        this.district = district;
        this.division = division;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public String getDepartment() {
        return department;
    }

    public String getShift() {
        return shift;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public String getBlockOrVillage() {
        return blockOrVillage;
    }

    public String getThana() {
        return thana;
    }

    public String getDistrict() {
        return district;
    }

    public String getDivision() {
        return division;
    }

    public String getCountry() {
        return country;
    }
    
    

}
