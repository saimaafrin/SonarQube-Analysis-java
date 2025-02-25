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

        char[] wordChars;
        char[] uniqueChars;
        Map<Character, Boolean> uniqueCharsMap;
        String word;
        String maxWord;
        int maxCount;
        int count;
        Iterator i$;
        i$ = words.iterator();
        while (i$.hasNext()) {
            word = i$.next();
            wordChars = word.toCharArray();
            uniqueCharsMap = new HashMap<Character, Boolean>();
            uniqueChars = new char[0];
            for (char wordChar : wordChars) {
                if (!(uniqueCharsMap.containsKey(wordChar))) {
                    uniqueChars = Stream.concat(Arrays.stream(uniqueChars), Arrays.stream(new char[]{(wordChar)})).toArray();
                    uniqueCharsMap.put(wordChar, true);
                }
            }
            count = 0;
            for (char uniqueChar : uniqueChars) {
                if (uniqueCharsMap.get(uniqueChar)) {
                    count = count + 1;
                }
            }
            if ((maxWord == null)) {
                maxCount = count;
                maxWord = word;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                } else {
                    if ((count == maxCount) && (word.compareTo(maxWord) < 0)) {
                        maxWord = word;
                    }
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
