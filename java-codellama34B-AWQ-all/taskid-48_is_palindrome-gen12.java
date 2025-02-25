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

        // We'll create two strings, x and y.
        // If text's characters are the same as y's
        // characters but in reverse order, then x
        // and y will be the same.
        String x = text;
        String y = "";
        // We'll fill y with the characters of x but
        // in reverse order
        for (int i = text.length() - 1; i >= 0; i--) {
            y = y + text.charAt(i);
        }
        // If x and y are the same, then text is a
        // palindrome; otherwise it isn't
        if (x.equals(y)) {
            return true;
        } else {
            return false;
        }
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
