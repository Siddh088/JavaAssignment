/*
16. Write a program in java. A class Teacher contains two fields Name and Qualification. Extends the class to department it contains dept. no and Dept Name.
 An interface named as college it contains one field name of the college. Using the above classes and interface get the appropriate information and display it
 */

package Inheritance;

interface College{
    final String name="XYZ";

}
class Teacher implements College{
    private String teacherName;
    private String qualification;
    Teacher(String teacherName,String qualification){
        this.teacherName=teacherName;
        this.qualification=qualification;
    }
    public void setName(String teacherName){
        this.teacherName=name;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public void DisplayTeacher(){
        System.out.println("College Name:\t"+name);
        System.out.println("Teacher Name:\t"+teacherName);
        System.out.println("Qualification:\t"+qualification);
    }
}

class Department extends Teacher implements College{
    private int departmentNumber;
    private String departmentName;

    //set information constructor
    Department(int departmentNumber,String departmentName,String name,String qualification){
        super(name,qualification);
        this.departmentName=departmentName;
        this.departmentNumber=departmentNumber;
    }
    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void DisplayDepartment(){
        System.out.println("Department ID:\t"+departmentNumber);
        System.out.println("Department Name:\t"+departmentName);
        super.DisplayTeacher();
    }
}

public class college implements College {
    public static void main(String[] args){
        //Set information
        Department d1=new Department(1,"Chemistry","Rohini Pawar","P.Hd");
        Department d2=new Department(2,"Chemistry","Suraj Kathe","M.sc");
        d1.DisplayDepartment();
        System.out.println("*************************");
        d2.DisplayDepartment();
    }
}
