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

        StringBuilder sb = new StringBuilder(string);
        // We find the longest palindrome we can by starting at the end of the string and moving to the start of the string.
        int i = string.length() - 1;
        int j = i;
        while (i >= 0 && j >= 0) {
            if (string.charAt(i) != string.charAt(j))
                break;
            i -= 1;
            j -= 1;
        }
        // If we reached the start of the string, then the entire string was a palindrome.
        if (i < 0)
            return string;
        // We then append to the end of the string the prefix of the string in reverse order.
        return sb.append(new StringBuilder(string.substring(0, j + 1)).reverse().toString()).toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
