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

        int n = s0.length();
        char[] s0arr = s0.toCharArray();
        char[] s1arr = s1.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s0arr[i] == s1arr[j]) {
                    s1arr[j] = '-';
                    break;
                }
            }
        }
        String s1alt = String.valueOf(s1arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s1alt.charAt(i) != '-') {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
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
