package com.company;

import java.sql.SQLOutput;

public class Exception {

        void pairs(int arr[],int n) {
            try{
                for(int l=0;l<=n;l++) {
                    for (int i = 0; i < n - 1; i++) {
                        System.out.println();
                        for (int j = 1; j < n; j++) {
                            System.out.print(" (" + arr[i] + "," + arr[j] + ")" + ",");
                        }
                    }


            } catch(ArrayIndexOutOfBoundsException Ex){
                System.out.println(" No pairs after 9");

            }
        }
}
