package com.javagda25.sda.ComperableEx;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Pharmacy2 pharmacy2 = new Pharmacy2();

        Customer2 customer21 = new Customer2("Paweł", 23, false);
        Customer2 customer22= new Customer2("Ania", 65, false);
        Customer2 customer23 = new Customer2("Agata", 21, true);
        Customer2 customer24 = new Customer2("Czesiek", 66, true);

        pharmacy2.addToQueue(customer21);
        pharmacy2.addToQueue(customer22);
        pharmacy2.addToQueue(customer23);
        pharmacy2.addToQueue(customer24);


        pharmacy2.listTheQueue();
    }

}
