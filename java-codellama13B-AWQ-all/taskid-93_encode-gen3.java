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

        String encoded = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c - ('A' - 'a'));
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (c + ('A' - 'a'));
            } else if (c >= 'a' && c <= 'e') {
                c = (char) (c + ('a' - 'e' + 2));
            } else if (c >= 'f' && c <= 'h') {
                c = (char) (c - ('f' - 'a' + 2));
            } else if (c >= 'i' && c <= 'l') {
                c = (char) (c + ('a' - 'i' + 2));
            } else if (c >= 'm' && c <= 'o') {
                c = (char) (c - ('m' - 'a' + 2));
            } else if (c >= 'p' && c <= 't') {
                c = (char) (c + ('a' - 'p' + 2));
            } else if (c >= 'u' && c <= 'z') {
                c = (char) (c - ('u' - 'a' + 2));
            }
            encoded += c;
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
