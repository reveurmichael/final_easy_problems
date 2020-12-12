package final_easy;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        FinalExamEasy easy = new FinalExamEasy();

        System.out.println("\nQuestion 1");
        System.out.println(easy.checkIfANumberIsEven(10));
        System.out.println(easy.checkIfANumberIsEven(9));
        System.out.println(easy.checkIfANumberIsEven(101));

        System.out.println("\nQuestion 2");
        System.out.println(easy.getDayOfTheWeek(1));
        System.out.println(easy.getDayOfTheWeek(3));
        System.out.println(easy.getDayOfTheWeek(5));
        System.out.println(easy.getDayOfTheWeek(7));
        System.out.println(easy.getDayOfTheWeek(9));

        System.out.println("\nQuestion 3");
        System.out.println(easy.computePIWithSeriesExpansion(3));
        System.out.println(easy.computePIWithSeriesExpansion(5));
        System.out.println(easy.computePIWithSeriesExpansion(21));
        System.out.println(easy.computePIWithSeriesExpansion(41));
        System.out.println(easy.computePIWithSeriesExpansion(81));
        System.out.println(easy.computePIWithSeriesExpansion(191));
        System.out.println(easy.computePIWithSeriesExpansion(691));
        System.out.println(easy.computePIWithSeriesExpansion(8691));

        System.out.println("\nQuestion 4");
        easy.Question4(4);
        easy.Question4(7);
        easy.Question4(8);

        System.out.println("\nQuestion 5");
        easy.Question5(4);
        easy.Question5(7);
        easy.Question5(8);

        System.out.println("\nQuestion 6");
        HashMap<String, MyData> hashMap1 = easy.Question6(3);
        System.out.println(hashMap1.get("One"));
        System.out.println(hashMap1.get("Two"));
        System.out.println(hashMap1.get("Three"));
        System.out.println(hashMap1.get("Four"));
        HashMap<String, MyData> hashMap2 = easy.Question6(10);
        System.out.println(hashMap2.get("One"));
        System.out.println(hashMap2.get("Two"));
        System.out.println(hashMap2.get("Three"));
        System.out.println(hashMap2.get("Four"));

        System.out.println("\nQuestion 7");
        MyData[] arrMyDataQ7 = new MyData[4];
        arrMyDataQ7[0] = new MyData(5);
        arrMyDataQ7[1] = new MyData(7);
        arrMyDataQ7[2] = new MyData(1);
        arrMyDataQ7[3] = new MyData(10);
        MyData[] sortedArray = easy.sortArrayUsingBubbleOrSelectionSort(arrMyDataQ7);
        System.out.println(arrMyDataQ7[0]);
        System.out.println(arrMyDataQ7[1]);
        System.out.println(arrMyDataQ7[2]);
        System.out.println(arrMyDataQ7[3]);
        System.out.println(sortedArray[0]);
        System.out.println(sortedArray[1]);
        System.out.println(sortedArray[2]);
        System.out.println(sortedArray[3]);

        System.out.println("\nQuestion 8");
        MyData[] arrMyDataQ8 = new MyData[4];
        arrMyDataQ8[0] = new MyData(2);
        arrMyDataQ8[1] = new MyData(16);
        arrMyDataQ8[2] = new MyData(3);
        arrMyDataQ8[3] = new MyData(9);
        System.out.println(easy.Question8(arrMyDataQ8));

        System.out.println("\nQuestion 9");
        MyData[] arrMyDataQ9 = new MyData[4];
        arrMyDataQ9[0] = new MyData(2);
        arrMyDataQ9[1] = new MyData(16);
        arrMyDataQ9[2] = new MyData(3);
        arrMyDataQ9[3] = new MyData(9);
        System.out.println(easy.Question9(arrMyDataQ9));

        System.out.println("\nQuestion 10");
        MyData[] arrMyDataQ10 = new MyData[4];
        arrMyDataQ10[0] = new MyData(2);
        arrMyDataQ10[1] = new MyData(-6);
        arrMyDataQ10[2] = new MyData(10);
        arrMyDataQ10[3] = new MyData(7);
        System.out.println(easy.Question10(arrMyDataQ10));

        /*
        If your answers are correct, you should expect this output:

        Question 1
        false
        true
        true

        Question 2
        Monday
        Wednesday
        Friday
        Sunday
        FinalExamDay

        Question 3
        2.666666666666667
        3.466666666666667
        3.232315809405594
        3.189184782277596
        3.1659792728432157
        3.131176269454982
        3.138702486214805
        3.141362556952252

        Question 4
          4  3  2  1
          3  2  1
          2  1
          1
          7  6  5  4  3  2  1
          6  5  4  3  2  1
          5  4  3  2  1
          4  3  2  1
          3  2  1
          2  1
          1
          8  7  6  5  4  3  2  1
          7  6  5  4  3  2  1
          6  5  4  3  2  1
          5  4  3  2  1
          4  3  2  1
          3  2  1
          2  1
          1

        Question 5
          4  3  2  1  4  3  2  1
          3  2  1     3  2  1
          2  1        2  1
          1           1
          7  6  5  4  3  2  1  7  6  5  4  3  2  1
          6  5  4  3  2  1     6  5  4  3  2  1
          5  4  3  2  1        5  4  3  2  1
          4  3  2  1           4  3  2  1
          3  2  1              3  2  1
          2  1                 2  1
          1                    1
          8  7  6  5  4  3  2  1  8  7  6  5  4  3  2  1
          7  6  5  4  3  2  1     7  6  5  4  3  2  1
          6  5  4  3  2  1        6  5  4  3  2  1
          5  4  3  2  1           5  4  3  2  1
          4  3  2  1              4  3  2  1
          3  2  1                 3  2  1
          2  1                    2  1
          1                       1

        Question 6
        (MyData, value = 3)
        (MyData, value = 6)
        (MyData, value = 9)
        (MyData, value = 12)
        (MyData, value = 10)
        (MyData, value = 20)
        (MyData, value = 30)
        (MyData, value = 40)

        Question 7
        (MyData, value = 1)
        (MyData, value = 5)
        (MyData, value = 7)
        (MyData, value = 10)
        (MyData, value = 1)
        (MyData, value = 5)
        (MyData, value = 7)
        (MyData, value = 10)

        Question 8
        (MyData, value = 16)

        Question 9
        (MyData, value = 9)

        Question 10
        (MyData, value = 7)

         */
    }
}
