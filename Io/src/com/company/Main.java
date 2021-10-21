package com.company;


import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
	try {
        FileOutputStream fout = new FileOutputStream("c:\\users\\user418\\Desktop\\test.txt");
        fout.write(99);
        fout.close();
        System.out.println("File successfully written..");
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
