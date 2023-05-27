package Assignment_3;

/*
Q2. Write a program to design a class to represent a bank account. Include the following
members.
Date members
Name of depositor 
Account Number 
Type of account 
Balance account in the account 
Methods: - 
To assign initial values 
To deposit an account 
To withdraw an account after checking balance. 
To display the name and balance

 */

public class BankAccount
{
    private String name;
    private long accno;
    private char type;
    private double bal;

    BankAccount(String n, long accnumber, char t, double b)   {
        name = n;
        accno = accnumber;
        type = t;
        bal = b;
    }

    public void deposit(double amt)   {
        bal = bal + amt;
        System.out.println("Amount deposited: Rs. " + amt);
        System.out.println("Balance: Rs. " + bal);
    }

    public void withdraw(double amt)    {
        if(amt <= bal)  {
            bal = bal - amt;
            System.out.println("Amount withdrawn: Rs. " + amt);
            System.out.println("Balance: Rs. " + bal);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + bal);
    }

    public static void main(String[] args){
        BankAccount a1=new BankAccount("Pavan",36998741,'s',5000);
        BankAccount a2=new BankAccount("Shamim",369984541,'c',8000);
        a1.deposit(1000);
        a1.display();
        a2.display();
    }
}