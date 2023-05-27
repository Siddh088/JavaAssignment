/*
10. Write a program for user defined Exception that checks the external and internal marks if the internal marks is greater than 40
 it raise the exception internal mark is exceed, if the external mark is greater than 60 exception is raised and display
 the message the external marks is exceed, create the above exception and use it in your program.

 */

package Inheritance;

import java.util.Scanner;
class studentMarks{
    //Create method for exception internal marks
    static void validateIntMarks(int Intmarks) throws InternalMarksExceed{
        if (Intmarks>40){
            //throw object internal marks exception
            throw new InternalMarksExceed("*Internal MarksExceedError Exception*");
        }else{
            System.out.println("Internal Marks: "+Intmarks);
        }
    }
    static void validateExtMarks(int Extmarks) throws InternalMarksExceed{
        if (Extmarks>60){
            //throw object internal marks exception
            throw new InternalMarksExceed("*External MarksExceedError Exception*");
        }else{
            System.out.println("External Marks: "+Extmarks);
        }
    }
    public static void  main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter internal marks ");
        int Intmarks=s.nextInt();
        System.out.print("Enter External marks ");
        int Extmarks=s.nextInt();
        try{
            validateIntMarks(Intmarks);
        }catch (InternalMarksExceed e){
            System.out.println("Exception Occurred "+e);
        }
        try{
            validateExtMarks(Extmarks);
        }catch (InternalMarksExceed e){
            System.out.println("Exception Occurred "+e);
        }
    }
}

//Create Exception  internal mark
class InternalMarksExceed extends Exception{
    //constructor message
    InternalMarksExceed(String error){
        super(error);
    }
}
class ExternalMarksExceed extends Exception{
    //constructor message
    ExternalMarksExceed(String error){
        super(error);
    }
}


