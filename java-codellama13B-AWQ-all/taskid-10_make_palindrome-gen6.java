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

        // Initialization.
        String stringPostfix = string;
        String stringPrefix = string;
        String stringPalindrome = string;
        // Reverse a string.
        String reverseString = new StringBuilder(string).reverse().toString();
        // Check if a string is a palindrome.
        boolean checkStringPalindrome = string.equals(reverseString);
        // Check if a string is a postfix of a supplied string.
        boolean checkStringPostfix = string.endsWith(stringPostfix);
        // Find the longest palindrome postfix of supplied string.
        while(!checkStringPalindrome && checkStringPostfix) {
            stringPostfix = stringPostfix.substring(0, stringPostfix.length() - 1);
            checkStringPalindrome = stringPostfix.equals(reverseString);
            checkStringPostfix = string.endsWith(stringPostfix);
        }
        // Generate a palindrome string from a supplied string postfix.
        String stringPalindromeReverse = new StringBuilder(stringPrefix).reverse().toString();
        stringPalindrome = stringPalindrome.concat(stringPalindromeReverse);
        // Return a shortest palindrome string.
        return stringPalindrome;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
