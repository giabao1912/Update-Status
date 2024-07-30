import java.util.Scanner;

public class timSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputArray = sc.nextLine();
        String[] input = inputArray.split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int j = 0; j < numbers.length; j++) {
            if (checkNumber(numbers[j])) {
                System.out.print(numbers[j] + " ");
            }
        }
    }

    public static boolean checkNumber(int n) {
        if (n == 0 || n == 1)
            return true;
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    }
}