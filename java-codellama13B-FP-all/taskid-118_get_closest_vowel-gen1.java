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

        String vowel = "";
        int index = 0;
        if (word.endsWith("aeiouAEIOU")) {
            vowel = word.substring(word.length()-1, word.length());
            return vowel;
        }
        if (word.length() == 1) {
            return vowel;
        }
        char[] wordChars = word.toCharArray();
        for (int i = word.length()-2; i >= 0; i--) {
            if (wordChars[i] == 'a' || wordChars[i] == 'e' || wordChars[i] == 'i' || 
                wordChars[i] == 'o' || wordChars[i] == 'u' || 
                wordChars[i] == 'A' || wordChars[i] == 'E' || wordChars[i] == 'I' ||
                wordChars[i] == 'O' || wordChars[i] == 'U') {
                    vowel = Character.toString(wordChars[i]);
                    break;
                }
            else if (wordChars[i] == ' ' && wordChars[i+1] != ' ') {
                break;
            }
            index++;
        }
        return vowel;
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
