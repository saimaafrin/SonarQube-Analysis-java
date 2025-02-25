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

        // find the length of the longest palindromic suffix of supplied string
        int suffixLength = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            for (int j = string.length() - 1; j >= i; j--) {
                if (string.charAt(j) == string.charAt(i)) {
                    suffixLength = j - i + 1;
                } else {
                    break;
                }
            }
            if (suffixLength > 0) {
                break;
            }
        }
        // prepend to the suffix its reverse in order to create a palindrome
        String reverse = string.substring(0, string.length() - suffixLength);
        Collections.reverse(Arrays.asList(reverse.toCharArray()));
        String palindrome = suffixLength > 0 ? string.substring(0, string.length() - suffixLength) + reverse : string;
        return palindrome;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
