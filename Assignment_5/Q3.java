/*
3. Write a program to define a class employee having fields like empno ,name
,age,dept ,salary .
a) Define constructors and destructors.
b) Define get method to invoke values from user
c) Store the complete record of employee into file
d) Read all records of employee from file and display them on screen
 */

package Assignment_5;

import java.io.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws IOException {
        employee em=new employee();
        File f=new File("EmployeeDetails.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        em.getData();
        bw.newLine();
        bw.write("Employer Id:"+em.getEmpNo());
        bw.newLine();
        bw.write("Employer Name:"+em.getEmpName());
        bw.newLine();
        bw.write("Employer Age:"+em.getAge());
        bw.newLine();
        bw.write("Employer Department:"+em.getDepartment());
        bw.newLine();
        bw.write("Employer Salary:"+em.getSalary());
        bw.newLine();
        bw.write("******************************************");
        bw.newLine();
        bw.flush();
        bw.close();
        //read Data from File
        BufferedReader br=new BufferedReader(new FileReader(f));
        String line=br.readLine();
        while (line!=null){
            System.out.println(line);
            line= br.readLine();
        }
        br.close();
    }
}


class employee{
    int empNo;
    String empName;
    int age;
    String department;
    double Salary;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
    public void getData(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Employee Id: ");
        setEmpNo(scan.nextInt());
        System.out.print("Name: ");
        setEmpName(scan.next());
        System.out.print("Age: ");
        setAge(scan.nextInt());
        System.out.print("Department: ");
        setDepartment(scan.next());
        System.out.print("Salary: ");
        setSalary(scan.nextDouble());
    }
}