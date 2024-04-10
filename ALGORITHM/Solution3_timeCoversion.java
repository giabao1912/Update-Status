import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int h1 = (int) s.charAt(1) - '0';
        int h2 = (int) s.charAt(0) - '0';
        int hh = h2 * 10 + h1;
        String newTime;
        if (s.charAt(8) == 'A') {
            if (hh == 12) {
                newTime = "00";
            } else {
                newTime = String.format("%02d", hh);
            }
        } else {
            if (hh == 12) {
                newTime = "12";
            } else {
                hh += 12;
                newTime = String.format("%02d", hh);
            }
        }
        return newTime + s.substring(2, 8);
    }


}

public class Solution3_timeCoversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
