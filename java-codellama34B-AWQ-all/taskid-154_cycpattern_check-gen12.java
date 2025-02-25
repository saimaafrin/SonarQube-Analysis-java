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

        String bRotation;
        String bRotationReverse;
        if (b.length() > a.length()) {
            return false;
        }
        if (a.contains(b)) {
            return true;
        } else {
            bRotation = rotateString(b, 1);
            bRotationReverse = rotateString(b, b.length() - 1);
            while (!bRotation.equals(bRotationReverse)) {
                if (a.contains(bRotation)) {
                    return true;
                }
                bRotation = rotateString(bRotation, 1);
                bRotationReverse = rotateString(bRotationReverse, -1);
            }
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
