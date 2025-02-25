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

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] arr = message.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c >= 'A' && c <= 'Z') {
                if (Arrays.asList(vowels).contains(Character.toLowerCase(c))) {
                    arr[i] = (char) (((int) c + 2 - 'A') % 26 + 'A');
                }
                arr[i] = (char) ('A' + ('Z' - (int) arr[i]));
            } else if (c >= 'a' && c <= 'z') {
                if (Arrays.asList(vowels).contains(Character.toLowerCase(c))) {
                    arr[i] = (char) (((int) c + 2 - 'a') % 26 + 'a');
                }
                arr[i] = (char) ('a' + ('z' - (int) arr[i]));
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
