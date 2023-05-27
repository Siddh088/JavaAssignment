/*4. Write a java program to throw a exception (checked) for a student
details
a. If name is a number, an exception must be thrown.
b. If an roll number is greater than 50, an age exception must be thrown.
c. Or else an object must be created for the entered employee details

 */
package Assignment_5;

import java.util.Scanner;

public class Q4 {
    static void ValidateName(String name) throws ExceptionNumber{
        for (int i=0;i<name.length();i++){
            if (((name.charAt(i)>='a')&&(name.charAt(i)<='z'))||((name.charAt(i)>='A')&&(name.charAt(i)<='Z')))   {
                continue;
            }
            else{
                throw new ExceptionNumber("NumberNotValid");
            }
        }
    }
    static void ValidateAge(int age) throws ExceptionAge{
        if (age>50){
            throw new ExceptionAge("AgeNotValid");
        }
    }
    public static void main(String[] args) {
        student s1=new student();
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("Enter Name: ");
            String n=scan.next();     //Take student name Input
            ValidateName(n);           //Validate Name
            s1.setStudentName(n);
            try{                             //Age block of try
                System.out.print("Enter Age: ");
                int a=scan.nextInt();
                ValidateAge(a);
                s1.setAge(a);
                //object is ready to print
                System.out.println("Student Name From Object: "+s1.studentName);
                System.out.println("Student Age From Object: "+s1.age);
            }catch (ExceptionAge ex){
                System.out.println(ex);
            }
        }catch (ExceptionNumber e){
            System.out.println(e);
        }
    }
}

class ExceptionNumber extends Exception{
    ExceptionNumber(String err){
        super(err);
    }
}
class ExceptionAge extends Exception{
    ExceptionAge(String ageErr){
        super(ageErr);
    }
}
class student{
    String studentName;
    int age;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}