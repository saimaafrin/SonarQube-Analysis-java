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

        String res = "";
        for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if(i < a.length() && i < b.length()) {
                res += Integer.toString(Integer.parseInt(a.substring(i, i + 1)) ^ Integer.parseInt(b.substring(i, i + 1)));
            } else if(i >= a.length()) {
                res += b.substring(i, i + 1);
            } else if(i >= b.length()) {
                res += a.substring(i, i + 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
