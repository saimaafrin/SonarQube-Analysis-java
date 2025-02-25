import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes a string and returns an ordered version of it.
    // Ordered version of string, is a string where all words (separated by space)
    // are replaced by a new word where all the characters arranged in
    // ascending order based on ascii value.
    // Note: You should keep the order of words and blank spaces in the sentence.
    // For example:
    // >>> antiShuffle(("Hi"))
    // ("Hi")
    // >>> antiShuffle(("hello"))
    // ("ehllo")
    // >>> antiShuffle(("Hello World!!!"))
    // ("Hello !!!Wdlor")
    public static String antiShuffle(String s) {

        // convert string to array of strings split by space
        String[] sArr = s.split(" ");
        // create new string array with same length as original
        String[] newSArr = new String[sArr.length];
        // loop through each word in array
        for (int i = 0; i < sArr.length; i++) {
            // split each word into an array of characters
            char[] cArr = sArr[i].toCharArray();
            // sort characters in array
            Arrays.sort(cArr);
            // join characters back into a word
            String newWord = String.valueOf(cArr);
            // add word to new array at correct index
            newSArr[i] = newWord;
        }
        // join words back into a sentence
        String newS = String.join(" ", newSArr);
        // return sentence
        return newS;
    }
    public static void main(String[] args) {
    assert(antiShuffle(("Hi")).equals(("Hi")));
    assert(antiShuffle(("hello")).equals(("ehllo")));
    assert(antiShuffle(("number")).equals(("bemnru")));
    assert(antiShuffle(("abcd")).equals(("abcd")));
    assert(antiShuffle(("Hello World!!!")).equals(("Hello !!!Wdlor")));
    assert(antiShuffle(("")).equals(("")));
    assert(antiShuffle(("Hi. My name is Mister Robot. How are you?")).equals((".Hi My aemn is Meirst .Rboot How aer ?ouy")));
    }

}
