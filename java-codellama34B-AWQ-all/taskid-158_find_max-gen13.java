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

        String result = null;
        Map<String, Set<Character>> charsInWord = new HashMap<String, Set<Character>>();
        Map<String, Set<Integer>> indexs = new HashMap<String, Set<Integer>>();
        for (String word : words) {
            char[] wordArr = word.toCharArray();
            int[] wordArrIndexes = new int[wordArr.length];
            int charCount = 0;
            Set<Character> uniqueChars = new HashSet<Character>();
            Set<Integer> uniqueIndexes = new HashSet<Integer>();
            for (int i = 0; i < wordArr.length; i++) {
                wordArrIndexes[i] = i;
                if (!uniqueChars.contains(wordArr[i])) {
                    uniqueChars.add(wordArr[i]);
                }
                if (!uniqueIndexes.contains(i)) {
                    uniqueIndexes.add(i);
                }
                charCount++;
            }
            charsInWord.put(word, uniqueChars);
            indexs.put(word, uniqueIndexes);
            if (charCount > (result == null ? 0 : countChars(result))) {
                result = word;
            } else if (result != null && result.compareTo(word) < 0) {
                result = word;
            }
        }
        System.out.println(charsInWord);
        System.out.println(indexs);
        return result;
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
