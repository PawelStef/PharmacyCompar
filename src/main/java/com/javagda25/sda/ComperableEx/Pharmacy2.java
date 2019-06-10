package com.javagda25.sda.ComperableEx;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pharmacy2 {


      private List<Customer2> list =new LinkedList<>();

    public void addToQueue (Customer2 customer){

        list.add(customer);
        Collections.sort(list);

        customer.setDateTime(LocalDateTime.now());
    }

    public void listTheQueue(){

        for (Customer2 customer:list
             ) {
            System.out.println(customer.toString());
        }
    }


}
