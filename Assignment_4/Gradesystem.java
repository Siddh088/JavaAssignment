/*
Write a class, Grader, which has an instance variable, score, an appropriate constructor
        and appropriate methods
        a method, letterGrade() that returns the letter grade as a String. 
        Now write a demo class to test the Grader class by reading a score from the user, using it
        to create a Grader object after validating that the value is not negative and is not greater
        then 100. Finally, call the letterGrade() method to get and print the grade. See figure (b)
        for sample run. 
*/
package Inheritance;

import java.util.Scanner;

class Grader{
    int score;
    //Constructor
    Grader(int score){
        this.score=score;
    }
    //a method, letterGrade() that returns the letter grade as a String.
    public String letterGrade(int score){
        if ((score>=90)&&(score<=100)){
            return "A+";
        }
        else if ((score>=85)&&(score<90)){
            return "A";
        }
        else if ((score>=80)&&(score<85)){
            return "B+";
        }
        else if ((score>=75)&&(score<80)){
            return "B";
        }
        else if ((score>=65)&&(score<75)){
            return "C+";
        }
        else if ((score>=60)&&(score<65)){
            return "C";
        }
        else if ((score>=55)&&(score<60)){
            return "D+";
        }
        else if ((score>=50)&&(score<55)){
            return "D";
        }
        else {
            return "F";
        }

    }
}
class Demo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Total Marks: ");
        int mark=scan.nextInt();
        if ((mark<=0)||(mark>100)){
            System.out.println("Enter Marks between 1-100 range.");
            System.exit(0);
        }
        //call constructor
        Grader G=new Grader(mark);
        String grade=G.letterGrade(mark);
        System.out.println("You Obtain Grade is: "+grade);
    }
}
