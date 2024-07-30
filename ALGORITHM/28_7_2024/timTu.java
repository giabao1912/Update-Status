import java.util.Scanner;

public class timTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputArray = sc.nextLine();
        String[] input = inputArray.split(" ");

        String shortLetterLast = null;
        String longLetterFirst = null;

        for (String word : input) {
            if (shortLetterLast == null || word.length() <= shortLetterLast.length()) {
                shortLetterLast = word;
            }
        }
        for (String word : input) {
            if (longLetterFirst == null || word.length() >= longLetterFirst.length()) {
                longLetterFirst = word;
                break;
            }
        }

        System.out.print(shortLetterLast + " " + longLetterFirst);
    }
}