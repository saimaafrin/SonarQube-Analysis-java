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

        message = message.toLowerCase();
        char[] letters = message.toCharArray();
        char[] swapped = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 'a' && letters[i] <= 'z') {
                char toSwap = letters[i] < 'n' ? (char) (letters[i] + 13) : (char) (letters[i] - 13);
                if (letters[i] == 'a') {
                    toSwap = 'n';
                } else if (letters[i] == 'e') {
                    toSwap = 'p';
                } else if (letters[i] == 'i') {
                    toSwap = 'r';
                } else if (letters[i] == 'o') {
                    toSwap = 'x';
                } else if (letters[i] == 'u') {
                    toSwap = 'b';
                }
                swapped[i] = toSwap;
            } else {
                swapped[i] = letters[i];
            }
        }
        return new String(swapped);
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
