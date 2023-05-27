//Q1. A sales person is paid commission based on the sales he makes as shown by the following
// Under 500 commission 2% fo sales, 500 and under 5000 5% commission,5000 and above
// 8%
/*
Write a class, Commission, which has an instance variable, sales; an appropriate
constructor; and a method, commission() that returns the commission.
Now write a demo class to test the Commission class by reading a sale from the user,
using it to create a Commission object after validating that the value is not negative.
Finally, call the commission() method to get and print the commission. If the sales are
negative, your demo should print the message “Invalid Input”.
*/
package Inheritance;
import java.util.Scanner;
class demo{
    //read sales from user
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Sales for person 1: ");
        int sales1= scan.nextInt();
        System.out.print("Enter Sales for person 2: ");
        int sales2= scan.nextInt();
        if ((sales1<=0)||(sales2<=0)){
            System.out.println("Sales cannot be zero or negative");
            System.exit(0);
        }
        // If true Initialize constructor
        commission sale1=new commission(sales1);
        commission sale2=new commission(sales1);
        //test commission method to get value to print
        double commission_person1= sale1.commission(sales1);
        double commission_person2= sale2.commission(sales2);
        System.out.println("Your Sales is: "+sales1+" ");
        System.out.println("Commission on Sales is: "+commission_person1+" ");
        System.out.println("Your Sales is: "+sales2+" ");
        System.out.println("Commission on Sales is: "+commission_person2+" ");
    }
}
class commission {
    //Instance variable than can be multiple copies for multiple object can use
    int sales;
    //create constructor for initialize
    commission(int sales){
        this.sales=sales;
    }
    //method commission
    public double commission(int sales){
        if (sales<500){
            return sales*0.02;
        }
        else if ((sales>=500)&&(sales<5000)){
            return sales*0.05;
        }
        else
        {
            return sales*0.08;
        }
    }
}
