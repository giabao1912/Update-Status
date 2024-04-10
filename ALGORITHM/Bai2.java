import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // long N = sc.nextLong();
        // System.out.println(N / 1000);
        long salary = sc.nextLong();

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        System.out.printf("My salary %s ", decimalFormat.format(salary));
    }
}
