/*11.write a program to create a class for employee having fields like name , age ,
salary. Ask 5 employees records from user in an array and display them in
ascending order .

 */

package Assignment_5;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] x = new String[5];
        int[] y = new int[5];
        double[] s = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("------------------------------------------");
            System.out.println("Enter The Details of User " + (i+1) + ".");
            System.out.println("------------------------------------------");
            System.out.print("User Name: ");
            x[i] = scan.next();
            System.out.print("User Age: ");
            y[i] = scan.nextInt();
            System.out.print("User Salary: ");
            s[i] = scan.nextDouble();
        }
        employeeData e1 = new employeeData(x[0], y[0], s[0]);
        employeeData e2 = new employeeData(x[1], y[1], s[1]);
        employeeData e3 = new employeeData(x[2], y[2], s[2]);
        employeeData e4 = new employeeData(x[3], y[3], s[3]);
        employeeData e5 = new employeeData(x[4], y[4], s[4]);
        TreeSet t = new TreeSet(new con());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println("*Employees Record With Sorting By Age*");
        System.out.println(t);
    }
}
class employeeData{
    String eName;
    int age;
    double salary;

    public employeeData(String eName, int age, double salary) {
        this.eName = eName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "\n"+eName+"\t\t"+age+"\t\t"+salary+"\n";
    }

}
class con implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        employeeData ed1 = (employeeData) o1;
        employeeData ed2 = (employeeData) o2;
        return ed1.eName.compareTo(ed2.eName);
    }
}


