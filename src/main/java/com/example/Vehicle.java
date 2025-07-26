package com.example;

public class Vehicle {
    private int id;
    private String model;
    private String registrationNo;
    private Integer ownerId; // nullable

    public Vehicle(String model, String registrationNo) {
        this.model = model;
        this.registrationNo = registrationNo;
    }

    public Vehicle(int id, String model, String registrationNo, Integer ownerId) {
        this(model, registrationNo);
        this.id = id;
        this.ownerId = ownerId;
    }

    public int getId() { return id; }
    public String getModel() { return model; }
    public String getRegistrationNo() { return registrationNo; }
    public Integer getOwnerId() { return ownerId; }

    public void setId(int id) { this.id = id; }
    public void setOwnerId(Integer ownerId) { this.ownerId = ownerId; }
}
