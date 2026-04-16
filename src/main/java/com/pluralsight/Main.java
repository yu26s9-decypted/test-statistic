package com.pluralsight;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    static void main() {
        int[] testScores = {89, 39, 29, 74, 92, 84, 92, 88, 55, 100};
        //                  0   1   2   3   4   5   6   7   8   9   10

        // 11 values.  middle index would be 5.    (11 -1) / 2  = 5
        int testSum = 0;


        int min = testScores[0];
        int high = testScores[0];
        int median = 0;
       Arrays.sort(testScores);





        for (int score : testScores) {

            testSum += score;
            if (score < min){
                min = score;
            }
            if (score > high){
                high = score;
            }

    }

        if (testScores.length % 2 == 1) {
            System.out.println("test score array is odd!");
            median = testScores[testScores.length / 2];
        }  else if (testScores.length % 2 == 0) {
            System.out.println("test score array is even.");
            median=
                  (testScores[testScores.length / 2] +
                          testScores[(testScores.length / 2 - 1)]) / 2;

        }



        int average = testSum / testScores.length;

        System.out.println((Arrays.toString(testScores)));
        System.out.printf("\n Average score: %s", average);
        System.out.printf("\n Minimum score: %s", min);
        System.out.printf("\n Highest score: %s", high);
        System.out.printf("\n Median: %s", median);





    }
}
