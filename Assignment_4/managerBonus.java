/*
Q6. Define a class Employee having private members – id, name, department, salary. Define
default and parameterized constructors. Create a subclass called “Manager” with private
member bonus. Define methods accept and display in both the classes. Create n objects of
the Manager class and display the details of the manager having the maximum total salary
(salary+bonus)
*/

package Inheritance;

import java.util.*;
class EmployeeMain{
    public static void  main(String[] args){
        //Ask user Details for (Manager or Empliyee)
        Employee e=new Employee();
        Manager m=new Manager();
        System.out.println("Enter your Designation \n\t*Manager*\n\t*Employee*");
        Scanner scan=new Scanner(System.in);
        String Designation=scan.nextLine();
        //Store User data to array for calculation
        System.out.println("Maximum users Add: ");
        int n=scan.nextInt();
        Object[][] data=new Object[n][4]; //Store user Details in form of Object
        double[] SalArr=new double[n];
        if (Designation.equals("Manager")){
            //Set Manager Data
            for (int i=0;i<n;i++) {         //loop in vector form, always increase raws
                m.AcceptManagerInformation();
                data[i][0] = m.getId(); //Now it's Fine
                data[i][1] = m.getName();
                data[i][2] = m.getDepartment();
                data[i][3] = m.getSalary();   //Salary
                SalArr[i]= m.getSalary();
                // System.out.println(Arrays.toString(data[i])); //now data insert successfully
            }
            //Compare Salary and get index
            //loop in vector form, always increase raws
            //System.out.println(Arrays.toString(SalArr)); //Salary achieved
            //Get index of Max Salary
            double max = SalArr[0];
            int index=0;

            // Traverse array elements from second and
            // compare every element with current max
            for (int i = 1; i < SalArr.length; i++){
                if (SalArr[i] > max)
                    max = SalArr[i];
                index++;
                break;
            }
            //  System.out.println(index); //Found Index for Maxsalary
            //Show this data
            m.setId((Integer) data[index][0]);
            m.setName((String) data[index][1]);
            m.setDepartment((String) data[index][2]);
            m.setSalary((Double) data[index][3]);
            m.DisplayManager();
            m.ManagerSetBonus(2000);
            System.out.println("With bonus: "+m.getSalary());
        }
        else if (Designation.equals("Employee")){
            //No need to make changes in Employee Salery
            e.AcceptEmployee();
            e.DisplayEmployeeDetails();
        }
    }
}
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;
    //getter setter method

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Defualt Constructor
    Employee(){};
    //Accept Data form user and feed to here
    public void AcceptEmployee(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Person id* : ");
        setId(scan.nextInt());
        System.out.print("Person name* : ");
        setName(scan.next());
        System.out.print("Person Department* : ");
        setDepartment(scan.next());
        System.out.print("Person Salary* : ");
        setSalary(scan.nextDouble());
        //It only set data, not return the value.
    }
    //Display Information Of employee
    public  void DisplayEmployeeDetails(){
        System.out.println("Person id* : "+getId());
        System.out.println("Person name* : "+getName());
        System.out.println("Person Department* : "+getDepartment());
        System.out.println("Person Salary* : "+getSalary());
    }
}

//append the Employee with Manager and reuse the Method
class Manager extends Employee{
    //Addition instance variable for manager
    private double bonus=2000d;
    //setter and getter

    public double getBonus() {
        return bonus;
    }

    //No need to prioritize Constructor because.

    // Method for Accept Manager Data
    public void AcceptManagerInformation(){
        super.AcceptEmployee();
    }

    //It is simple, Bonus is always give to Manager
    //Hence,Method for Bonus
    public void ManagerSetBonus(int bonus){
        setSalary(bonus+getSalary());
    }

    // Display Manager Data
    public void DisplayManager(){
        super.DisplayEmployeeDetails();
    }
}


