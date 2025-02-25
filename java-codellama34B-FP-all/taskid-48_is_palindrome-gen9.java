import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Checks if given string is a palindrome
    // >>> isPalindrome((""))
    // (true)
    // >>> isPalindrome(("aba"))
    // (true)
    // >>> isPalindrome(("aaaaa"))
    // (true)
    // >>> isPalindrome(("zbcd"))
    // (false)
    public static boolean isPalindrome(String text) {

        // Removes all non-alphanumeric symbols from text
        // >>> getAlphanumericOnly("a#b%c^d&e")
        // ("abcde")
        String alphanumeric = getAlphanumericOnly(text);
        // >>> getAlphanumericOnly("a#b%c^d&e").equals(getAlphanumericOnly("a#b%c^d&e").reverse())
        // (true)
        // >>> getAlphanumericOnly("a#b%c^d&e").equals(getAlphanumericOnly("a#b%c^d&e").reverse())
        // (true)
        // >>> getAlphanumericOnly("a#b%c^d&e").equals(getAlphanumericOnly("a#b%c^d&e").reverse())
        // (true)
        // >>> getAlphanumericOnly("a#b%c^d&e").equals(getAlphanumericOnly("a#b%c^d&e").reverse())
        // (true)
        return alphanumeric.equals(new StringBuilder(alphanumeric).reverse().toString());
    }
    public static void main(String[] args) {
    assert(isPalindrome(("")) == (true));
    assert(isPalindrome(("aba")) == (true));
    assert(isPalindrome(("aaaaa")) == (true));
    assert(isPalindrome(("zbcd")) == (false));
    assert(isPalindrome(("xywyx")) == (true));
    assert(isPalindrome(("xywyz")) == (false));
    assert(isPalindrome(("xywzx")) == (false));
    }

}
