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

        List<Character> cList = new ArrayList<Character>();
        for (int i = 0; i < c.length(); i++)
            cList.add(c.charAt(i));
        List<Character> sList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!cList.contains(s.charAt(i)))
                sList.add(s.charAt(i));
        }
        String sNew = sList.stream().map(Object::toString).collect(Collectors.joining());
        if (sNew.length() == 0)
            return Pair.with(sNew, true);
        boolean isPalindrome = true;
        for (int i = 0; i < sNew.length() / 2; i++)
            if (sNew.charAt(i) != sNew.charAt(sNew.length() - i - 1))
                isPalindrome = false;
        return Pair.with(sNew, isPalindrome);
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
