package final_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.math.*;



class MyData {
    // ATTENTION: Please don't modify anything on the MyData class.
    int value;

    public MyData(int v){
        this.value = v;
    }

    public String toString(){
        return "(MyData, value = " + this.value + ")";
    }
}

public class FinalExamEasy {
    // You can add functions to the FinalExamEasy class.
    // For existing functions, please don't change their name or return type.

    public boolean checkIfANumberIsEven(int number){
        /* TODO Question 1
        Write a program called checkIfANumberIsEven which
        checks if the int variable "number" is odd (return true),
        or even otherwise (return false).
        For example,
        2, 4, 6, 8, 10 are even,
        1, 3, 5, 7, 9 are odd.
        Please don't modify the return type (boolean).
        */
        // TODO: write your code here.
        return false; // TODO return something else
    }

    public String getDayOfTheWeek(int dayNumber){
        /* TODO Question 2
         Write a program called getDayOfTheWeek which returns
         "Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday", "Sunday" if the int variable
         "dayNumber" is 1, ..., 7, respectively.
         Otherwise, it shall return "FinalExamDay".
         Please use a "switch-case-default" statement.
         Please don't modify the return type (String).
         */
        // TODO: write your code here.
        return "FinalExamDay"; // TODO return something else
    }

    public double computePIWithSeriesExpansion(int N){
        /* TODO Question 3
        We know that PI = 4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
        Use a for or while loop to calculate this value.
        The loop stops when the last term is 1/N.
        for example,
        if N = 21, then the program calculates:
        4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... -1/19 + 1/21)
        if N = 23, then the program calculates:
        4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... +1/21 - 1/23)

        Please use a while loop statement.
        Please don't modify the return type (double).

        The N argument will be greater or equal to 3. And will always be an odd number.
        */
        double pi = 1.0;
        // TODO: write your code here.
        return pi;
    }

    public void print2DIntArrayAndChangeNegativeToZero(int[][] arr2d){
        // YOU DON'T NEED TO MODIFY THIS FUNCTION.
        // This function helps you to
        // print a two-dimensional array of int type.
        // 0s and negative numbers are printed as " ".
        int m = arr2d.length;
        if(m == 0) return;
        int n = arr2d[0].length;
        if(n == 0) return;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(arr2d[i][j] <= 0) {
                    System.out.print("   "); // 0s and negative numbers are printed as " ".
                    arr2d[i][j] = 0; // Change Negative Numbers to 0
                }
                else
                    System.out.printf("%3d", arr2d[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] Question4(int size){
        int[][] arr2d = new int[size][size]; // Don't change this line of code.
        /*
        TODO:
         Represent one triangle in the arr2d, which, when printed, will show this pattern (e.g. size = 8):
         8 7 6 5 4 3 2 1
         7 6 5 4 3 2 1
         6 5 4 3 2 1
         5 4 3 2 1
         4 3 2 1
         3 2 1
         2 1
         1

         Note that numbers that are equal or smaller than 0 are printed as " "(space).
         So don't worry if you have negative numbers. They will be printed as " ".
         As, in the returned arr2d, all negative numbers will be converted to 0, automatically,
         by virtue of calling the function print2DIntArrayAndChangeNegativeToZero().
         You don't need to write the print function. Do things with the arr2d then it's OK.
         */
        // TODO: write your code here.

        print2DIntArrayAndChangeNegativeToZero(arr2d); // Don't change this line of code.
        return arr2d; // Don't change this line of code.
    }

    public int[][] Question5(int size){
        int[][] arr2d = new int[size][size * 2]; // Don't change this line of code.
        /*
         Represent two triangles in the arr2d, which, when printed, will show this pattern (e.g. size = 8):
         8 7 6 5 4 3 2 1 8 7 6 5 4 3 2 1
         7 6 5 4 3 2 1   7 6 5 4 3 2 1
         6 5 4 3 2 1     6 5 4 3 2 1
         5 4 3 2 1       5 4 3 2 1
         4 3 2 1         4 3 2 1
         3 2 1           3 2 1
         2 1             2 1
         1               1

         Note that numbers that are equal or smaller than 0 are printed as " "(space).
         So don't worry if you have negative numbers. They will be printed as " ".
         As, in the returned arr2d, all negative numbers will be converted to 0, automatically,
         by virtue of calling the function print2DIntArrayAndChangeNegativeToZero().
         You don't need to write the print function. Do things with the arr2d then it's OK.
         */
        // TODO: write your code here.

        print2DIntArrayAndChangeNegativeToZero(arr2d); // Don't change this line of code.
        return arr2d; // Don't change this line of code.
    }

    public HashMap<String, MyData> Question6(int N){
        HashMap<String, MyData> hashMap = new HashMap<String, MyData>(); // Don't change this line of code.
        /*
        TODO:
         Add elements to the hashMap (of type Hashmap<String, MyData>),
         so that the hashmap will have contents that follow this pattern:

        if N = 2, key-value pairs are (exhaustively):
        "One": (MyData, value = 2)
        "Two": (MyData, value = 4)
        "Three": (MyData, value = 6)
        "Four": (MyData, value = 8)

        if N = 3, key-value pairs are (exhaustively):
        "One": (MyData, value = 3)
        "Two": (MyData, value = 6)
        "Three": (MyData, value = 9)
        "Four": (MyData, value = 12)

        if N = 4, key-value pairs are (exhaustively):
        "One": (MyData, value = 4)
        "Two": (MyData, value = 8)
        "Three": (MyData, value = 12)
        "Four": (MyData, value = 16)

        if N = 10, key-value pairs are (exhaustively):
        "One": (MyData, value = 10)
        "Two": (MyData, value = 20)
        "Three": (MyData, value = 30)
        "Four": (MyData, value = 40)

        What should be the value of MyData objects when N = 9, or N = 99, or any other integer value?
        It's up to you to find out the pattern, although it's very clear from those several examples.

        Note that there are only four entries ("One", "Two", "Three", "Four") in the hashMap.
         */

        // TODO: write your code here.

        return hashMap; // Don't change this line of code.
    }

    public MyData[] sortArrayUsingBubbleOrSelectionSort(MyData[] arrMyData){
        /*
        TODO:
         Sort an array of MyData, using bubblesort or selectionsort.
         ATTENTION: Please don't modify anything on the MyData class.
         On the contrary, you can add functions to the FinalExamEasy class.

         Note that arrMyData is passed in as an parameter, and then returned as the return value.

         When tested, the length of input arrMyData will be at least 2. So don't bother to check that.
        */

        int size = arrMyData.length;
        // TODO: write your code here.

        return arrMyData; // Don't change this line of code.
    }

    public MyData Question8(MyData[] arrMyData){
        /*
        TODO:
         Find the maximum number of an array of MyData (arrMyData).
         Note that returned type is MyData.

         When tested, the length of input arrMyData will be at least 2. So don't bother to check that.

        */
        // TODO: write your code here.

        return null; // TODO return something else
    }

    public MyData Question9(MyData[] arrMyData){
        /*
        TODO:
         Find the 2nd maximum number of an array of MyData (arrMyData)
         Note that returned type is MyData.

         When tested, the length of input arrMyData will be at least 2. So don't bother to check that.

        */
        // TODO: write your code here.

        return null; // TODO return something else
    }

    public MyData Question10(MyData[] arrMyData){
        /*
        Find the MyData object in an array of MyData (arrMyData) whose value is the most in proximity to 5.

        When tested, the length of input arrMyData will be at least 2. So don't bother to check that.
        */
        // TODO: write your code here.

        return null; // TODO return something else
    }
}
