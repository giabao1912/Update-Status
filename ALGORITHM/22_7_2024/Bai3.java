/*
 * Bai 3 - Java Reverse String
 */
// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        String temp = "";
        for (int i = k.length() - 1; i >= 0; i--) {
            temp += k.charAt(i);
        }
        if (k.equals(temp)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
