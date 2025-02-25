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

        if (word == null || word.length() <= 1) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        char[] chars = word.toCharArray();
        int index = 0;
        int lastIndex = 0;
        while (index < chars.length) {
            if (chars[index] != 'a' && chars[index] != 'e' && chars[index] != 'i' && chars[index] != 'o' && chars[index] != 'u') {
                lastIndex = index;
                index++;
            } else {
                if (lastIndex > 0 && index - lastIndex > 1 && chars[index - 1] != 'a' && chars[index - 1] != 'e' && chars[index - 1] != 'i' && chars[index - 1] != 'o' && chars[index - 1] != 'u') {
                    result.append(chars[index]);
                    break;
                } else {
                    index++;
                }
            }
        }
        return result.toString();
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
