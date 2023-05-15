package com.example.springdependencyinjection.model;

import jakarta.annotation.PreDestroy;

public class Computer {


    private String brand;

    public Computer() {
        super();
        System.out.println("No - Arg Constructor called : (Computer Class)");
    }
    public Computer(String brand) {
        this.brand = brand;
        System.out.println("All - Arg Constructor called : (Computer Class)");
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Computer class object destroyed!");
    }
}
