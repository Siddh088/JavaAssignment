package Assignment_5;
/*
18.Write a program that defines an array of 5 elements. This array is later
initialized tocontain 10 elements. The program should throw a customized exception when
the arrayoverflows
 */

import java.util.*;

public class Q18 {
    public static void ValidateArraySize(int size) throws arrayWithFixSizeException{
        if (size>10){
            throw new arrayWithFixSizeException("ArrayOverFlowsException");
        }
    }
    public  static void main(String[] args) throws Exception {
        //Defined an Array with Capacity 5
        ArrayList<Integer> a=new ArrayList<>(5);
        Scanner scan=new Scanner(System.in);
        System.out.println("Array Max Size is 10.");
        while (true) {
            try {
                a.ensureCapacity(10);
                a.add(scan.nextInt());
                ValidateArraySize(a.size());
                System.out.println("Array Elements: "+a);
            } catch (arrayWithFixSizeException e) {
                System.out.println(e);
                break;
            }
        }
    }
}
class arrayWithFixSizeException extends Exception{
    arrayWithFixSizeException(String Excep){
        super(Excep);
    }

}

