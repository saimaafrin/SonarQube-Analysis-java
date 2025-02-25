import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Task
    // We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    // then check if the result string is palindrome.
    // A string is called palindrome if it reads the same backward as forward.
    // You should return a pair containing the result string and true/false for the check.
    // Example
    // >>> reverseDelete(("abcde"), ("ae"))
    // (Pair.with("bcd", false))
    // >>> reverseDelete(("abcdef"), ("b"))
    // (Pair.with("acdef", false))
    // >>> reverseDelete(("abcdedcba"), ("ab"))
    // (Pair.with("cdedc", true))
    public static Pair<String, Boolean> reverseDelete(String s, String c) {

        if(s.length() == 1 || s.length() == 0)
            return Pair.with(s, true);
        String ret = "";
        if(s.charAt(0) != s.charAt(s.length()-1))
            ret += s.charAt(0);
        if(s.charAt(0) != c.charAt(0) || s.charAt(s.length()-1) != c.charAt(0))
            ret += s.charAt(s.length()-1);
        s = s.substring(1, s.length()-1);
        c = c.substring(1, c.length()-1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != c.charAt(0))
                ret += s.charAt(i);
        }
        String newRet = "";
        for(int i = ret.length()-1; i >= 0; i--){
            newRet += ret.charAt(i);
        }
        if(ret.equals(newRet))
            return Pair.with(ret, true);
        return Pair.with(ret, false);
    }
    public static void main(String[] args) {
    assert(reverseDelete(("abcde"), ("ae")).equals((Pair.with("bcd", false))));
    assert(reverseDelete(("abcdef"), ("b")).equals((Pair.with("acdef", false))));
    assert(reverseDelete(("abcdedcba"), ("ab")).equals((Pair.with("cdedc", true))));
    assert(reverseDelete(("dwik"), ("w")).equals((Pair.with("dik", false))));
    assert(reverseDelete(("a"), ("a")).equals((Pair.with("", true))));
    assert(reverseDelete(("abcdedcba"), ("")).equals((Pair.with("abcdedcba", true))));
    assert(reverseDelete(("abcdedcba"), ("v")).equals((Pair.with("abcdedcba", true))));
    assert(reverseDelete(("vabba"), ("v")).equals((Pair.with("abba", true))));
    assert(reverseDelete(("mamma"), ("mia")).equals((Pair.with("", true))));
    }

}
