/*
Q4. Define a class called fruit with the following attributes:
1. Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and display their attributes.
 */

package Inheritance;
public class fruit_main {
    public static void main(String[] args){
        //calling first constuctor as obj1
        fruit fruit1=new fruit("Mango",12,40);
        fruit fruit2=new fruit("Papaya",1,20);
        fruit1.displayFruit();
        fruit2.displayFruit();
    }
}

class fruit{
    String f_name;
    int n_fruits;
    double price;
    //constroctor define
    fruit(String f_name,int n_fruits,double price){
        this.f_name=f_name;
        this.n_fruits=n_fruits;
        this.price=price;
    }
    void displayFruit(){
        price=n_fruits*price;
        System.out.println("For "+n_fruits+" "+f_name+" Fruits,Total price is: "+price+".");
    }

}
