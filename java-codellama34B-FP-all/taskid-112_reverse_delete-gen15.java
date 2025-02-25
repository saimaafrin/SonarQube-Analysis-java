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

        StringBuilder sb = new StringBuilder();
        StringBuffer rc = new StringBuffer();
        boolean t = true;
        // write your code here
        //sb.append(s);
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for(int j = 0; j < c.length(); j++) {
                if(c.charAt(j) == ch) {
                    t = false;
                    continue;
                }
            }
            if(t) {
                sb.append(ch);
            }
            t = true;
        }
        for(int i = sb.length() - 1; i >= 0; i--) {
            rc.append(sb.charAt(i));
        }
        //rc.reverse();
        if(rc.toString().equals(sb.toString())) {
            return Pair.with(sb.toString(), true);
        }
        return Pair.with(sb.toString(), false);
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
