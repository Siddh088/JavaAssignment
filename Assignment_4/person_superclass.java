/*Q5. Implement a superclass Person. Make two classes, Student and Instructor, inherit from
Person. A person has a name and a year of birth. A student has a major, and an instructor
has a salary. Write the class definitions, the constructors, and the methods toString for all
classes. Supply a test program that tests these classes and methods.

*/

package Inheritance;

import javax.sound.midi.SysexMessage;
public class person_superclass{
    public static void main(String[] args){
        //For Person
        person p1=new person("Siddhant",1996);
        //For Student
        student s1=new student("Siddhant",1996);
        //for Instructor
        Instructor i1=new Instructor("Ramesh",1996,30000);
        p1.toText();
        s1.toText();
        i1.toText();
    }
}
class person{
    //name and yearofbirth could be different for everyone,hence create instance variable
    String name;
    int year_of_birth;
    //constuctor create
    person(String name,int year_of_birth){
        this.name=name;
        this.year_of_birth=year_of_birth;
    }
    // methods toString for all classes
    void toText(){
        System.out.println("Name of the person is: "+name);
        System.out.println("Year of birth of person is: "+year_of_birth);
        System.out.println("*********************************************");
    }
}
class student extends person {
    //constuctor
    //use inherit from person
    student(String name,int year_of_birth){
        super(name,year_of_birth);
    }
    // methods toString for all classes
    void toText(){
        System.out.println("Name of the Student is: "+name);
        System.out.println("Year of birth of student is: "+year_of_birth);
        System.out.println("*********************************************");

    }
}
class Instructor extends student {
    double salary;
    //constuctor
    //use inherit from student
    Instructor(String name,int year_of_birth,double salary){
        super(name,year_of_birth);
        this.salary=salary;
    }
    void toText(){
        System.out.println("Name of the Instructor is: "+name);
        System.out.println("Year of birth of Instructor is: "+year_of_birth);
        System.out.println("Salary is: "+salary);
        System.out.println("*********************************************");
    }
}

