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

        // Create a dictionary for each string.
        Map<Character, Integer> d0 = new HashMap<>();
        Map<Character, Integer> d1 = new HashMap<>();
        // Update each dictionary.
        for (char c : s0.toCharArray())
            d0.put(c, d0.getOrDefault(c, 0) + 1);
        for (char c : s1.toCharArray())
            d1.put(c, d1.getOrDefault(c, 0) + 1);
        // Compare each key.
        for (char c : d0.keySet())
            if (!d1.containsKey(c) || !Objects.equals(d0.get(c), d1.get(c)))
                return false;
        for (char c : d1.keySet())
            if (!d0.containsKey(c) || !Objects.equals(d1.get(c), d0.get(c)))
                return false;
        // Otherwise, the strings must be anagrams.
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
