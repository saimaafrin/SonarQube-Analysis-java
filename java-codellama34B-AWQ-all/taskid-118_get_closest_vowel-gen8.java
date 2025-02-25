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

        String[] vowels = {"A", "E", "I", "O", "U"};
        int index = -1;
        int length = word.length();
        char[] wordToCharArray = word.toCharArray();
        for (int i = 0; i < length; i++) {
            if (Arrays.asList(vowels).contains(String.valueOf(wordToCharArray[i]))) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "";
        }
        int closestConsonantIndex = 0;
        for (int i = index + 1; i < length; i++) {
            if (!Arrays.asList(vowels).contains(String.valueOf(wordToCharArray[i]))) {
                closestConsonantIndex = i;
                break;
            }
        }
        if (closestConsonantIndex == 0) {
            return "";
        }
        return String.valueOf(word.charAt(index));
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
