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

        // longest postfix of string that is a palindrome
        String palindrome = "";
        int i = string.length() - 1;
        // longest postfix of string that is a palindrome
        String prefix = "";
        // iterate backwards till the string prefix is a palindrome
        while (i >= 0) {
            if (isPalindrome(string.substring(0, i + 1))) {
                prefix = string.substring(0, i + 1);
            }
            i = i - 1;
        }
        // string prefix that comes before the palindromic suffix
        String suffix = reverse(prefix);
        return string + suffix;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
