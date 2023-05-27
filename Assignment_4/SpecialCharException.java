package Inheritance;/*
Create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
If age of student is not in between 15 and 21 then generate user-defined exception “AgeNotWithinRangeException”.
If name contains numbers or special symbols raise exception” NameNotValidException ”.
 */

import java.util.Scanner;

class SpecialCharException {
    //method of validate exception
    public static void ValidateAgeEx(int Age) throws AgeRangeException{
        //Condition to true false
        if ((Age>=15)&&(Age<=21)){}
        else
            throw new AgeRangeException("AgeNotWithinRangeException");
    }
    public static void ValidateEx(String a) throws SpecialCharEx{
        a.toCharArray();
        for  (int i=0;i<a.length();i++){
            if (((a.charAt(i)>='a')&&(a.charAt(i)<='z'))||((a.charAt(i)>='A')&&(a.charAt(i)<='Z')))     //Rather Than this everything encounter
                continue;
            else
                throw new SpecialCharEx("NameNotValidException");
        }
    }

    public static void main(String[] args){
        int flag=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter RollNo.: ");
        int roll=scan.nextInt();
        System.out.print("Enter Age: ");
        int Age=scan.nextInt();
        try{
            ValidateAgeEx(Age);
            if (true){
                System.out.print("Enter Name: ");
                String x=scan.next();
                try{
                    ValidateEx(x);
                    if (true){
                        System.out.print("Enter CourseName: ");
                        String course=scan.next();
                        System.out.println("RollNo.:\t"+roll);
                        System.out.println("Age:\t"+Age);
                        System.out.println("Name:\t"+x);
                        System.out.println("CourseName:\t"+course);
                    }
                }catch (SpecialCharEx e){
                    System.out.println(e);
                }
            }
        }catch (AgeRangeException e){
            System.out.println(e);
        }

    }
}

class SpecialCharEx extends Exception{
    SpecialCharEx(String message){
        super(message);
    }
}
class AgeRangeException extends Exception{
    //Constructor
    AgeRangeException(String massage){
        super(massage);
    }
}
