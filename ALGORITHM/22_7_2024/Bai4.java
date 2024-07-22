/*
 * Bai 4 - End of file
 */

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNextLine()) {
            String k = sc.nextLine();
            System.out.print(count + " " + k);
            count++;
        }
    }
}