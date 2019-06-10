package com.javagda25.sda.ComperatorEx;

import com.javagda25.sda.ComperatorEx.Customer;
import com.javagda25.sda.ComperatorEx.CustomerComperator;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pharmacy {

    private List<Customer> list =new LinkedList<>();

    public void addToQueue (Customer customer){
        list.add(customer);
        customer.setDateTime(LocalDateTime.now());
    }

    public void listTheQueue(){
        Collections.sort(list, new CustomerComperator());
        for (Customer customer:list
             ) {
            System.out.println(customer.toString());
        }
    }


}
