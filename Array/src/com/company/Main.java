package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        while(true) {
            System.out.println("Enter options \n1)Input\n2)Output\n3)Search\n4)Update\n5)Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;


            }
        }
    }

    public static void input() {
        String[] names=new String[100];
        System.out.println("Enter size of input: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        System.out.println(" names inserted successfully: ");
    }

    public static void output() {
        int n;
        if (n == 0) {
            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(names[i]);
            }
        }
    }


}
