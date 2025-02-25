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

        // The length must be equal.
        if (s0.length() != s1.length())
            return false;
        // The sum of the digits must be equal.
        int sum0 = 0;
        int sum1 = 0;
        for (int i = 0; i < s0.length(); i++) {
            sum0 += s0.charAt(i) - 'a' + 1;
            sum1 += s1.charAt(i) - 'a' + 1;
        }
        if (sum0 != sum1)
            return false;
        // Sort the strings and compare.
        char[] a0 = s0.toCharArray();
        char[] a1 = s1.toCharArray();
        Arrays.sort(a0);
        Arrays.sort(a1);
        for (int i = 0; i < a0.length; i++)
            if (a0[i] != a1[i])
                return false;
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
