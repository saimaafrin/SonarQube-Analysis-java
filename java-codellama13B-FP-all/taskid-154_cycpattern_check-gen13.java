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

        String aa = "";
        String bb = "";
        String cc = "";
        String dd = "";
        String ee = "";
        for(int i = 0; i < b.length(); i++) {
            aa = aa + b.charAt(i);
            bb = bb + b.charAt(b.length() - 1 - i);
            cc = cc + aa.charAt(i);
            dd = dd + bb.charAt(i);
            ee = ee + cc.charAt(i) + dd.charAt(i);
        }
        if (a.contains(b) || a.contains(aa) || a.contains(bb) || a.contains(cc) || a.contains(dd) || a.contains(ee)) {
            return true;
        } else {
            return false;
        }
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
