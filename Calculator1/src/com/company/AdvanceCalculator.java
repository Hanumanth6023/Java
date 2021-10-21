package com.company;

public class AdvanceCalculator extends Calculator {
    public void oddOrEven() {

        System.out.println("Enter number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num+"Even number");
        }
        else{
            System.out.println(num+"odd");
        }
    }
    public void prime() {

        System.out.println("Enter number:");
        int num = sc.nextInt();
        int count=0;
        for(int i=2;i<=num/2;i++) {
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(num+"Prime");
        }
        else{
            System.out.println(num+"odd");
        }

    }
    public void squareRoot() {
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("the square" + (num * num));

    }
}
