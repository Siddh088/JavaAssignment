//Demonstrate figure

package Inheritance;

abstract class Circle_{
    Circle_(){}
    double radius=1.0d;
    String color="red";
    double height=1.0f;
    Circle_(double radius){this.radius=radius;}
    Circle_(double radius,String color){this.radius=radius;this.color=color;}
    double getRadius(){return radius;}
    void setRadius(double radius){this.radius=radius;};
    String getColor(){return color;}
    void setColor(String color){color=color;}
    String to_string_(){
        String x="Area of the cicle is "+getArea();
        return x;
    }
    double getArea(){
        double area=3.143*radius*radius;
        return area;
    }
}

class Cylinder extends Circle_{
    //Create constructor
    Cylinder(){

    }
    Cylinder(double height){
        this.height=height;
    }
    Cylinder(double height,double radius){
        this.height=height;
        this.radius=radius;
    }
    Cylinder(double height,double radius,String color){
        this.height=height;
        this.radius=radius;
        this.color=color;
    }
    //Method add
    double getHeight(){
        return height;
    }
    void setHeight(double height){
        this.height=height;
    }
    String to_string(){
        super.to_string_();
        String x="volume of the cylinder is "+getVolume();
        return x;
    }
    double getVolume(){
        double volume;
        volume=getArea()*height;
        return volume;
    }
}
public class cylindermain {
    public static void main(String[] args) {

    }
}
