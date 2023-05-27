/*
5. Write a java program to perform the following operations based upon
the choice entered by the user.1. Reading input from a file(f1) and
displaying it in the console
2.Read the input from the program itself
and write to the file(f2)
3.Concatenation of fi les (f1 and f2) TO f3 FILE  Appending information to file f3
 */

package Assignment_5;

import java.io.*;
import java.util.Scanner;

class fileOperations{
    void FileRead(String filename) throws IOException {
        //1. Reading input from a file(f1) and displaying it in the console
        File f=new File(filename);
        BufferedReader br=new BufferedReader(new FileReader(f));
        String line= br.readLine();
        //loop to read till null
        while (line!=null){
            System.out.println(line);
            line=br.readLine(); //Read again
        }
        br.close();
        System.out.println("**********************************************");
    }
    void FileWrite(String filename) throws IOException{
        //Read from console and append to new file
        File f=new File(filename);
        f.createNewFile();
        Scanner scan=new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new FileWriter(f,true)); //Append true
        bw.write(scan.nextLine());
        bw.newLine();
        System.out.println("Do you want to stop Write. Enter exit");
        bw.flush();
        bw.close();
    }
    void FileConcate(String filename) throws IOException{
        //Concanate 2 files
        BufferedReader br1=new BufferedReader(new FileReader("f1.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("f2.txt"));
        //Write to third file
        File f=new File(filename);
        BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
        String br1Line=br1.readLine();
        String br2Line=br2.readLine();
        while (br1Line != null){
            bw.write(br1Line);
            bw.newLine();
            br1Line=br1.readLine();
        }
        while (br2Line != null){
            bw.write(br2Line);
            bw.newLine();
            br2Line=br2.readLine();
        }
        bw.flush();
        bw.close();
        br1.close();
        br2.close();

    }
}

class switchCase{
    Scanner scan=new Scanner(System.in);
    public void switchCaseMethod(int n) throws IOException{
        fileOperations f=new fileOperations();
        switch (n){
            case 1:
                System.out.print("Enter File Want to Read. ");
                String readableFile=scan.next();
                f.FileRead(readableFile);
                break;
            case 2:
                System.out.print("Write File Name: ");
                String writableFile=scan.next();
                f.FileWrite(writableFile);
                break;
            case 3:
                System.out.print("New File Name: ");
                String concateFile=scan.next();
                f.FileConcate(concateFile);
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }
    }
}
public class Q5 {
    public static void  main(String[] args) throws IOException{
        Scanner scan=new Scanner(System.in);
        switchCase s=new switchCase();
        System.out.println("Enter Choice: ");
        System.out.println("1.\tRead File.");
        System.out.println("2.\tWrite File.");
        System.out.println("3.\tConcatenate(Merge) two files");
        s.switchCaseMethod(scan.nextInt());
    }
}
