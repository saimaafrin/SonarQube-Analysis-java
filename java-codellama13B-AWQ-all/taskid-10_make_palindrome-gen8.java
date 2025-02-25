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

        // Reverse string.
        String reverseString = new StringBuilder(string).reverse().toString();
        // Find the longest postfix of supplied string that is a palindrome.
        int postfixLen = 0;
        for (int i = 0; i < string.length(); i++) {
            String current = string.substring(string.length() - (i + 1));
            String reversed = reverseString.substring(0, i + 1);
            if (current.equals(reversed)) {
                postfixLen = i + 1;
            } else {
                break;
            }
        }
        // Return original string if it is already a palindrome.
        if (postfixLen == string.length()) {
            return string;
        }
        // Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.
        String prefix = string.substring(0, string.length() - postfixLen);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
        return string + reversedPrefix;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
