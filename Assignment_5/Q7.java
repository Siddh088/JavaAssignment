/*
10.Write a program to ask two password from user (in string ) and compare them
.If both are equal print “access allowed “ otherwise ask string maximum of three
times .

 */
package Assignment_5;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Password: ");
        String pass=scan.next();
        int trial=3;
        while (trial!=0){
        System.out.println("Repeat Password: ");
        String verify=scan.next();
            if (pass.equals(verify)){
            System.out.println("Password Matched.");
            break;
            }
            System.out.println("Password MisMatched.");
            trial--;
        }
    }
}
