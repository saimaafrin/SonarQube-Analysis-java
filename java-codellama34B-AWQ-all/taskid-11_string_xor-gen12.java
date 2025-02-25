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

        // Write your code here
        if (a == null && b == null) {
            return null;
        } else if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        StringBuilder result = new StringBuilder();
        int length = Math.max(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            boolean a_bit = i < a.length() ? a.charAt(a.length() - 1 - i) == '1' : false;
            boolean b_bit = i < b.length() ? b.charAt(b.length() - 1 - i) == '1' : false;

            if (a_bit ^ b_bit) {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
