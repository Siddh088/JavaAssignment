/*
14. Create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
 If age of student is not in between 15 and 21 then generate user-defined exception “AgeNotWithinRangeException”.
 If name contains numbers or special symbols raise exception” NameNotValidException ”.


package Inheritance;

import java.nio.file.StandardOpenOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

}
// A Class that represents use-defined exception

*/

class ageExeption extends Exception{
    ageExeption(String s){
        super(s);
    }
}
class Student_{
    public static void main(String[] args){
        int age=19;
        if ((age<18)||(age>21)){
            try{
            {
                throw new ageExeption("AgeNotWithinRangeException");
            }
        }
        catch (ageExeption ex){
            System.out.println(ex.getMessage());
        }
        }
        else{
            System.out.println("HI");
        }


        //NameException Start
        String name="Hello";


    }
}
// If name contains numbers or special symbols raise exception” NameNotValidException

class NameException extends Exception{
    NameException(String s){
        super(s);
    }
}
