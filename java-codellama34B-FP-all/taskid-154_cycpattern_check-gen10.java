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

        if (b.length() > a.length()) return false;
        if (a.contains(b)) return true;
        // Cyclic Rotation
        String rotate = b.substring(b.length() - 1) + b.substring(0, b.length() - 1);
        if (a.contains(rotate)) return true;
        // Cyclic Rotation
        rotate = rotate.substring(rotate.length() - 1) + rotate.substring(0, rotate.length() - 1);
        if (a.contains(rotate)) return true;
        // Cyclic Rotation
        rotate = rotate.substring(rotate.length() - 1) + rotate.substring(0, rotate.length() - 1);
        if (a.contains(rotate)) return true;
        // Cyclic Rotation
        rotate = rotate.substring(rotate.length() - 1) + rotate.substring(0, rotate.length() - 1);
        if (a.contains(rotate)) return true;
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
