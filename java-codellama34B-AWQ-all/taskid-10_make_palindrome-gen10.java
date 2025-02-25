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

        if(string.length() == 0) {
            return "";
        }

        int start = 0;
        int end = string.length() - 1;

        // Find the midpoint of a palindrome.
        while(start < end && string.charAt(start) != string.charAt(end)) {
            start++;
            end--;
        }

        // string is already a palindrome.
        if(start == end) {
            return string;
        }

        // Find the reverse of a prefix that comes before the palindrome.
        StringBuilder reverse = new StringBuilder();
        int reverseStart = start + 1;
        int reverseEnd = start + (end - start);

        while(reverseStart <= reverseEnd) {
            reverse.append(string.charAt(reverseStart));
            reverseStart++;
        }

        // Reverse the prefix.
        reverse = reverse.reverse();

        // Append the reverse of the prefix to the palindromic suffix.
        return string.substring(0, end + 1) + reverse.toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
