import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that accepts an array array list of strings.
    // The array list contains different words. Return the word with maximum number
    // of unique characters. If multiple strings have maximum number of unique
    // characters, return the one which comes first in lexicographical order.
    // >>> findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"of", (String)"string"))))
    // ("string")
    // >>> findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"enam", (String)"game"))))
    // ("enam")
    // >>> findMax((new ArrayList<String>(Arrays.asList((String)"aaaaaaa", (String)"bb", (String)"cc"))))
    // ("aaaaaaa")
    public static String findMax(ArrayList<String> words) {

        // Write your code here
        String maxWord = words.get(0);
        int maxCharCount = getDistinctCount(maxWord);

        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);
            int currentCharCount = getDistinctCount(currentWord);

            if (currentCharCount > maxCharCount) {
                maxWord = currentWord;
                maxCharCount = currentCharCount;
            } else if (currentCharCount == maxCharCount) {
                if (currentWord.compareTo(maxWord) < 0) {
                    maxWord = currentWord;
                    maxCharCount = currentCharCount;
                }
            }
        }
        return maxWord;
    }
    public static void main(String[] args) {
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"of", (String)"string")))).equals(("string")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"name", (String)"enam", (String)"game")))).equals(("enam")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"aaaaaaa", (String)"bb", (String)"cc")))).equals(("aaaaaaa")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"abc", (String)"cba")))).equals(("abc")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"play", (String)"this", (String)"game", (String)"of", (String)"footbott")))).equals(("footbott")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"we", (String)"are", (String)"gonna", (String)"rock")))).equals(("gonna")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"we", (String)"are", (String)"a", (String)"mad", (String)"nation")))).equals(("nation")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"this", (String)"is", (String)"a", (String)"prrk")))).equals(("this")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"b")))).equals(("b")));
    assert(findMax((new ArrayList<String>(Arrays.asList((String)"play", (String)"play", (String)"play")))).equals(("play")));
    }

}
