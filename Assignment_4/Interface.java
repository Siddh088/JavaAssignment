/** 16.Write a program in java. A class Teacher contains two
        fields Name and Qualification. Extends the class to department
        it contains dept. no and Dept Name. An interface named as
        college it contains one field name of the college.
        Using the above classes and interface get the appropriate
        information and display it.*/
class inferanceuse
{
    public static void main(String[] args)
    {
        Department_ department = new Department_("Siddhant", "MSC", 101, "Physics");
        department.display();
    }
}
interface College
{
    String collegeName = "Bk Birla";
}

class Teacher
{
    String name;
    String qualification;

    Teacher(String name, String qualification) // constructor
    {
        this.name = name;
        this.qualification = qualification;
    }
}

class Department_ extends Teacher
{
    int deptNo;
    String departName;

    Department_(String name, String qualification, int deptNo, String departName)
    {
        super(name, qualification);
        this.deptNo = deptNo;
        this.departName = departName;
    }

    void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Department Number: " + deptNo);
        System.out.println("Department Name: " + departName);
        System.out.println("College Name: " + College.collegeName);
    }
}

