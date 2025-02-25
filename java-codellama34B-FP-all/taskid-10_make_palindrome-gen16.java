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

        if(string.equals(new StringBuilder(string).reverse().toString())) {
            return string;
        }
        int postfixPalindromeStart = -1;
        int stringLength = string.length();
        for(int i=stringLength-1; i>=0; i--) {
            String postfix = string.substring(i);
            String prefix = string.substring(0, i);
            if(postfix.equals(new StringBuilder(postfix).reverse().toString())) {
                postfixPalindromeStart = i;
                break;
            }
        }
        if(postfixPalindromeStart == -1) {
            return string;
        }
        return string + new StringBuilder(string.substring(0, postfixPalindromeStart)).reverse().toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
