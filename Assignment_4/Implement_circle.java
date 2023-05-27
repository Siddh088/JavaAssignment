/*
Q3. Design a class Circle and implement the following methods:
Define a circle method to compute its area 
Define a circle method to compute its perimeter 
Define a method that takes a given point represented by a pair of numbers and
checks whether or not the point is inside the circle. 
The circle class needs to have instance variables to store the radius of the circle, and the x
and y coordinates of the center. Add main program to test the class Circle repeatedly, until
user enters negative value for the radius of the circle.
 */

package Inheritance;

import java.util.Scanner;
public class Implement_circle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float r=0;
        while (r>=0) {
            System.out.print("Radius: ");
            r = scan.nextFloat();
            //radius cannot be negative
            if (r <= 0) {
                System.out.println("invalid Radius.");
                System.exit(0);
            }
            System.out.print("x Coordinate: ");
            float x = scan.nextFloat();
            System.out.print("y Coordinate: ");
            float y = scan.nextFloat();
            circle c = new circle(x, y, r);
            boolean b = c.point(x, y, r);
            if (b == false) {
                System.out.println("Coordinates are out of circle range");
            } else {
                System.out.println("Coordinates are Inside the circle");
                System.out.println("Area of circle is: " + c.area(r));
                System.out.println("Perimeter of circle is: " + c.perimeter(r));
            }
        }
    }
}
class circle{
    static float pi=3.143f;
    float r;
    float x;
    float y;
        //constructor for radius
        circle(float x,float y,float r){
            this.x=x;
            this.y=y;
            this.r=r;
        }

        //define circle method
        double area(float r){
            return pi*r*r;
        }
        double perimeter(float r){
            return 2*pi*r;
        }

    //Define a method that takes a given point represented by a pair of numbers and
    //checks whether or not the point is inside the circle.
    boolean point(float x,float y,float r){
        //logic to test point inside circle
        if ((-x>=(-r))&&(x<=r)){
            if ((-y>=(-r))&&(y<=r)){
                return true;
            }
        }
        return false;
    }
}

