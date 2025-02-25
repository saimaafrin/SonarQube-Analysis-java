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

        // If either string is shorter than the other, then we pad with 0s.
        int maxlen = Math.max(a.length(), b.length());
        a = String.format("%" + maxlen + "s", a).replace(' ', '0');
        b = String.format("%" + maxlen + "s", b).replace(' ', '0');
        // Now we simply iterate over each character in both strings,
        // converting them to ints and xor-ing the two ints.
        // We then convert the result back to a string.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxlen; ++i) {
            int x = a.charAt(i) - '0';
            int y = b.charAt(i) - '0';
            sb.append((x ^ y) % 2);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
