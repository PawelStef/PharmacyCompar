package com.javagda25.sda.ComperatorEx;

import com.javagda25.sda.ComperatorEx.Customer;

import java.util.Comparator;

public class CustomerComperator implements Comparator<Customer> {


    @Override
    public int compare(Customer o1, Customer o2) {




        return !o1.isPragnet() && o2.isPragnet() ? 1 : ((o1.isPragnet()) && !o2.isPragnet() ? -1 :
                (!o1.isOld() && o2.isOld() ? 1 : ((o1.isOld() && !o2.isOld()) ? -1 :
                        (o1.getDateTime().isBefore(o2.getDateTime()) ? 1 : (o2.getDateTime().isBefore(o1.getDateTime()) ? -1 :0)))));
    }
}
