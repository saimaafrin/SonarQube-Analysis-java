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

        int len = string.length();
        // Find longest suffix that is a palindrome (subproblem)
        // >>> findLongestPalindromicSuffix("cat")
        // ("at")
        // >>> findLongestPalindromicSuffix("cata")
        // ("at")
        String palindromeSuffix = findLongestPalindromicSuffix(string);
        if (palindromeSuffix.equals(string)) {
            return string;
        }
        // Get prefix of string before the palindromic suffix
        // >>> getPrefixBeforePalindromicSuffix("cat", "at")
        // ("ca")
        // >>> getPrefixBeforePalindromicSuffix("cata", "at")
        // ("ca")
        String prefixBeforePalindromicSuffix = getPrefixBeforePalindromicSuffix(string, palindromeSuffix);
        // Get reverse of the prefix
        // >>> getReversedPrefix("cat")
        // ("tac")
        // >>> getReversedPrefix("cata")
        // ("tac")
        String reversedPrefix = getReversedPrefix(prefixBeforePalindromicSuffix);
        // Concatenate the prefix and suffix
        // >>> getConcatenatedPalindrome("ca", "at")
        // ("cata")
        return getConcatenatedPalindrome(prefixBeforePalindromicSuffix, palindromeSuffix);
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
