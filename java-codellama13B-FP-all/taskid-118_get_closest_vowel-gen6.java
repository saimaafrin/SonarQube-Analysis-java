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

        String vowels = "aeiou";
        int index = 0;
        if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')
            return "";
        if (word.length() > 1) {
            if (word.charAt(0) == 'q')
                return "u";
            if (word.charAt(0) == 'Q')
                return "U";
        }
        if (word.length() > 2) {
            if (word.charAt(0) == 'c' && word.charAt(1) == 'h' && word.charAt(2) == 'i')
                return "i";
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    index = i;
                }
            }
        }
        if (index > 0 && index < word.length()) {
            if (word.charAt(index - 1) != 'q' && word.charAt(index - 1) != 'Q' && word.charAt(index - 1) != 'c' && word.charAt(index - 1) != 'h' && word.charAt(index - 1) != 'i')
                return Character.toString(word.charAt(index));
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
