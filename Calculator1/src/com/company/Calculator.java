package com.company;

import java.util.Scanner;

class Calculator {

    Scanner sc=new Scanner(System.in);

    public void add() {

        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("The sum is :"+(num1+num2));
    }

    public void sub() {

        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Thee sub is :"+(num1-num2));
    }
    public void mul() {

        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Thee sum is :"+(num1*num2));
    }
    public void div() {

        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Thee sum is :"+(num1/num2));
    }
}









