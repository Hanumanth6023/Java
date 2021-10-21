package com.company;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main implements BusInterface {

    HashMap<String, HashMap> customer = new HashMap<String, HashMap>();
    Scanner sc = new Scanner(System.in);

    public void option() {

        while (true) {
            System.out.println("book:1,remove:2,details:3,exit:4");
            System.out.println("enter option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    bookCustomerinfo();
                    break;
                case 2:
                    removeCustomerinfo();
                    break;
                case 3:
                    getCustomerinfo();
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Enter valid option");
            }
        }
    }


    public void bookCustomerinfo() {
        System.out.println("ENTER id ");
        String id = sc.next();
        HashMap<String, String> customer1 = new HashMap<String, String>();
        System.out.println("Enter Customer name");
        customer1.put("name", sc.next());
        System.out.println("Enter Customer from place");
        customer1.put("Customer from place", sc.next());
        System.out.println("Enter Customer to place");
        customer1.put("Customer to place", sc.next());
        customer.put(id, customer1);
    }
1
    public void getCustomerinfo() {
        System.out.println("Enter id");
        String id = sc.next();
        if (customer.containsKey(id)) {
            HashMap customerInfo = customer.get(id);
            if (!customerInfo.isEmpty()) {
                System.out.println("name=" + customerInfo.get("name"));
                System.out.println("from place=" + customerInfo.get("from place"));
                System.out.println("to place=" + customer.get("to place"));
            } else
                System.out.println("enter correct id");
        }
    }

    public void removeCustomerinfo() {
        System.out.println("Enter id");
        String id = sc.next();
        customer.remove(id);
    }

        public static void main (String[] args){
           Main obj = new Main();
            obj.option();
        }

}



