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

        int shift = 2;
        String newMessage = "";
        int asciiCode = 0;
        for (char letter : message.toCharArray()) {
            asciiCode = (int) letter;
            if (asciiCode >= 65 && asciiCode <= 90) {
                newMessage += (char) ((asciiCode - 65 + shift) % 26 + 65);
            } else if (asciiCode >= 97 && asciiCode <= 122) {
                newMessage += (char) ((asciiCode - 97 + shift) % 26 + 97);
            } else {
                newMessage += letter;
            }
        }
        return newMessage;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
