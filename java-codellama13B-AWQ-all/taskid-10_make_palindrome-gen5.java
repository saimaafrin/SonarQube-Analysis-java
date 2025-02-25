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

        int i = 1;
        // Find longest postfix that is a palindrome.
        while (i < string.length() && i >= 0) {
            i = string.lastIndexOf(string.substring(i, i + 1), i - 1, string.length() - i);
        }
        int j = i - 1;
        String suffix = string.substring(j);
        if (suffix.equals(new StringBuilder(suffix).reverse().toString()))
            return string;
        j -= 1;
        String prefix = string.substring(0, j);
        return string + new StringBuilder(prefix).reverse().toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
