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

        // Auxiliary function for finding longest palindrome in a given string.
        String findPalindrome(String string) {
            int n = string.length();
            // Auxiliary 2D array for storing results of previous computations.
            boolean[][] dp = new boolean[n][n];

            // For each iteration check if there is palindrome of length i ending at j-th position
            // and if there is a palindrome of length i-1 ending at j+1-th position.
            // The idea is that when we have two palindromes concatenated together
            // they form a palindrome of length i+1 ending at j-th position.
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j + i < n; ++j) {
                    // If there is only one character, it is a palindrome.
                    if (i == 0) {
                        dp[j][j] = true;
                    }
                    // If there are two characters and they are the same, it is a palindrome.
                    else if (i == 1 && string.charAt(j) == string.charAt(j + 1)) {
                        dp[j][j + 1] = true;
                    }
                    // In all other cases check if there is a palindrome of length i-1 ending at j+1-th position
                    // and if there is a palindrome of length i ending at j-th position.
                    else if (dp[j + 1][j + i - 1] && string.charAt(j) == string.charAt(j + i)) {
                        dp[j][j + i] = true;
                    }
                }
            }

            // Find the longest palindrome length.
            int longestPalindromeLength = 0;
            for (int i = 0; i < n; ++i) {
                if (dp[0][i]) {
                    longestPalindromeLength = i;
                }
            }

            // Return the longest palindrome found in a given string.
            return string.substring(0, longestPalindromeLength + 1);
        }

        // If a given string is already a palindrome, just return it.
        if (string.equals(new StringBuilder(string).reverse().toString())) {
            return string;
        }

        // Find the longest palindrome in the given string.
        String palindrome = findPalindrome(string);

        // Return the shortest palindrome by appending the reverse of the prefix to the palindrome.
        return palindrome + new StringBuilder(string.substring(0, string.length() - palindrome.length())).reverse().toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
