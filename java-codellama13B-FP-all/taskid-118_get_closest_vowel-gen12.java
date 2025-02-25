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

        if (word.length() < 2)
            return "";
        String ans = "";
        String vowel = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        if (consonants.contains(word.charAt(word.length() - 1) + "") &&
            consonants.contains(word.charAt(word.length() - 2) + ""))
            return ans;
        else if (vowel.contains(word.charAt(word.length() - 1) + "") &&
                 consonants.contains(word.charAt(word.length() - 2) + ""))
            return word.charAt(word.length() - 1) + "";
        else if (vowel.contains(word.charAt(word.length() - 2) + "") &&
                 consonants.contains(word.charAt(word.length() - 1) + ""))
            return word.charAt(word.length() - 2) + "";
        else {
            for (int i = word.length() - 2; i >= 1; i--) {
                if (consonants.contains(word.charAt(i) + ""))
                    break;
                else if (vowel.contains(word.charAt(i) + ""))
                    ans = word.charAt(i) + "";
            }
            return ans;
        }
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
