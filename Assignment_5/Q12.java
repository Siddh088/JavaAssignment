package Assignment_5;

import java.util.ArrayList;
import java.util.Collections;

public class Q12 {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i< args.length;i++) {
            //Converting String to int and Using generic Interger
            a.add(Integer.parseInt(args[i]));
        }
        Collections.sort(a);        //Simply sort with Collection.
        System.out.println(a);
    }
}