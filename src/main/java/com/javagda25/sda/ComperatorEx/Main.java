package com.javagda25.sda.ComperatorEx;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        Customer customer1= new Customer("Paweł", 23, false);
        Customer customer2= new Customer("Ania", 65, false);
        Customer customer3= new Customer("Agata", 21, true);
        Customer customer4= new Customer("Czesiek", 66, true);

        pharmacy.addToQueue(customer1);
        pharmacy.addToQueue(customer2);
        pharmacy.addToQueue(customer3);
        pharmacy.addToQueue(customer4);

        pharmacy.listTheQueue();

    }
}
