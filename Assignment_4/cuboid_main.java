package Inheritance;

import java.util.Scanner;
import java.lang.Math;

class rectangle{
    static float w;
    static float l;
    float rect_area(float w,float l){
        return w*l;
    }
    float rect_peri(float w,float l){
        return 2*(l*w);
    }
    double rect_digonal(float w,float l){
        return Math.sqrt((w*w)+(l*l));
    }

}

class cuboid extends rectangle{
    static float h;
    float cuboid_lat_area(float w,float l,float h){
        return h*rect_area(w,l);
    }

}


public class cuboid_main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter breadth: ");
        float w=scan.nextFloat();
        System.out.println("Enter breadth: ");
        float b=scan.nextFloat();
        System.out.println("Enter height: ");
        float h=scan.nextFloat();
        cuboid r=new cuboid();
        System.out.println("Area of rectangle is "+r.rect_area(w,b));
        System.out.println("Perimeter of rectangle is "+r.rect_peri(w,b));
        System.out.println("Diagonal of rectangle is "+r.rect_digonal(w,b));
        System.out.println("Lateral Area of Cuboid is "+r.cuboid_lat_area(w,b,h));

    }
}

