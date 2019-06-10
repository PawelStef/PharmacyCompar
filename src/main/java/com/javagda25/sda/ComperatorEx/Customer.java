package com.javagda25.sda.ComperatorEx;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Customer {

    private String name;
    private int age;
    private boolean isPragnet;
    private LocalDateTime dateTime;
    private boolean isOld=false;

    public Customer(String name, int age, boolean isPragnet) {
        this.name = name;
        this.age = age;
        this.isPragnet = isPragnet;
        this.dateTime = null;
        if (age>60){
            isOld=true;
        }
    }
/*
    @Override
    public int compareTo(Object o) {



        return 0;
    }
    */
}

