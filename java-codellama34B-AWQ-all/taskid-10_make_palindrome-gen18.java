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

        if (isPalindrome(string)) {
            return string;
        }
        int i = 0;
        while (i < string.length() && isPalindrome(string.substring(0, i))) {
            i += 1;
        }
        i -= 1;
        // i is now the length of the longest palindromic suffix of string.
        // Cut off the suffix and reverse the prefix.
        String suffix = string.substring(i + 1);
        String prefix = new StringBuilder(string.substring(0, i + 1)).reverse().toString();
        return suffix + prefix;
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
