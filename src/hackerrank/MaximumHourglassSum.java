package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximumHourglassSum {

    public static void main(String[] args) throws IOException {

        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(hourglassSum(arr));

    }

    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int col = 0;
        int row = 0;

        while (row <= 3) {
            while (col <= 3) {
                currSum += arr[row][col]; // a
                currSum += arr[row][col + 1]; // b
                currSum += arr[row][col + 2]; // c
                currSum += arr[row + 1][col + 1]; // d
                currSum += arr[row + 2][col]; // e
                currSum += arr[row + 2][col + 1]; // f
                currSum += arr[row + 2][col + 2]; // g

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                currSum = 0;
                col++;
            }
            col = 0;
            row++;
        }

        return maxSum;
    }
}
