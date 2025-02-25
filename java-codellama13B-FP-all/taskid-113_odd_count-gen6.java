import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of strings, where each string consists of only digits, return an array array list.
    // Each element i of the output should be "the number of odd elements in the
    // string i of the input." where all the i's should be replaced by the number
    // of odd digits in the i'th string of the input.
    // >>> oddCount((new ArrayList<String>(Arrays.asList((String)"1234567"))))
    // (new ArrayList<String>(Arrays.asList((String)"the number of odd elements 4n the str4ng 4 of the 4nput.")))
    // >>> oddCount((new ArrayList<String>(Arrays.asList((String)"3", (String)"11111111"))))
    // (new ArrayList<String>(Arrays.asList((String)"the number of odd elements 1n the str1ng 1 of the 1nput.", (String)"the number of odd elements 8n the str8ng 8 of the 8nput.")))
    public static ArrayList<String> oddCount(ArrayList<String> lst) {

        // The odd number of digits is the sum of all odd digits.
        // The even number of digits is half of the sum of all odd digits.
        int sum = 0;
        ArrayList<String> answer = new ArrayList<String>();
        for (String s : lst) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) % 2 == 1) {
                    sum += 1;
                }
            }
            String str = "the number of odd elements in the string ";
            str = str + String.valueOf(s.length()) + " of the input.";
            answer.add(str);
        }
        return answer;
    }
    public static void main(String[] args) {
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"1234567")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 4n the str4ng 4 of the 4nput.")))));
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"3", (String)"11111111")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 1n the str1ng 1 of the 1nput.", (String)"the number of odd elements 8n the str8ng 8 of the 8nput.")))));
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"271", (String)"137", (String)"314")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 2n the str2ng 2 of the 2nput.", (String)"the number of odd elements 3n the str3ng 3 of the 3nput.", (String)"the number of odd elements 2n the str2ng 2 of the 2nput.")))));
    }

}
