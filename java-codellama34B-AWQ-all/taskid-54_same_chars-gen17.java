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

        String s = s0;
        String t = s1;
        if (s.length() > t.length()) {
            String temp = s;
            s = t;
            t = temp;
        }
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else {
                hash.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!hash.containsKey(ch)) {
                return false;
            } else {
                hash.put(ch, hash.get(ch) - 1);
                if (hash.get(ch) <= 0) {
                    hash.remove(ch);
                }
            }
        }
        if (hash.size() > 0) {
            return false;
        } else {
            return true;
        }
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
