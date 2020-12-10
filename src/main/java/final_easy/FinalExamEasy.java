package final_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class MyData {
    // ATTENTION: Please don't modify anything on the MyData class.
    int value;

    public MyData(int v){
        this.value = v;
    }

    public String toString(){
        return "(" + this.value + ")";
    }
}

public class FinalExamEasy {
    // You can add functions to the FinalExamEasy class.
    // For existing functions, please don't change their name or return type.

    public boolean checkIfANumberIsEven(int number){
        /* TODO Question 1
        Write a program called checkIfANumberIsEven which
        checks if the int variable “number” is odd (return true),
        or even otherwise (return false).
        For example,
        2, 4, 6, 8, 10 are even,
        1, 3, 5, 7, 9 are odd.
        Please don't modify the return type (boolean).
        */
        return false; // TODO return something else
    }

    public String getDayOfTheWeek(int dayNumber){
        /* TODO Question 2
         Write a program called getDayOfTheWeek which returns
         “Monday”, “Tuesday”, ... “Sunday” if the int variable
         "dayNumber" is 1, ..., 7, respectively.
         Otherwise, it shall return "FinalExamDay".
         Please use a "switch-case-default" statement.
         Please don't modify the return type (String).
         Please use println instead of print.
         */
        return "FinalExamDay"; // TODO return something else
    }

    public double computePIWithSeriesExpansion(){
        /* TODO Question 3
        We know that PI = 4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
        Use a for or while loop to calculate this value.
        The loop stops when we are at ... -1/19 + 1/21.
        Please use a for or while loop statement.
        Please don't modify the return type (double).
        */
        double pi = 0.0;
        return pi;
    }

    public void print2DIntArray(int[][] arr2d){
        // This function helps you to debug if you want to
        // print a two-dimensional array of int type.
        int m = arr2d.length;
        if(m == 0) return;
        int n = arr2d[0].length;
        if(n == 0) return;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(arr2d[i][j] == 0)
                    System.out.print("   ");
                else
                    System.out.printf("%3d", arr2d[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] Question4(int size){
        int[][] arr2d = new int[size][size * 2 - 1];
        /* TODO Question 4
        Write
        1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
        1 2 3 4 5 6 7   7 6 5 4 3 2 1
        1 2 3 4 5 6       6 5 4 3 2 1
        1 2 3 4 5           5 4 3 2 1
        1 2 3 4               4 3 2 1
        1 2 3                   3 2 1
        1 2                       2 1
        1                           1
        Please don't modify the return type (void).
        For each line, please use println instead of print.
        */
        print2DIntArray(arr2d);
        return arr2d;
    }

    public int[][] Question5(int size){
        int[][] arr2d = new int[size][size];
        /*
        Write a programs called NumberPatternX
         that prompts user for the size
         (a non-negative integer in int); and prints the pattern as shown:
         size = 8, then the arr2d will be printed as:
         8 7 6 5 4 3 2 1
         7 6 5 4 3 2 1
         6 5 4 3 2 1
         5 4 3 2 1
         4 3 2 1
         3 2 1
         2 1
         1
         */
        print2DIntArray(arr2d);
        return arr2d;
    }

    public int[][] Question6(int size){
        int[][] arr2d = new int[size][size * 2];
        /*
         8 7 6 5 4 3 2 1 8 7 6 5 4 3 2 1
         7 6 5 4 3 2 1   7 6 5 4 3 2 1
         6 5 4 3 2 1     6 5 4 3 2 1
         5 4 3 2 1       5 4 3 2 1
         4 3 2 1         4 3 2 1
         3 2 1           3 2 1
         2 1             2 1
         1               1
         */
        print2DIntArray(arr2d);
        return arr2d;
    }

    public HashMap<String, MyData> Question7(){
        HashMap<String, MyData> hashMap = new HashMap<String, MyData>();
        /*
        Hashmap<String, MyData>
        One: 1
        Two: 9
        Three: 27
        Four: 81
        Five: 243
         */
        return hashMap;
    }

    public MyData[] Question8(MyData[] arrMyData){
        /*
         Sort an array of MyData, using bubblesort or selectionsort.
         ATTENTION: Please don't modify anything on the MyData class.
         On the contrary, you can add functions to the FinalExamEasy class.
        */
        return arrMyData;
    }

    public MyData Question9(MyData[] arrMyData){
        /*
         Find the 2nd maximum number of an array of MyData
        */
        return null; // TODO return something else
    }

    public MyData Question10(MyData[] arrMyData){
        /*
        Find the MyData object of an array of MyData whose value is the most in proximity to 10.
        */
        return null; // TODO return something else
    }

}
