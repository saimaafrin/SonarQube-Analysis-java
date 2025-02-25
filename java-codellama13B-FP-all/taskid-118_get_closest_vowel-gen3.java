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

        // write your code here
        int n = word.length();
        for(int i = n-1; i>=1; i--) {
            char curr = word.charAt(i);
            char prev = word.charAt(i-1);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' || 
            curr == 'A' || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U') {
                return String.valueOf(curr);
            }
            if(curr == 'u' && prev != 'a' && prev != 'e' && prev != 'i' && prev != 'o' && 
            prev != 'u' && prev != 'A' && prev != 'E' && prev != 'I' && prev != 'O' && prev != 'U') {
                return String.valueOf(curr);
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
