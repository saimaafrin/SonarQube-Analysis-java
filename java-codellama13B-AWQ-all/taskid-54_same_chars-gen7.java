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

        // If the length of s0 is not equal to s1, return false.
        if (s0.length() != s1.length()) {
            return false;
        }
        int c0[] = new int[26];
        int c1[] = new int[26];
        // Populate both arrays with zeros.
        for (int i = 0; i < c0.length; i++) {
            c0[i] = 0;
            c1[i] = 0;
        }
        // Iterate through the characters in s0.
        for (int i = 0; i < s0.length(); i++) {
            // Update the corresponding character in the array.
            c0[s0.charAt(i) - 'a'] += 1;
        }
        // Iterate through the characters in s1.
        for (int i = 0; i < s1.length(); i++) {
            // Update the corresponding character in the array.
            c1[s1.charAt(i) - 'a'] += 1;
        }
        // Iterate through the character arrays and return false if any
        // of the elements don't match.
        for (int i = 0; i < c0.length; i++) {
            if (c0[i] != c1[i]) {
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
