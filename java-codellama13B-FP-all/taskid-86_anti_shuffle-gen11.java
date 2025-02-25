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

        StringBuilder[] ss = new StringBuilder[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(i > 0 && s.charAt(i) != ' ') {
                ss[i] = ss[i-1].append(s.charAt(i));
            } else {
                ss[i] = new StringBuilder(String.valueOf(s.charAt(i)));
            }
        }
        String[] r = new String[ss.length];
        for(int i = 0; i < ss.length; i++) {
            char[] a = ss[i].toString().toCharArray();
            Arrays.sort(a);
            r[i] = String.valueOf(a);
        }
        return String.join("", r);
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
