package Assignment_5;
/*
14. Write a java class which consists of 5 integer data array .
Overload constructor (Default &amp; normal) to initialize those integer data members.Provide a method
which sorts those integer data members using bubble sort.
 */

//class with consist of 5 integer data array

public class Q14 {

    public static void main(String[] args) {
        int[] x = {10,60,0,5,90};
        dataSet d = new dataSet(x);
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        d.bubbleSort(x);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
class dataSet{
    int[] arr;
    dataSet(int[] arr){
        this.arr= arr;
    }
    void bubbleSort(int[] arr) {
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    k = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = k;
                }

            }
        }
    }
}


