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

        // Get the longest postfix of the supplied string that is a palindrome.
        // The longest palindrome may be the whole string.
        String palindromePostfix = getPalindromePostfix(string);
        // Reverse the prefix of the supplied string that comes before the palindromic suffix.
        String prefix = string.substring(0, string.length() - palindromePostfix.length());
        String reversePrefix = new StringBuilder(prefix).reverse().toString();
        // Append the reverse of the prefix to the end of the palindromic suffix.
        return palindromePostfix + reversePrefix;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
