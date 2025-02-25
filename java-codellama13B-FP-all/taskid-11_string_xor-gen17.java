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

        String ans = "";
        char[] a_char = a.toCharArray();
        char[] b_char = b.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (a_char[i] == '1' && b_char[i] == '1') {
                ans += "0";
            } else if (a_char[i] == '1' && b_char[i] == '0') {
                ans += "1";
            } else if (a_char[i] == '0' && b_char[i] == '1') {
                ans += "1";
            } else {
                ans += "0";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
