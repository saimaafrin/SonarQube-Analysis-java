import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes a message, and encodes in such a 
    // way that it swaps case of all letters, replaces all vowels in 
    // the message with the letter that appears 2 places ahead of that 
    // vowel in the english alphabet. 
    // Assume only letters. 
    // Examples:
    // >>> encode(("test"))
    // ("TGST")
    // >>> encode(("This is a message"))
    // ("tHKS KS C MGSSCGG")
    public static String encode(String message) {

        String res = "";
        char[] arr = message.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                res += Character.toLowerCase(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                res += Character.toUpperCase(arr[i]);
            } else {
                res += arr[i];
            }
        }
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == 'a') {
                res = res.substring(0, i) + "c" + res.substring(i + 1);
            } else if (res.charAt(i) == 'e') {
                res = res.substring(0, i) + "g" + res.substring(i + 1);
            } else if (res.charAt(i) == 'i') {
                res = res.substring(0, i) + "k" + res.substring(i + 1);
            } else if (res.charAt(i) == 'o') {
                res = res.substring(0, i) + "m" + res.substring(i + 1);
            } else if (res.charAt(i) == 'u') {
                res = res.substring(0, i) + "q" + res.substring(i + 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
