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

        String message_encrypted = "";
        String alphabet_shifted = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] message_array = message.toCharArray();
        for (char letter : message_array) {
            if (Character.isUpperCase(letter)) {
                if (letter != 'Z') {
                    letter = alphabet_shifted.charAt(alphabet_shifted.indexOf(letter) + 1);
                } else {
                    letter = 'A';
                }
            } else {
                if (letter != 'z') {
                    letter = alphabet_shifted.charAt(alphabet_shifted.indexOf(letter) + 1);
                } else {
                    letter = 'a';
                }
            }
            message_encrypted = message_encrypted + letter;
        }
        return message_encrypted;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
