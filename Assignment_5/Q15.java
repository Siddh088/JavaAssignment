package Assignment_5;
/*
15.Write a program to maintain the office database using hierarchical inheritance.
Superclass is Employee that contain the information as follows- Emp_code,
Emp_name,Address, Ph_no, Da-10%, Hra-20%.
Create three subclass of Manager, Typist, officer each class having their own
(basic pay & da), hra remain same.
Create a menu-driven application in main and depending on choice ask details
and print them on screen .
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args){
    ArrayList<Typist> t=new ArrayList<>();
    ArrayList<Officer> o= new ArrayList<>();
    ArrayList<Manager> m=new ArrayList<>();
    m.add(new Manager(1,"Shirish",987654,36000));
    m.add(new Manager(2,"Ramesh",98765544,360000));
    t.add(new Typist(1,"Suresh",9876524,24000));
    t.add(new Typist(2,"Shinu",9456524,240000));
    o.add(new Officer(1,"Pavan",9076524,214000));
    o.add(new Officer(2,"Siddhant",9046524,23000));
    System.out.println("View Data: ");
    System.out.println("1.Typist\n2.Officer.\n3.Manager");
    Scanner scan=new Scanner(System.in);
    System.out.print("Select choice: ");int i= scan.nextInt();
    switch (i){
        case 1:
            System.out.println("Typist Data");
            System.out.println("---------------------------------------------------------");
            System.out.println(t);
            break;
        case 2:
            System.out.println("Officer Data");
            System.out.println("---------------------------------------------------------");
            System.out.println(o);
            break;
        case 3:
            System.out.println("Manager Data");
            System.out.println("---------------------------------------------------------");
            System.out.println(m);
            break;
        default:
            System.out.println("Invalid Choice*");
            break;
        }
    }
}
 class superClassEmp{
     int empId;
     String eName;
     long ePhone;
     float da=10f;
     float hra=20f;
    public superClassEmp(int empId, String eName, long ePhone) {
        this.empId = empId;
        this.eName = eName;
        this.ePhone = ePhone;
    }

     public superClassEmp() {

     }
 }

//Priority set AS Typist>Officer>Manager
class Typist extends superClassEmp {
    public double BasicPay;
    public Typist(int empId, String eName, long ePhone, double basicPay) {
        super(empId, eName, ePhone);
        BasicPay = basicPay;
    }
    public double getBasicPay() {
        return BasicPay;
    }
    public void setBasicPay(double basicPay) {
        BasicPay = basicPay;
    }
    @Override
    public String toString() {
        return " "+"empId="+ empId +
                ", eName='" + eName + '\'' +
                ", ePhone=" + ePhone +
                ", da=" + da +
                ", hra=" + hra +
                ", BasicPay=" + BasicPay+
                '\n';
    }
}

class Officer extends superClassEmp {
    public double BasicPay;
    public Officer(int empId, String eName, long ePhone, double basicPay) {
        super(empId, eName, ePhone);
        this.BasicPay = basicPay;
    }
    public Officer() {
        super();
    }
    @Override
    public String toString() {
        return " "+"empId="+ empId +
                ", eName='" + eName + '\'' +
                ", ePhone=" + ePhone +
                ", da=" + da +
                ", hra=" + hra +
                ", BasicPay=" + BasicPay+
                '\n';
    }
}

class Manager extends superClassEmp {
    public double BasicPay;
    public Manager(int empId, String eName, long ePhone, double basicPay) {
        super(empId, eName, ePhone);
        this.BasicPay = basicPay;
    }

    @Override
    public String toString() {
        return " "+"empId="+ empId +
                ", eName='" + eName + '\'' +
                ", ePhone=" + ePhone +
                ", da=" + da +
                ", hra=" + hra +
                ", BasicPay=" + BasicPay+
                '\n';
    }
}




