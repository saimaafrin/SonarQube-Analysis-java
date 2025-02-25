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

        String[] arrstring = string.split("");
        List<String> list = Arrays.asList(arrstring);
        for (int i = 0; i <= arrstring.length / 2; i++) {
            if (list.get(i) == list.get(arrstring.length - i - 1)) {
                continue;
            } else {
                break;
            }
        }
        String palindromic_suffix = list.subList(0, i).stream().reduce("", (a, b) -> a + b);
        return string + new StringBuilder(palindromic_suffix).reverse().toString();
    }
    public static void main(String[] args) {
    assert(makePalindrome(("")).equals(("")));
    assert(makePalindrome(("x")).equals(("x")));
    assert(makePalindrome(("xyz")).equals(("xyzyx")));
    assert(makePalindrome(("xyx")).equals(("xyx")));
    assert(makePalindrome(("jerry")).equals(("jerryrrej")));
    }

}
