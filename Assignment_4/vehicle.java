/*Q7. Write a Java program to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and
HeavyMotorVehicle (members – capacity-in-tons). Accept the information for n vehicles
and display the information in appropriate form. While taking data, ask the user about the
type of vehicle first.
 */

package Inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class vehicle {
    public static void main(String[] args){
        LightMotorVehicle lobg=new LightMotorVehicle();
        HeavyMotorVehicle hobg=new HeavyMotorVehicle();
        Scanner scan=new Scanner(System.in);
        String[] list=new String[1];
        System.out.println("How many vehicles want to register: ");
        int n= scan.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Select Type of vehicle: ");
            System.out.println("1.\tLightVehicle: ");
            System.out.println("2.\tHeavyVehicle: ");
            int sel = scan.nextInt();
            if (sel == 1) {
                lobg.accept();
                lobg.Displayl();
                System.out.println("*********************************");
            }
            else{
                hobg.accepth();
                hobg.Displayh();
                System.out.println("*********************************");
            }

        }
    }
}

class vehicle_superclass{
    private String Company;
    private double price;
    public String getCompany(){
        return Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class LightMotorVehicle extends vehicle_superclass{
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void accept(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Vehicle Compony:");
        String c_name= scan.next();
        setCompany(c_name);
        System.out.println("Enter Price:");
        double c_price= scan.nextDouble();
        setPrice(c_price);
        System.out.println("Enter Mileage:");
        int c_mileage= scan.nextInt();
        setMileage(c_mileage);
    }

    public void Displayl(){
        System.out.println("Vehicle Name is:\t"+getCompany());
        System.out.println("Vehicle price is:\t"+getPrice());
        System.out.println("Vehicle Mileage is:\t"+getMileage());
    }
}
class HeavyMotorVehicle extends LightMotorVehicle{
    private int CapacityInTons;

    public int getCapacityInTons() {
        return CapacityInTons;
    }

    public void setCapacityInTons(int capacityInTons) {
        CapacityInTons = capacityInTons;
    }
    public void accepth(){
        super.accept();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter CapacityInTons:");
        int h_capacity= scan.nextInt();
        setCapacityInTons(h_capacity);
    }
    public void Displayh() {
        super.Displayl();
        System.out.println("Vehicle Capacity is:\t"+getCapacityInTons());
    }
}

