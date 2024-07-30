import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputArray = sc.nextLine();
        String[] input = inputArray.split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int number : numbers) {
            if (checkPrime(number)) {
                System.out.print(number + " ");
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
        return count == 2;
    }
}
