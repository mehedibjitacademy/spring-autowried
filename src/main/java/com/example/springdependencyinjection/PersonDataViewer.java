package com.example.springdependencyinjection;

import com.example.springdependencyinjection.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDataViewer {
    @Autowired
    private Person person;
    public void view(){
        person.showInfo();
    }
}
