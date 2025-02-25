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

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int aLen = a1.length;
        int bLen = b1.length;
        for (int i = 0; i < aLen; i++) {
            if (i < bLen) {
                char aChar = a1[i];
                char bChar = b1[i];
                char xor = (char) (aChar ^ bChar);
                sb.append(xor);
            } else {
                sb.append(a1[i]);
            }
        }
        if (aLen < bLen) {
            for (int j = aLen; j < bLen; j++) {
                sb.append(b1[j]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
