package com.javagda25.sda.ComperableEx;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Customer2 implements Comparable<Customer2>{

    private String name;
    private int age;
    private boolean isPragnet;
    private LocalDateTime dateTime;
    private boolean isOld=false;

    public Customer2(String name, int age, boolean isPragnet) {
        this.name = name;
        this.age = age;
        this.isPragnet = isPragnet;
        this.dateTime = null;
        if (age>60){
            isOld=true;
        }
    }

    @Override
    public int compareTo(Customer2 o) {


        return !this.isPragnet() && o.isPragnet() ? 1 : ((this.isPragnet()) && !o.isPragnet() ? -1 :
                (!this.isOld() && o.isOld() ? 1 : ((this.isOld() && !o.isOld()) ? -1 :
                        (this.getDateTime().isBefore(o.getDateTime()) ? 1 : (o.getDateTime().isBefore(this.getDateTime()) ? -1 :0)))));
    }

}

