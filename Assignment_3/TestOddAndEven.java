/*
Q1. Write Java program involving two classes: OddAndEven and TestOddAndEven.
        OddAndEven has the following:
        ·Instance variables countOfOdd and countOfEven both of type int
        ·A method addNumber that takes a number as parameter and increment
        countOfOdd, if the number is odd, else increment countOfEven.
        ·A method toString that returns a string in the form: “Number of Odd: x,
        Number of Even : y”, where x and y are the values of the instance
        variables.
        The TestOddAndEven class first creates OddAndEven object, then in a loop, read a
        number and use it to call the addNumber method until the user enters Q. Finally, it
        prints the count of odd and even numbers entered.
*/
package Assignment_3;
import java.util.Scanner;

class OddAndEven{
    //Instance variable
    static int CountofOdd,CountOfEven;  //instance variable default take 0 value.
    public void addNumber(int x){   //Increment Odd/Even Method
    if (x%2==0)
        CountOfEven++;
    else
        CountofOdd++;
    }
}
public class TestOddAndEven{
    public static void main(String[] args){
        OddAndEven getvcount=new OddAndEven();  //call class OddAndEven
        Scanner n=new Scanner(System.in);
        char i='x';     //declare testing variable as char, because you can check int to with higher precedence
        System.out.println("Enter Number OR Press 'q' For exit");
        while (i!='q'){     //check input comes as char q, end loop
            System.out.println(" ");
            i=n.next().charAt(0);   //Character take as input
            if (i=='q'){
                break;  //this block,take 113=q also as int.
            }
            //convert this character and test it against in
            getvcount.addNumber((int)(i));
        } System.out.println("Numbers Of Odd Count is: "+getvcount.CountofOdd);
        System.out.println("Numbers of Even Count is "+getvcount.CountOfEven);
    }
}