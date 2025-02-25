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

        // Find the length of the largest prefix of string that is a suffix.
        int longestPalindromicSuffix = 0;
        for (int i = 0; i < string.length() / 2; i++) {
            int j = string.length() - 1 - i;
            if (string.charAt(i) == string.charAt(j)) {
                longestPalindromicSuffix = i + 1;
            } else {
                break;
            }
        }
        // The shortest palindrome is padded with the reverse of string up to the length of the longest palindromic suffix.
        return string + new StringBuilder(string.substring(0, longestPalindromicSuffix)).reverse() + string.substring(longestPalindromicSuffix);
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
