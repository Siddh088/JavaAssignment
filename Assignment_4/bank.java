/*
/*
Q8. A bank maintains two kinds of accounts - Savings Account and Current Account.The
savings account provides compound interest, deposit and withdrawal facilities. The
current account only provides deposit and withdrawal facilities. Current account holders
should also maintain a minimum balance. If balance falls below this level, a service
charge is imposed. Create a class Account that stores customer name, account number,
and type of account. From this derive the classes Curr-acct and Sav-acct. Include the
necessary methods in order to achieve the following tasks.
a. Accept deposit from a customer and update the balance.
b. Display the balance.
c. Compute interest and add to balance.
d. Permit withdrawal and update the balance (Check for the minimum balance, impose
penalty if necessary).
 */

package Inheritance;

import java.util.Scanner;

public class bank {
    public static void main(String[] args){
        //calling class
        current c=new current();
        account a=new account();
        saving s=new saving();
        c.setBalance(10000);
        s.setBalance(10000);
        //get user input and save to account
        a.user_details();
        Scanner scan=new Scanner(System.in);
        System.out.println("Select Your Bank Account");
        System.out.println("1:\tCurrent");
        System.out.println("2:\tSaving");
        System.out.println("*************");
        String type= a.getType_acc();
        while (true){
            System.out.println("Select from below: ");
            System.out.println("1.\tdeposit ");
            System.out.println("2.\tWithdraw ");
            System.out.println("3.\tCheck Balance ");
            System.out.println("4.\tExit ");
            //insert pre_balance for user
            Double prebal= c.getBalance();  //get balance
            if (type.equals("Current")) {
                //Task to perform, not get intrest only
                int i= scan.nextInt();
                switch (i){
                    case 1:
                        //for deposit function
                        System.out.print("Enter deposit Amount");
                        double damt=scan.nextDouble();
                        c.deposit(damt);   //Deposit method
                        //reciept as follow
                        System.out.println("******Reciept******");
                        a.display_account_details();
                        System.out.println("Previous Balance: "+prebal+" Rs.");
                        System.out.println("Amount Deposit: "+damt);
                        c.displayC();   //Updated balance
                        break;
                    case 2:
                        System.out.print("Enter Amount for Withdraw: ");
                        double wamt=scan.nextDouble();
                        c.withdraw(wamt);
                        if (c.getBalance()<=3000){
                            //panelty prompted
                            System.out.println("**************************************");
                            System.out.println("your Balance is below Minimum Balance,\nHence Paenlty charges of 200Rp will be charge next time of Deposite.");
                            System.out.println("**************************************");
                        }
                        //reciept as follow
                        System.out.println("******Reciept******");
                        a.display_account_details();
                        System.out.println("Previous Balance: "+prebal+" Rs.");
                        System.out.println("Amount Withdraw: "+wamt);
                        c.displayC();   //Updated balance
                        break;
                    case 3:
                        System.out.println("******Reciept******");
                        a.display_account_details();
                        c.displayC();   //Updated balance
                        break;
                    case 4:
                        System.exit(0);
                }

            }
            else if (type.equals("Saving")){
                //Task to perform, not get intrest only
                int i= scan.nextInt();
                switch (i){
                    case 1:
                        //for deposit function get with intrest
                        System.out.print("Enter deposit Amount");
                        double damt=scan.nextDouble();
                        s.deposit(damt);   //Deposit method
                        s.intrest(damt);   //Intrest Apply
                        //reciept as follow
                        System.out.println("******Reciept******");
                        a.display_account_details();
                        System.out.println("Previous Balance: "+prebal+" Rs.");
                        System.out.println("Amount Deposit: "+damt);
                        s.displayC();   //Updated balance
                        break;
                    case 2:
                        System.out.print("Enter Amount for Withdraw: ");
                        double wamt=scan.nextDouble();
                        s.withdraw(wamt);
                        if (s.getBalance()<=3000){
                            //panelty prompted
                            System.out.println("**************************************");
                            System.out.println("your Balance is below Minimum Balance,\nHence Paenlty charges of 200Rp will be charge next time of Deposite.");
                            System.out.println("**************************************");
                        }
                        //reciept as follow
                        System.out.println("******Reciept******");
                        a.display_account_details();
                        System.out.println("Previous Balance: "+prebal+" Rs.");
                        System.out.println("Amount Withdraw: "+wamt);
                        s.displayC();   //Updated balance
                        break;
                    case 3:
                        System.out.println("******Reciept******");
                        a.display_account_details();
                        s.displayC();   //Updated balance
                        break;
                    case 4:
                        System.exit(0);
                }

            }

        }
    }
}

//  Create a class Account that stores customer name, account number,
//  and type of account.
class account{
    //instance variable name,account number,saving type
  String name;
   long acc_num;
  String type_acc;
    //constuctor create
    account(){

    }

    public String getName() {
        return name;
    }

    public long getAcc_num() {
        return acc_num;
    }

    public String getType_acc() {
        return type_acc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }

    public void setType_acc(String type_acc) {
        this.type_acc = type_acc;
    }

    //method to get user data
    void user_details(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Name: ");
        setName(scan.next());
        System.out.print("Enter account number: ");
        setAcc_num(scan.nextLong());
        System.out.println("Which type want to Register: ");
        System.out.println("1:\tCurrent");
        System.out.println("2:\tSaving");
        System.out.println("*************");
        int type= scan.nextInt();
        while ((type==1)||(type==2)){
            if (type==1){
                setType_acc("Current");
                break;
             }
            else if (type==2){
                setType_acc("Saving");
                break;
            }
            else {
            System.out.println("Enter Correct input");
            }
        }
    }
    void display_account_details(){
        System.out.println("Username: "+getName());
        System.out.println("Account Number: "+getAcc_num());
        System.out.println("Account type: "+getType_acc());
    }
}
class current extends account{

    private double balance;

    void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
//  deposit and withdrawal facilities
    //Once user want deposit money it will give input of money
    void deposit(double money){
        if (getBalance()<=3000){
            setBalance(getBalance()+money-200);
        }else {
            setBalance(getBalance() + money);
        }
    }
    // Permit withdrawal and update the balance (Check for the minimum balance, impose
    //penalty if necessary).
    void withdraw(double money){
        setBalance(getBalance() - money);
    }
    void displayC(){
        System.out.println("Your  balance is "+getBalance());
    }
}
//Saving acount can reuse code of current user
class saving extends current{
    // Compute interest and add to balance.
    // declare intrest rate 8%
    //usage is only to update balance
    public void intrest(double money){
        double balance=getBalance();
        System.out.println("Intrest Apply: "+(balance*0.08)+"Rs.");
        balance=(balance*0.08)+getBalance();
        setBalance(balance);
    }
    void displayS(){
        System.out.println("Your  balance is "+getBalance());
    }
}


