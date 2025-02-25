import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given 2 words. You need to return true if the second word or any of its rotations is a substring in the first word
    // >>> cycpatternCheck(("abcd"), ("abd"))
    // (false)
    // >>> cycpatternCheck(("hello"), ("ell"))
    // (true)
    // >>> cycpatternCheck(("whassup"), ("psus"))
    // (false)
    // >>> cycpatternCheck(("abab"), ("baa"))
    // (true)
    // >>> cycpatternCheck(("efef"), ("eeff"))
    // (false)
    // >>> cycpatternCheck(("himenss"), ("simen"))
    // (true)
    public static boolean cycpatternCheck(String a, String b) {

        int n = a.length();
        int m = b.length();
        if (m > n)
            return false;
        char[] b_arr = b.toCharArray();
        for (int i = 0; i < n - m + 1; i++) {
            if (a.substring(i, i + m).equals(b)) {
                return true;
            }
        }
        int j = 0;
        while (j < m - 1) {
            char t = b_arr[0];
            b_arr[0] = b_arr[m - 1];
            b_arr[m - 1] = t;
            b = new String(b_arr);
            for (int i = 0; i < n - m + 1; i++) {
                if (a.substring(i, i + m).equals(b)) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
    assert(cycpatternCheck(("xyzw"), ("xyw")) == (false));
    assert(cycpatternCheck(("yello"), ("ell")) == (true));
    assert(cycpatternCheck(("whattup"), ("ptut")) == (false));
    assert(cycpatternCheck(("efef"), ("fee")) == (true));
    assert(cycpatternCheck(("abab"), ("aabb")) == (false));
    assert(cycpatternCheck(("winemtt"), ("tinem")) == (true));
    }

}
