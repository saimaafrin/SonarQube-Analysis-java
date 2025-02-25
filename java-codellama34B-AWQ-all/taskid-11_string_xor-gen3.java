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

        int i = 0, result = 0;
        while (i < a.length() || i < b.length()) {
            if (i < a.length() && i < b.length())
                result += (a.charAt(i) - '0') ^ (b.charAt(i) - '0');
            else if (i < a.length())
                result += a.charAt(i) - '0';
            else if (i < b.length())
                result += b.charAt(i) - '0';
            i++;
        }
        if (result == 0)
            return "0";
        String r = "";
        while (result > 0) {
            if (result % 2 == 1)
                r += "1";
            else
                r += "0";
            result /= 2;
        }
        return new StringBuilder(r).reverse().toString();
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
