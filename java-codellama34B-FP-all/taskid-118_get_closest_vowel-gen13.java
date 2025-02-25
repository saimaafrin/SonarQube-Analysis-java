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

        word = word.toLowerCase();
        char[] wordArray = word.toCharArray();
        String vowel = "";
        for (int i = wordArray.length-1; i >= 0; i--) {
            if (isVowel(wordArray[i]) == true) {
                vowel = Character.toString(wordArray[i]);
                break;
            }
        }
        if (vowel == "") {
            return vowel;
        }
        if (wordArray[wordArray.length-1] == vowel.charAt(0) && wordArray[wordArray.length-2] != vowel.charAt(0)) {
            return vowel;
        }
        if (wordArray[0] == vowel.charAt(0)) {
            return "";
        }
        for (int i = wordArray.length-2; i >= 0; i--) {
            if (wordArray[i] == vowel.charAt(0)) {
                if (wordArray[i-1] != vowel.charAt(0) && wordArray[i+1] != vowel.charAt(0)) {
                    return vowel;
                }
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
