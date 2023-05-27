package Assignment_5.Batch;
/*
17. Write a class Student, store it in package stud. Write a class Batch with
information about subject, faculty, and timing. Store it in package bat. Use the
class Batch to set information in the Student class
 */

import  Assignment_5.stud.Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Batch {
    static String subject;
    static String faculty;
    static long timing;

    public static void main(String[] args){
        Date d=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String formattedDate;
        formattedDate = sdf.format(new Date());
        Student s=new Student();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Student Details.");
        System.out.print("Roll No. ");s.setsRollNo(scan.nextInt());
        System.out.print("Name: ");s.setsName(scan.next());
        System.out.print("Age: ");s.setAge(scan.nextInt());
        System.out.print("Subject: ");subject=scan.next();
        System.out.print("Faculty: ");faculty= scan.next();
        System.out.println(s);
        System.out.println(" Subject: "+subject);
        System.out.println(" Faculty: "+faculty);
        System.out.println(" Timing: "+formattedDate);
    }
}

