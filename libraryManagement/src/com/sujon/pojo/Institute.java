
package com.sujon.pojo;


public class Institute {
    private int id;
    private String name;
    private String houseNo;
    private String RoadNo;
    private String blockOrVillage;
    private String thana;
    private String district;
    private String division;
    private String country;

    public Institute(int id, String name, String houseNo, String RoadNo, String blockOrVillage, String thana, String district, String division, String country) {
        this.id = id;
        this.name = name;
        this.houseNo = houseNo;
        this.RoadNo = RoadNo;
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

    public String getHouseNo() {
        return houseNo;
    }

    public String getRoadNo() {
        return RoadNo;
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
