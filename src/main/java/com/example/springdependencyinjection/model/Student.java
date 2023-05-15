package com.example.springdependencyinjection.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student implements Person{
    private String name;
    private String profession;
    public Student() {
        this.name = "Md. Mehedi Hassan";
        this.profession="Student";
    }
    @Override
    public void showInfo() {
        System.out.println("Name: "+name+" Profession: "+profession);
    }
}
