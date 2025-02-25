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

        // return ((String)java.util.Collections.max(words, (Comparator<String>)((String str1, String str2) -> {
        //     return java.util.stream.Stream.concat(java.util.stream.Stream.of(str1.toCharArray()), java.util.stream.Stream.of(str2.toCharArray())).distinct().count() - java.util.stream.Stream.concat(java.util.stream.Stream.of(str2.toCharArray()), java.util.stream.Stream.of(str1.toCharArray())).distinct().count();
        // })));
        // return ((String)java.util.stream.Stream.of(words).max((String str1, String str2) -> {
        //     return java.util.stream.Stream.concat(java.util.stream.Stream.of(str1.toCharArray()), java.util.stream.Stream.of(str2.toCharArray())).distinct().count() - java.util.stream.Stream.concat(java.util.stream.Stream.of(str2.toCharArray()), java.util.stream.Stream.of(str1.toCharArray())).distinct().count();
        // }).get());
        // return ((String)java.util.stream.Stream.of(words).max(java.util.Comparator.comparing((String str) -> {
        //     return java.util.stream.Stream.of(str.toCharArray()).distinct().count();
        // })).get());
        return ((String)java.util.stream.Stream.of(words).max(java.util.Comparator.comparing((String str) -> {
            return java.util.stream.Stream.of(str.toCharArray()).distinct().count();
        })).get());
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
