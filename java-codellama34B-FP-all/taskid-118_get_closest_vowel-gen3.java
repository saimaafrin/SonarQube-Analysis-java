import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a word. Your task is to find the closest vowel that stands between 
    // two consonants from the right side of the word (case sensitive).
    // Vowels in the beginning and ending doesn't count. Return empty string if you didn't
    // find any vowel met the above condition. 
    // You may assume that the given string contains English letter only.
    // Example:
    // >>> getClosestVowel(("yogurt"))
    // ("u")
    // >>> getClosestVowel(("FULL"))
    // ("U")
    // >>> getClosestVowel(("quick"))
    // ("")
    // >>> getClosestVowel(("ab"))
    // ("")
    public static String getClosestVowel(String word) {

        if (word.length() <= 2) {
            return "";
        }

        boolean firstVowel = false;
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                firstVowel = true;
            }

            if (firstVowel && (word.charAt(i) == 'b' || word.charAt(i) == 'c' || word.charAt(i) == 'd'
                    || word.charAt(i) == 'f' || word.charAt(i) == 'g' || word.charAt(i) == 'h'
                    || word.charAt(i) == 'j' || word.charAt(i) == 'k' || word.charAt(i) == 'l'
                    || word.charAt(i) == 'm' || word.charAt(i) == 'n' || word.charAt(i) == 'p'
                    || word.charAt(i) == 'q' || word.charAt(i) == 'r' || word.charAt(i) == 's'
                    || word.charAt(i) == 't' || word.charAt(i) == 'v' || word.charAt(i) == 'w'
                    || word.charAt(i) == 'x' || word.charAt(i) == 'y' || word.charAt(i) == 'z')) {
                return String.valueOf(word.charAt(i + 1));
            }
        }

        return "";
    }
    public static void main(String[] args) {
    assert(getClosestVowel(("yogurt")).equals(("u")));
    assert(getClosestVowel(("full")).equals(("u")));
    assert(getClosestVowel(("easy")).equals(("")));
    assert(getClosestVowel(("eAsy")).equals(("")));
    assert(getClosestVowel(("ali")).equals(("")));
    assert(getClosestVowel(("bad")).equals(("a")));
    assert(getClosestVowel(("most")).equals(("o")));
    assert(getClosestVowel(("ab")).equals(("")));
    assert(getClosestVowel(("ba")).equals(("")));
    assert(getClosestVowel(("quick")).equals(("")));
    assert(getClosestVowel(("anime")).equals(("i")));
    assert(getClosestVowel(("Asia")).equals(("")));
    assert(getClosestVowel(("Above")).equals(("o")));
    }

}
