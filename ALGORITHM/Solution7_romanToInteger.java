
/**
 * Solution7_romanToInteger
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution7_romanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> test = new HashMap<>();
        test.put('I', 1);
        test.put('V', 5);
        test.put('X', 10);
        test.put('L', 50);
        test.put('C', 100);
        test.put('D', 500);
        test.put('M', 1000);

        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && test.get(s.charAt(i)) < test.get(s.charAt(i + 1))) {
                a -= test.get(s.charAt(i));
            } else {
                a += test.get(s.charAt(i));
            }
        }
        return a;
    }

}