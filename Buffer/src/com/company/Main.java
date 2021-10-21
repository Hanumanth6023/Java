package com.company;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("c:\\users\\user418\\Desktop\\test.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Welcome to company";
            byte b[] = s.getBytes();

            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("File over written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
