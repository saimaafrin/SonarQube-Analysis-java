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

        // Check if the words are equal.
        if (s0.equals(s1)) {
            return true;
        }
        // Get the characters in the first word.
        List<Character> s0chars = s0.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        // Get the characters in the second word.
        List<Character> s1chars = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        // Check if they have the same characters.
        for (char c : s0chars) {
            if (!s1chars.contains(c)) {
                return false;
            }
        }
        for (char c : s1chars) {
            if (!s0chars.contains(c)) {
                return false;
            }
        }
        // If we get here, the words have the same characters.
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
