import java.util.Scanner;

public class timSop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputArray = sc.nextLine();
        String[] input = inputArray.split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int j = 0; j < numbers.length; j++) {
            if (checkPrime(numbers[j])) {
                System.out.print(numbers[j] + " ");
            }
        }
    }

    public static boolean checkPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
