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

        String ss0 = s0.replaceAll("[^a-z]", "");
        String ss1 = s1.replaceAll("[^a-z]", "");
        if (ss0.length() != ss1.length()) {
            return false;
        }
        ss0 = ss0.replaceAll("aa", "a");
        ss1 = ss1.replaceAll("aa", "a");
        ss0 = ss0.replaceAll("bb", "b");
        ss1 = ss1.replaceAll("bb", "b");
        ss0 = ss0.replaceAll("cc", "c");
        ss1 = ss1.replaceAll("cc", "c");
        ss0 = ss0.replaceAll("dd", "d");
        ss1 = ss1.replaceAll("dd", "d");
        ss0 = ss0.replaceAll("ee", "e");
        ss1 = ss1.replaceAll("ee", "e");
        ss0 = ss0.replaceAll("ff", "f");
        ss1 = ss1.replaceAll("ff", "f");
        ss0 = ss0.replaceAll("gg", "g");
        ss1 = ss1.replaceAll("gg", "g");
        ss0 = ss0.replaceAll("hh", "h");
        ss1 = ss1.replaceAll("hh", "h");
        ss0 = ss0.replaceAll("ii", "i");
        ss1 = ss1.replaceAll("ii", "i");
        ss0 = ss0.replaceAll("jj", "j");
        ss1 = ss1.replaceAll("jj", "j");
        ss0 = ss0.replaceAll("kk", "k");
        ss1 = ss1.replaceAll("kk", "k");
        ss0 = ss0.replaceAll("ll", "l");
        ss1 = ss1.replaceAll("ll", "l");
        ss0 = ss0.replaceAll("mm", "m");
        ss1 = ss1.replaceAll("mm", "m");
        ss0 = ss0.replaceAll("nn", "n");
        ss1 = ss1.replaceAll("nn", "n");
        ss0 = ss0.replaceAll("oo", "o");
        ss1 = ss1.replaceAll("oo", "o");
        ss0 = ss0.replaceAll("pp", "p");
        ss1 = ss1.replaceAll("pp", "p");
        ss0 = ss0.replaceAll("qq", "q");
        ss1 = ss1.replaceAll("qq", "q");
        ss0 = ss0.replaceAll("rr", "r");
        ss1 = ss1.replaceAll("rr", "r");
        ss0 = ss0.replaceAll("ss", "s");
        ss1 = ss1.replaceAll("ss", "s");
        ss0 = ss0.replaceAll("tt", "t");
        ss1 = ss1.replaceAll("tt", "t");
        ss0 = ss0.replaceAll("uu", "u");
        ss1 = ss1.replaceAll("uu", "u");
        ss0 = ss0.replaceAll("vv", "v");
        ss1 = ss1.replaceAll("vv", "v");
        ss
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
