
// check Fibonacci
import java.util.Scanner;

public class timso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        for (int j = 0; j < numbers.length; j++) {
            if (checkFibonacci(numbers[j])) {
                System.out.print(numbers[j] + " ");
            }
        }
    }

    public static boolean checkFibonacci(int numbers) {
        if (numbers == 0 || numbers == 1)
            return true;
        int a = 0, b = 1;
        while (b < numbers) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == numbers;
    }
}