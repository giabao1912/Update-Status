import java.util.Scanner;

/**
 * Bai1 - Data Formatting
 */
// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.println();
            // Complete this line
            System.out.printf("%-15s", s1);
            System.err.printf("%03d", x);
        }
        System.out.println("================================");
    }
}