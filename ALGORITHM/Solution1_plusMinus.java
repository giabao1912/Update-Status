//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
//Print the decimal value of each fraction on a new line with 6 places after the decimal.

// The first line contains an integer,n, the size of the array.
// The second line contains n space-separated integers that describe arr[n] .

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//input

class Result {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        int n = arr.size();
        for (Integer number : arr) {
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.printf("%.6f\n", (double) countPositive / n);
        System.out.printf("%.6f\n", (double) countNegative / n);
        System.out.printf("%.6f\n", (double) countZero / n);
    }
}

public class Solution1_plusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
