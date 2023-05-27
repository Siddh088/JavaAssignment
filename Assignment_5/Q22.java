package Assignment_5;
/*
22. Write a program that contains method even and another
method odd , call both of the methods in main and print their
values after 2000 millisecond and make sure that another method
should not be called before the task of one is complete .
 */

import java.util.ArrayList;
public class Q22 {
    public static void main(String[] args) throws InterruptedException {
        callableMethod c=new callableMethod();
        int[] n={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        EvenThread m=new EvenThread(c,n);
        OddThread o=new OddThread(c,n);
        Thread.sleep(2000);
        m.start();  //Calling both Separate
        m.join(2000);
        //Method are not declare as  Hence it not work well
        o.start();
    }
}
class callableMethod{
    public  void EvenMethod(int[] n){
        System.out.println("-----------------Even Set-----------------------");
        ArrayList<Integer> a=new ArrayList<>();
        int i=0;
        while (i<=n.length){
            if (n[i]%2==0){
                a.add(n[i]);
                i++;
            }i++;
        }System.out.println(a);
        try{
            Thread.sleep(10);   //Just For trial
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
     public  void OddMethod(int[] n){
        System.out.println("-----------------Odd Set-----------------------");
        ArrayList<Integer> a=new ArrayList<>();
        int i=0;
        while (i<n.length){
            if (n[i]%2==1){
                a.add(n[i]);
                i++;
            }i++;
        }System.out.println(a);
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class EvenThread extends Thread{
    callableMethod c; //instance variable for Object Reference in Main
    int[] n;    //List of numbers given to method,for call from Main just create Constructor;
    EvenThread(callableMethod c,int[] n){
        this.c=c;                       //Object reference
        this.n=n;                       //ArraySet Reference
    }
    public  void run(){
        c.EvenMethod(n);
    }
}
class OddThread extends Thread{
    callableMethod c; //instance variable for Object Reference in Main
    int[] n;    //List of numbers given to method,for call from Main just create Constructor;
    OddThread(callableMethod c,int[] n){
        this.c=c;                       //Object reference
        this.n=n;                       //ArraySet Reference
    }
    public  void run(){
        c.OddMethod(n);
    }
}

