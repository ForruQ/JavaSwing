
package com.sujon.pojo;


public class Shift {
    private int id;
    private String name;
    private String startingTime;
    private String endingTime;
    private String status;

    public Shift(int id, String name, String startingTime, String endingTime, String status) {
        this.id = id;
        this.name = name;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.status = status;
    }

    public Shift(String name, String startingTime, String endingTime, String status) {
        this.name = name;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public String getStatus() {
        return status;
    }
    
    
    
    
}
