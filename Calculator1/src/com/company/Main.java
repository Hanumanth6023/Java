package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int iteration = 0; iteration < 100; iteration++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter option : \n1.add\n2.sub\n3.mul\n4.div\n5.odd or even\n6.prime\n7.square\n8.exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    AdvanceCalculator addObj = new AdvanceCalculator();
                    addObj.add();
                    break;
                case 2:
                    AdvanceCalculator subObj = new AdvanceCalculator();
                    subObj.sub();
                    break;
                case 3:
                    AdvanceCalculator mulObj = new AdvanceCalculator();
                    mulObj.mul();
                    break;
                case 4:
                    AdvanceCalculator divObj = new AdvanceCalculator();
                    divObj.div();
                    break;
                case 5:
                    AdvanceCalculator oddOrEvenObj = new  AdvanceCalculator();
                    oddOrEvenObj.oddOrEven();
                    break;
                case 6:
                    AdvanceCalculator primeObj = new  AdvanceCalculator();
                    break;
                case 7:
                    AdvanceCalculator squareRootObj = new  AdvanceCalculator();
                    squareRootObj.squareRoot();
                    break;
                case 8:
                    System.out.println("Good Day");
                    System.exit(0);
                default:
                    System.out.println("Enter valid option");

            }
        }
    }
}