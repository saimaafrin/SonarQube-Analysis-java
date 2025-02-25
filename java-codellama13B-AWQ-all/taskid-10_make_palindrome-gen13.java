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

        // Find the longest postfix of the string that is a palindrome.
        int postfixLen = 0;
        int length = string.length();
        while (postfixLen < length && string.charAt(length - postfixLen - 1) == string.charAt(length - postfixLen - 2)) {
            postfixLen += 1;
        }
        // If the string is already a palindrome, return it.
        if (postfixLen == length) {
            return string;
        }
        // Find the prefix of length length - postfixLen.
        String prefix = string.substring(0, length - postfixLen);
        // Reverse the prefix.
        String reversePrefix = new StringBuilder(prefix).reverse().toString();
        // Concatenate the prefix and postfix.
        return prefix + reversePrefix;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
