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
        if(a.length() != b.length()) return "-1";
        String ret = "";
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        int x;
        for(int i = 0; i < arr.length; i++) {
            x = (arr[i] - '0') ^ (brr[i] - '0');
            ret += x + "";
        }
        return ret;
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
