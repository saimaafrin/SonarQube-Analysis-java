import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Find the shortest palindrome that begins with a supplied string.
    // Algorithm idea is simple:
    // - Find the longest postfix of supplied string that is a palindrome.
    // - Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.
    // >>> makePalindrome((""))
    // ("")
    // >>> makePalindrome(("cat"))
    // ("catac")
    // >>> makePalindrome(("cata"))
    // ("catac")
    public static String makePalindrome(String string) {

        String rev_string = new StringBuffer(string).reverse().toString();
        String rev_postfix = "";
        String postfix = "";
        // Find the longest postfix that is a palindrome
        for (int i = 0; i < string.length(); i++) {
            rev_postfix = string.substring(i);
            if (rev_postfix.equals(rev_postfix.replaceFirst(("(?s).*?(.)(?!.*\\1).*$"), ($1)))) {
                postfix = rev_postfix;
                i = string.length();
            }
        }
        String suffix = "";
        // Find the shortest prefix that goes with the suffix
        for (int j = 0; j < postfix.length(); j++) {
            suffix = postfix.substring(0, postfix.length() - j);
            if (suffix.equals(suffix.replaceFirst(("(?s).*?(.)(?!.*\\1).*$"), ($1)))) {
                j = postfix.length();
            }
        }
        return string + suffix.reverse();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
