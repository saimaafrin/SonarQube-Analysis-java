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

        message = message.toUpperCase();
        String encoded = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c == 'A') c = 'C';
                else if (c == 'E') c = 'G';
                else if (c == 'I') c = 'K';
                else if (c == 'O') c = 'S';
                else if (c == 'U') c = 'Y';
                else if (c == 'Y') c = 'A';
                encoded += c;
            } else {
                encoded += c;
            }
        }
        return encoded;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
