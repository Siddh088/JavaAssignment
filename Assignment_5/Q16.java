package Assignment_5;
/*
16.Define an Exception NoMatchFoundException that is thrown when Kolkata
isnot found from the following set of strings.city name ={ Kolkata, Chennai,
Mumbai, Delhi, Bangalore, Amedabad}
 */

import java.util.ArrayList;
import java.util.Scanner;

class ExceptionNotFound extends Exception{
    ExceptionNotFound(String a){
        super(a);
    }
}
public class Q16 {
    static void Validatekolkata(ArrayList list) throws ExceptionNotFound{
        int i=0;
        int flag=0;
        while (i!= list.size()){
            if (list.get(i).equals("Kolkata")){
                i++;
                flag=1;
            }else{i++;}
        }
        if (flag==1){
            System.out.println("Kolkata City Found");
        }else {
            throw new ExceptionNotFound("NoMatchFoundException") ;
        }
    }
    public static void main(String[] args){
        ArrayList<String> CityNames=new ArrayList<String>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Cities Names");
        for (int i=1;i<=5;i++){
            System.out.print("City "+i+": ");
            CityNames.add(scan.next());
        }
        try{
            Validatekolkata(CityNames);
            System.out.println("Cities List: "+CityNames);
        }catch (ExceptionNotFound e){
            System.out.println(e);
        }
    }
}
