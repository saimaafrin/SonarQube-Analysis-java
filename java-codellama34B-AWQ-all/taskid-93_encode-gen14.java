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
        String[] vowels = { "a", "e", "i", "o", "u" };
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        StringBuilder encodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (Character.isUpperCase(message.charAt(i))) {
                for (int j = 0; j < vowels.length; j++) {
                    if (message.charAt(i) == vowels[j].charAt(0)) {
                        encodedMessage.append(alphabet[24 - vowels[j].length()]);
                    }
                }
                if (encodedMessage.toString().contains(String.valueOf(message.charAt(i)))) {
                    continue;
                } else {
                    encodedMessage.append(Character.toUpperCase(message.charAt(i)));
                }
            } else {
                for (int j = 0; j < vowels.length; j++) {
                    if (message.charAt(i) == vowels[j].charAt(0)) {
                        encodedMessage.append(alphabet[24 - vowels[j].length()]);
                    }
                }
                if (encodedMessage.toString().contains(String.valueOf(message.charAt(i)))) {
                    continue;
                } else {
                    encodedMessage.append(message.charAt(i));
                }
            }
        }
        return encodedMessage.toString();
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
