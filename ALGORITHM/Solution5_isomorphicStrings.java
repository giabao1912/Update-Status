
/**
 * Solution5_isomorphicStrings
 */

import java.util.Scanner;

public class Solution5_isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        // set indicate = 1
        for (int i = 0; i < mapS.length; i++) {
            mapS[i] = 1;
            mapT[i] = 1;
        }

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (mapS[s1] == 1 && mapT[t1] == 1) {
                mapS[s1] = t1;
                mapT[t1] = s1;
            } else if (!(mapS[s1] == t1 && mapT[t1] == s1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution5_isomorphicStrings test1 = new Solution5_isomorphicStrings();
        String a = "egg";
        String b = "add";
        System.out.println("Test: " + test1.isIsomorphic(a, b));
    }
}
