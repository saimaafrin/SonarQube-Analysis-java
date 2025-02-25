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

        int length = string.length();
        int i = 0;
        // Check if the string is a palindrome.
        // If it is, just return it.
        while (i < length / 2) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                break;
            }
            i += 1;
        }
        if (i >= length / 2) {
            return string;
        }
        // Find the longest postfix of string
        // that is a palindrome.
        int suffixLength = 0;
        int suffixIndex = length - 1;
        while (suffixIndex >= 0 && suffixLength < length) {
            // Check if it is a palindrome.
            int j = 0;
            while (j < suffixLength / 2) {
                if (string.charAt(suffixIndex - j - 1) != string.charAt(suffixIndex - suffixLength + j)) {
                    break;
                }
                j += 1;
            }
            if (j >= suffixLength / 2) {
                suffixLength = length - suffixIndex;
            }
            suffixIndex -= 1;
        }
        // Append to the end of the string
        // a reverse of the string prefix.
        return string + new StringBuilder(string.substring(0, length - suffixLength)).reverse().toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
