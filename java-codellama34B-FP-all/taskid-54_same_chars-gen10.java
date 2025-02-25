import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Check if two words have the same characters.
    // >>> sameChars(("eabcdzzzz"), ("dddzzzzzzzddeddabc"))
    // (true)
    // >>> sameChars(("abcd"), ("dddddddabc"))
    // (true)
    // >>> sameChars(("dddddddabc"), ("abcd"))
    // (true)
    // >>> sameChars(("eabcd"), ("dddddddabc"))
    // (false)
    // >>> sameChars(("abcd"), ("dddddddabce"))
    // (false)
    // >>> sameChars(("eabcdzzzz"), ("dddzzzzzzzddddabc"))
    // (false)
    public static boolean sameChars(String s0, String s1) {

        Map<String, Integer> d0 = new HashMap<>();
        Map<String, Integer> d1 = new HashMap<>();
        int n0 = 0, n1 = 0;
        for (int i = 0; i < s0.length(); i++) {
            String c = Character.toString(s0.charAt(i));
            Integer v = d0.get(c);
            v = (v == null) ? 1 : v + 1;
            d0.put(c, v);
            n0++;
        }
        for (int i = 0; i < s1.length(); i++) {
            String c = Character.toString(s1.charAt(i));
            Integer v = d1.get(c);
            v = (v == null) ? 1 : v + 1;
            d1.put(c, v);
            n1++;
        }
        if (d0.size() != d1.size()) {
            return false;
        }
        if (n0 != n1) {
            return false;
        }
        Iterator<String> iter0 = d0.keySet().iterator();
        while (iter0.hasNext()) {
            String c = iter0.next();
            if (d0.get(c).intValue() != d1.get(c).intValue()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    assert(sameChars(("eabcdzzzz"), ("dddzzzzzzzddeddabc")) == (true));
    assert(sameChars(("abcd"), ("dddddddabc")) == (true));
    assert(sameChars(("dddddddabc"), ("abcd")) == (true));
    assert(sameChars(("eabcd"), ("dddddddabc")) == (false));
    assert(sameChars(("abcd"), ("dddddddabcf")) == (false));
    assert(sameChars(("eabcdzzzz"), ("dddzzzzzzzddddabc")) == (false));
    assert(sameChars(("aabb"), ("aaccc")) == (false));
    }

}
