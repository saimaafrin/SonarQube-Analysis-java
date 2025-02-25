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

        return Collections.max(words, new Comparator<String>() {
            public int compare(String a, String b) {
                int max = 0;
                int aLen = a.length();
                int bLen = b.length();
                String aStr = "";
                String bStr = "";
                for (int i = 0; i < aLen; i++) {
                    if (aStr.indexOf(a.charAt(i)) == -1) {
                        aStr += a.charAt(i);
                        max++;
                    }
                }
                for (int i = 0; i < bLen; i++) {
                    if (bStr.indexOf(b.charAt(i)) == -1) {
                        bStr += b.charAt(i);
                        max--;
                    }
                }
                return max;
            }
        });
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
