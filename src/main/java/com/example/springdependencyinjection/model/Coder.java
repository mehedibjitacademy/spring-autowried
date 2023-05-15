package com.example.springdependencyinjection.model;

import jakarta.annotation.PreDestroy;

public class Coder {
    private int id;
    private String name;
    private String language;
    private Computer computer;

    public Coder() {
        super();
        System.out.println("No - Arg Constructor called : (Coder Class)");
    }

    public Coder(int id, String name, String language,Computer computer) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.computer=computer;
        System.out.println("All - Arg Constructor called : (Coder Class)");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Computer class object destroyed!");
    }
}
