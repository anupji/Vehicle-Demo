package com.example;

public class Owner {
    private int id;
    private String name;
    private String email;

    // Constructors, Getters, Setters
    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Owner(int id, String name, String email) {
        this(name, email);
        this.id = id;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setId(int id) { this.id = id; }
}
