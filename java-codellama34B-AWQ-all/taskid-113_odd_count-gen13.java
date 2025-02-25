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

        String str = "the number of odd elements ";
        String in = " in the str";
        String out = "ng ";
        String inp = " of the ";
        String inpu = "nput.";
        String[] st = new String[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            st[i] = lst.get(i);
        }
        int[] count = new int[st.length];
        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[i].length(); j++) {
                if (Integer.parseInt(st[i].charAt(j) + "") % 2 == 1) {
                    count[i]++;
                }
            }
        }
        int[] num = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            int numb = count[i];
            int digit = 0;
            while (numb > 0) {
                numb /= 10;
                digit++;
            }
            num[i] = digit;
        }
        String[] res = new String[count.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = str + count[i] + in + num[i] + out + inp + num[i] + inpu;
        }
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < res.length; i++) {
            result.add(res[i]);
        }
        return result;
    }
    public static void main(String[] args) {
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"1234567")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 4n the str4ng 4 of the 4nput.")))));
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"3", (String)"11111111")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 1n the str1ng 1 of the 1nput.", (String)"the number of odd elements 8n the str8ng 8 of the 8nput.")))));
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"271", (String)"137", (String)"314")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 2n the str2ng 2 of the 2nput.", (String)"the number of odd elements 3n the str3ng 3 of the 3nput.", (String)"the number of odd elements 2n the str2ng 2 of the 2nput.")))));
    }

}
