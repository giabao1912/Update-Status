import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String k = sc.nextLine();
        // String k = " Fighting adsasdad sadasd ";
        // System.out.println(k.toUpperCase());
        // System.out.println(k.toLowerCase());
        // System.out.println(k.length());
        // System.out.println(k.charAt(5));
        // System.out.println(k.indexOf("a"));
        // System.out.println(k.lastIndexOf("a"));
        // System.err.println(k.substring(23));
        // System.out.println(k.trim());
        // System.out.println(k.isEmpty());

        // for (int i = k.length() - 1; i >= 0; i--) {
        // System.out.print(k.charAt(i));
        // }

        // int x = sc.nextInt();

        System.out.println(CheckNumber(123321));

    }

    public static String CheckNumber(long x) {
        long temp = x;
        long res = 0;
        while (temp != 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        if (res == x)
            return "YES";
        return "NO";
    }
}
