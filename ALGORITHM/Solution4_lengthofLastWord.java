
/**
 * Solution4_lengthofLastWord
 */
import java.util.Scanner;

public class Solution4_lengthofLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean checkLastWord = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
                checkLastWord = false;
            } else if (!checkLastWord) {
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        Solution4_lengthofLastWord solution = new Solution4_lengthofLastWord();

        // Test cases
        String[] testStrings = {
            "Hello World",
            "   fly me   to   the moon  ",
            "luffy is still joyboy",
            "   ",
            "day    "
        };

        for(String test : testStrings) {
            System.out.println("The length of the last word in \"" + test + "\" is: " + solution.lengthOfLastWord(test));
        }
    }
}