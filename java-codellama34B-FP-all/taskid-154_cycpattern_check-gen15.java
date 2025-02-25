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

        if (a.length() < b.length()) return false;
        int[] pat = new int[b.length()];
        pat[0] = b.charAt(0) - 'a';
        int j = 1;
        for (int i = 1; i < b.length(); i++) {
            if (b.charAt(i) - 'a' == pat[0]) pat[j++] = i;
        }
        pat[j] = b.length();
        for (int i = 0; i < b.length(); i++) {
            int pos = 0, match = 0;
            while (match < b.length() && b.charAt((pos + i) % b.length()) == a.charAt(match)) {
                match++;
                pos++;
            }
            if (match == b.length()) return true;
            for (int p : pat) {
                if (pos == p) break;
                pos += p;
                match = j;
                while (match < b.length() && b.charAt((pos + i) % b.length()) == a.charAt(match)) {
                    match++;
                    pos++;
                }
                if (match == b.length()) return true;
            }
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
