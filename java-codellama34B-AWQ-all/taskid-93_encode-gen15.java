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

        String[] vowels = { "a", "e", "i", "o", "u" };
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            int index = Arrays.asList(alphabet).indexOf(Character.toString(message.charAt(i)));
            char vowel = message.charAt(i);
            if (Arrays.asList(vowels).contains(Character.toString(vowel))) {
                int vowelIndex = Arrays.asList(vowels).indexOf(Character.toString(vowel));
                if (vowel == 'a') {
                    result += alphabet[index + 2];
                } else if (vowel == 'e') {
                    result += alphabet[index - 2];
                } else if (vowel == 'i') {
                    result += alphabet[index + 2];
                } else if (vowel == 'o') {
                    result += alphabet[index - 2];
                } else if (vowel == 'u') {
                    result += alphabet[index + 2];
                }
            } else {
                result += alphabet[index];
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
