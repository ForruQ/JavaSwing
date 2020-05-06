
package com.sujon.pojo;


public class Session {
    private int id;
    private String name;

    public Session() {
    }

    public Session(String name) {
        this.name = name;
    }

    public Session(int id, String name) {
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
