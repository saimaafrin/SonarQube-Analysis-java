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

        // Find the length of the string.
        var stringLength = string.length();

        // Initialize two indices: i for the front of the string and j for the back.
        var i = 0;
        var j = stringLength - 1;

        // Initialize a variable to hold the length of the longest palindromic suffix.
        var longestPalindromicSuffixLength = 0;

        // Iterate while i is less than j and j is greater than or equal to i.
        while (i < j) {
            // If the first character of the string is the same as the last character of the string, then increment the length of the longest palindromic suffix.
            if (string.charAt(i) == string.charAt(j)) {
                longestPalindromicSuffixLength += 1;
            }
            // Otherwise, break the loop.
            else {
                break;
            }

            // Increment i and decrement j.
            i += 1;
            j -= 1;
        }

        // Initialize a new string to hold the longest palindromic suffix.
        var longestPalindromicSuffix = "";

        // Iterate for the length of the longest palindromic suffix.
        for (var index = 0; index < longestPalindromicSuffixLength; index += 1) {
            // Append to the string the character at the index of the string.
            longestPalindromicSuffix += string.charAt(index);
        }

        // Return the concatenation of the supplied string, the longest palindromic suffix, and the reverse of the longest palindromic suffix.
        return string + longestPalindromicSuffix + new StringBuilder(longestPalindromicSuffix).reverse().toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
