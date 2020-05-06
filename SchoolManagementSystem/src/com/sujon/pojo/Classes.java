package com.sujon.pojo;

public class Classes {

    private int id;
    private String name;
    private String section;

    public Classes() {
    }

    public Classes(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

   

  

    public Classes(String name, String section) {
        this.name = name;
        this.section = section;
    }

    public Classes(String section) {
        this.section = section;
    }
    

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getId() {
        return id;
    }

    

}
