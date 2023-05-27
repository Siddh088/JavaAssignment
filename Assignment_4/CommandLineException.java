/*
Write a program  for exception handling. Which will take two command line arguments from the user
if the user does not provide that arguments it should throw exception.
 */

package Inheritance;

public class CommandLineException {
    public static void  main(String[] args){
        try {
            String s1 = args[0];
            String s2 = args[1];
            System.out.println("Argument 1 is :"+s1);
            System.out.println("Argument 2 is :"+s2);
        }
        catch (Exception e){
            System.out.println("execute Program with two arguments");
        }
    }
}
