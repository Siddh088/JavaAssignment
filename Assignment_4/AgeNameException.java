/*
4. Create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
 If age of student is not in between 15 and 21 then generate user-defined exception “AgeNotWithinRangeException”.
If name contains numbers or special symbols raise exception” NameNotValidException ”.
 */

package Inheritance;

import java.awt.*;
import java.util.Scanner;

import static Inheritance.ageException.ValidateAge;

//If age of student is not in between 15 and 21 then generate user-defined exception “AgeNotWithinRangeException”.
class ageException extends Exception{
    //Controctor call
    ageException(String Err){
        super(Err);
    }
    //Method validateAge create
    static void ValidateAge(int age) throws ageException{
        //validation Program
        if ((age<15)||(age>21)){
            throw new ageException("AgeNotWithinRangeException");
        }
        else{
            //run formal program
            System.out.println("Age is Valid: "+age);
        }

    }
}

public class AgeNameException {
    public static void main(String[] args) {
        ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Age: ");
        try {
            ValidateAge(s.nextInt());
        } catch (ageException e) {
            System.out.println(e);
        }
    }
}

