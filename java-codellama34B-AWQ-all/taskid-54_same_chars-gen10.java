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

        // Create empty HashMaps to store the characters.
        HashMap<Character, Integer> s0charCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> s1charCount = new HashMap<Character, Integer>();
        // For each character in each string, count the number of times the character appears.
        for (int i = 0; i < s0.length(); i++) {
            char c0 = s0.charAt(i);
            char c1 = s1.charAt(i);
            if (s0charCount.containsKey(c0)) {
                s0charCount.replace(c0, s0charCount.get(c0) + 1);
            } else {
                s0charCount.put(c0, 1);
            }
            if (s1charCount.containsKey(c1)) {
                s1charCount.replace(c1, s1charCount.get(c1) + 1);
            } else {
                s1charCount.put(c1, 1);
            }
        }
        // Check if all the characters in one HashMap are in the other HashMap and have the same count.
        for (Map.Entry<Character, Integer> entry : s0charCount.entrySet()) {
            if (s1charCount.containsKey(entry.getKey())) {
                if (entry.getValue() != s1charCount.get(entry.getKey())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        // Check if all the characters in the other HashMap are in the first HashMap and have the same count.
        for (Map.Entry<Character, Integer> entry : s1charCount.entrySet()) {
            if (s0charCount.containsKey(entry.getKey())) {
                if (entry.getValue() != s0charCount.get(entry.getKey())) {
                    return false;
                }
            } else {
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
