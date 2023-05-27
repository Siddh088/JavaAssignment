package Assignment_5;
/*
write a program for thread synchronization.
create an account class with required attributes and method as common resource.
create first thread to deposit money, second thread to withdraw
money and third thread to check balance
 */
import java.lang.Runnable;

public class Q23 {
    public static void main(String[] args) throws InterruptedException {
        Account a=new Account();
        a.setAmount(30000);
        depositThread d=new depositThread(a,3000);
        withdrawThread w=new withdrawThread(a,2000);
        checkBalThread cb=new checkBalThread(a);
        System.out.println("Amount Initial: "+a.getAmount());
        Thread.sleep(500);
        Thread Dt=new Thread(d);
        Thread Wt=new Thread(w);
        Thread Ct=new Thread(cb);
        Dt.start();
        //Dt.join();
        Wt.start();
        //Wt.join();
        Ct.start();
    }
}
class Account{
    //Account Attributes
    int uid=1;
    String uname="Sunil";
    int AccountNumber=987654;
    double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    Account(){}

    //Deposit Method Declare
    synchronized public void Deposit(double value) {
        System.out.println("---------Deposit Receipt -------------------");
        System.out.println("Id:"+uid);
        System.out.println("userName: "+uname);
        System.out.println("accountNumber: "+AccountNumber);
        setAmount(getAmount() + value);
        System.out.println("Amount After Deposit: " + getAmount());
        try {
            Thread.sleep(1000);  //Check Synchronize work or not
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    synchronized public void Withdraw(double value) {
        System.out.println("---------WithDraw Receipt -------------------");
        System.out.println("Id:"+uid);
        System.out.println("userName: "+uname);
        System.out.println("accountNumber: "+AccountNumber);
        setAmount(getAmount() - value);
        System.out.println("Amount After Withdraw: " + getAmount());
        try {
            Thread.sleep(1000);  //Check Synchronize work or not
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    synchronized public void CheckBalance(){
        System.out.println("---------Balance Receipt -------------------");
        System.out.println("Id:"+uid);
        System.out.println("userName: "+uname);
        System.out.println("accountNumber: "+AccountNumber);
        System.out.println("Your Account Balance is: "+getAmount());
        try {
            Thread.sleep(1000);  //Check Synchronize work or not
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class depositThread implements Runnable{
    Account a;
    double amount;
    depositThread(Account a,double amount){
        this.a=a;
        this.amount=amount;
    }
    @Override
    public void run() {
        a.Deposit(amount);
    }
}
class withdrawThread implements Runnable{
    Account b;
    double amount;
    withdrawThread(Account b,double amount){
        this.b=b;
        this.amount=amount;
    }
    @Override
    public void run() {
        b.Withdraw(amount);
    }
}
class checkBalThread implements Runnable{
    Account c;
    public checkBalThread(Account c) {
        this.c = c;
    }
    @Override
    public void run() {
        c.CheckBalance();
    }
}