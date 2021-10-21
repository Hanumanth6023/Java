package com.company;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class Student implements StudentInterface {
    //usn,name,place,branch,college
    HashMap<String, StudentInfo> student = new HashMap<String, HashMap>();
    Scanner sc = new Scanner(System.in);

    public void option() {

        while(true)
            System.out.println("add:1,remove:2,details:3,exit:4");
        System.out.println("enter option");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                addStudentinfo();
                break;
            case 2:
                removeStudentinfo();
                break;
            case 3:
                getStudentinfo();
                break;
            case 4:
                exit(0);
                break;
            default:
                System.out.println("Enter valid option");
        }

    }

    public void addStudentinfo() {
        System.out.println("ENTER usn OF the student");
        String usn=sc.next();

        StudentInfo studentInfo=new StudentInfo();

        HashMap<String,String>studentInfo=new HashMap<String,String>();
        System.out.println("Enter student name");
        studentInfo.setName(sc.next());
        System.out.println("Enter student college");
        studentInfo.put("college",sc.next());
        System.out.println("Enter student branch");
        studentInfo.setBranch("branch",sc.next());
        System.out.println("Enter student place");
        studentInfo.put("place",sc.next());
        // student info contain{name,branch,place
        student.put(usn,studentInfo);
    }
    public void getStudentinfo() {
        System.out.println("Enter USN");
        String usn = sc.next();
        if (student.containsKey(usn)) {
            StudentInfo studentInfo = student.get(usn);

            System.out.println("name=" + studentInfo.get("name"));
            System.out.println("college=" + studentInfo.get("college"));
            System.out.println("name=" + studentInfo.get("branch"));
            System.out.println("name=" + studentInfo.get("place"));
        } else
            System.out.println("enter correct usn");
    }
       public void removeStudentinfo(){
            System.out.println("Enter USN");
            String id=sc.next();
           // if(student.containsKey(usn))
            student.remove(id);
        }



    }

    public static void main(String[] args){
        Student obj=new Student();
        obj.option();
    }

}

