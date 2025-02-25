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

        // your code
        if (a.length() == 0 && b.length() == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            res.append(
                ((i < a.length()) ? a.charAt(i) : '0')
                ^
                ((i < b.length()) ? b.charAt(i) : '0')
            );
        }
        return res.toString();
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
