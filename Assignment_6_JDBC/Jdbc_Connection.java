package Assignment_6_JDBC;

/*

Collection and database assignment

Q1 Write a menu based program to store record of student in your database.
create four functions
insert()
update ()
delete()
read()
call them as per user requirement.

*/


import java.sql.*;
import java.util.Scanner;
public class Jdbc_Connection {
    public static void main(String[] args) throws Exception{
        //SwitchJDBS s=new SwitchJDBS();
        UserFunctions u=new UserFunctions();
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("*****************************");
            System.out.println("Working In Database JDBC");
            System.out.println("*****************************");
            System.out.println("Enter task to perform.");
            System.out.println("1. Insert Data.");
            System.out.println("2. Delete Data.");
            System.out.println("3. Read Data.");
            System.out.println("4. Update in Table.");
            System.out.print("Choice: ");
            int i=scan.nextInt();
            switch (i){
                case 1:
                    u.insertData();
                    break;
                case 2:
                    u.deleteColumn();
                    break;
                case 3:
                    u.readData();
                    break;
                case 4:
                    u.updateQuery();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
class UserFunctions{
    public String url = "jdbc:mysql://localhost:3306/jdbc";
    public String  uname = "root";
    public String pass = "81822164ssNN@";
    public String Driver4="com.mysql.cj.jdbc.Driver";

//  insert() function to insert data in database.
    //Suppose database is Employee type
    employeeData e=new employeeData();
    public void insertData() throws  Exception{
        try {
        //insertion is the updateQuery
        Scanner scan=new Scanner(System.in);
        System.out.println("Provide Data to insert.");
        //Here Assume data insert purpose is Emplyee id,name,age,gender
        System.out.print("Id:\t");
        e.setUserId(scan.nextInt());
        System.out.print("Name:\t");
        e.setUserName(scan.next());
        System.out.print("Age:\t");
        e.setUserAge(scan.nextInt());
        System.out.print("Gender:\t");
        e.setUserGender(scan.next().charAt(0));
        //Query to insert data is Like: insert into tableName values();
        Class.forName(Driver4);
        Connection con=DriverManager.getConnection(url,uname,pass);//Driver Load
        Statement st=con.createStatement(); //Connection Start
        System.out.println("userId\tuserName\tuserAge\tuserGender");
        String insertQuery="insert into emp Values("+e.userId+",'"+e.getUserName()+"',"+e.getUserAge()+",'"+e.getUserGender()+"');";
        //insertQuery="Insert into emp Values(1,'Sid',26,'M')";
        int x= st.executeUpdate(insertQuery);
        System.out.println("Rows affected are: "+x+" .");
        st.close();//Statement Close
        con.close();//Connection Close
        }catch (SQLException e){
            System.out.println("Exception Occurred: "+e);
        }
    }
    //update Function Can Alter The values in Database
    public void deleteColumn() throws Exception {
        try {
        Scanner scan=new Scanner(System.in);
        System.out.println("Delete Column id: ");
        Class.forName(Driver4);
        Connection con=DriverManager.getConnection(url,uname,pass);//Driver Load
        Statement st=con.createStatement(); //Connection Start
        System.out.print("Id:\t");
        e.setUserId(scan.nextInt());
        String deleteQuery="delete from emp where userId="+e.userId+";";
        int x= st.executeUpdate(deleteQuery);
        System.out.println("Rows affected are: "+x+" .");
        st.close();//Statement Close
        con.close();//Connection Close
    }catch (SQLException e){
        System.out.println("Exception Occurred: "+e);
    }
    }

    public void readData() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st=con.createStatement();
            String dataQuery;
            Scanner scan=new Scanner(System.in);
            dataQuery="Select * from emp;";
            ResultSet rs=st.executeQuery(dataQuery);//returnType is ResultSet.
            while(rs.next()) //Retrieval of ResultSet
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
            }
            st.close();
        }catch (SQLException e){
            System.out.println("Exception Occurred: "+e);
        }
    }

    public void updateQuery() throws  Exception{
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");//Driver Load
        Connection con = DriverManager.getConnection(url, uname, pass); //Connection initiated
        Statement st=con.createStatement();//Statement Bus Created
        String updateQuery;
        Scanner scan=new Scanner(System.in);
        System.out.println("Run Query for Update in Table");
        updateQuery=scan.nextLine();
        int x=st.executeUpdate(updateQuery);//ReturnType Effected Rows
        System.out.println(""+x+" Effected Rows Found.");
        st.close();//Statement Close
        con.close();//Connection Close
    }catch (SQLException e){
        System.out.println("Exception Occurred: "+e);
    }
    }
}


