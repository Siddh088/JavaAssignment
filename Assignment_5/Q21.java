package Assignment_5;
/*
Create three classes message1 ,message2 and message3
and call their methods one after another and display message
.In above case set priority level of all object and run them
according to priority. Create another class message4 and make
sure it should not be called before previously define class. Hint
use join
 */

import java.lang.Thread;    //Thread Package
import java.lang.Runnable;  //Implementation of Thread Package

//Because extend Not Allow to give access to create more than 1 Thread
class message1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Message 1");
    }
}
class message2 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Message 2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}
}
class message3 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Message 3");
    }
}
class message4 implements Runnable{
    @Override
    public void run() {
        System.out.println("I will Not Call Before 3 classes");
    }

}

public class Q21 {
    public static void main(String[] args) throws InterruptedException {
        //Calling Threads 1,2,3
        message1 m1=new message1();//Bullet creation
        Thread t1=new Thread(m1);
        message2 m2=new message2();
        Thread t2=new Thread(m2);
        message3 m3=new message3();
        Thread t3=new Thread(m3);
        message4 m4=new message4();
        Thread t4=new Thread(m4);
        //Set priorities to thread
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.join(2000);  //t2 will not execute until t1 finished with highest priority also t2 will waiting for 1s finished
        t2.start();
        t2.join(2000);
        t3.start();
        t3.join(2000);
        t4.start();
        //Message 1,2,3 always wait for completionof work, tested in the method with sleep method.
    }
}
