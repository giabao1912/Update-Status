
/**
 * Bai2 - Java Loop 2
 */
//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int temp = a;
            for (int j = 0; j < n; j++) {
                temp += Math.pow(2, j) * b;
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
