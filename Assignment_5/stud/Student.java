package Assignment_5.stud;

public class Student {
    private int sRollNo;
    private String sName;
    private int age;

    public Student(int sRollNo, String sName, int age) {
        this.sRollNo = sRollNo;
        this.sName = sName;
        this.age = age;
    }
    public Student(){}

    public int getsRollNo() {
        return sRollNo;
    }

    public void setsRollNo(int sRollNo) {
        this.sRollNo = sRollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student info\n---------------------\n RollNo: "+getsRollNo()+"\n Name: "+getsName()+"\n Age: "+getAge()+"";
    }
}
