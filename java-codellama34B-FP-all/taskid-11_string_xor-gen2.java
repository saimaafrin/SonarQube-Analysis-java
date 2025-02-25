import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input are two strings a and b consisting only of 1s and 0s.
    // Perform binary XOR on these inputs and return result also as a string.
    // >>> stringXor(("010"), ("110"))
    // ("100")
    public static String stringXor(String a, String b) {

        // Your code here
        int[] num1 = new int[a.length()];
        int[] num2 = new int[a.length()];
        int[] res = new int[a.length()];
        for(int i = 0; i < a.length(); i++){
            num1[i] = Character.getNumericValue(a.charAt(i));
            num2[i] = Character.getNumericValue(b.charAt(i));
            res[i] = (num1[i] ^ num2[i]);
        }
        String ans = "";
        for(int i = 0; i < a.length(); i++){
            ans += String.valueOf(res[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
