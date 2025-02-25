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

        // If the text is less than or equal to 1 character long, then
        // it is a palindrome
        if (text.length() <= 1) {
            return true;
        }
        // If the first character and the last character of the text
        // are the same, then recursively check if the substring
        // from the 2nd to the next-to-last character is a palindrome
        else if (text.charAt(0) == text.charAt(text.length() - 1)) {
            return isPalindrome(text.substring(1, text.length() - 1));
        }
        // Otherwise, the text is not a palindrome
        else {
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
