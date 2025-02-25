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

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        if (aChars.length == 0 && bChars.length == 0) {
            return "";
        }
        if (aChars.length == 0) {
            return String.valueOf(bChars);
        }
        if (bChars.length == 0) {
            return String.valueOf(aChars);
        }
        char[] result = new char[Math.max(aChars.length, bChars.length)];
        for (int i = 0; i < result.length; i++) {
            if (i >= aChars.length) {
                result[i] = bChars[i];
            } else if (i >= bChars.length) {
                result[i] = aChars[i];
            } else {
                result[i] = (aChars[i] == bChars[i]) ? '0' : '1';
            }
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
