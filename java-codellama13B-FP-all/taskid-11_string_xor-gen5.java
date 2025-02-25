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

        int aLen = a.length();
        int bLen = b.length();
        int max = Math.max(aLen, bLen);
        String ans = "";
        if (aLen == bLen) {
            for (int i = 0; i < aLen; i++) {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    ans += "0";
                } else {
                    ans += "1";
                }
            }
        } else if (aLen > bLen) {
            for (int i = 0; i < max; i++) {
                if (i < bLen) {
                    if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                        ans += "0";
                    } else {
                        ans += "1";
                    }
                } else {
                    if (a.charAt(i) == '0') {
                        ans += "0";
                    } else {
                        ans += "1";
                    }
                }
            }
        } else if (aLen < bLen) {
            for (int i = 0; i < max; i++) {
                if (i < aLen) {
                    if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                        ans += "0";
                    } else {
                        ans += "1";
                    }
                } else {
                    if (b.charAt(i) == '0') {
                        ans += "0";
                    } else {
                        ans += "1";
                    }
                }
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
