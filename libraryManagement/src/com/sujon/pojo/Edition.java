
package com.sujon.pojo;


public class Edition {
    private int id;
    private String name;

    public Edition() {
    }

    public Edition(String name) {
        this.name = name;
    }

    public Edition(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    
}
