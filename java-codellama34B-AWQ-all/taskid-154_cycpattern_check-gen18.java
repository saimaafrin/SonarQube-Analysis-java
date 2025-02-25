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

        boolean flag = false;
        int l = b.length();
        for (int i = 0; i < a.length() - l; i++) {
            if (a.substring(i, i + l).equals(b)) {
                return true;
            }
        }
        for (int i = 0; i < a.length() - l; i++) {
            String temp = a.substring(i, i + l);
            flag = true;
            for (int j = 0; j < l; j++) {
                if (b.charAt(j) != temp.charAt(l - j - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return flag;
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
