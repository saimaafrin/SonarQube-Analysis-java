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

        char[] messageArray = message.toCharArray();
        char[] encodedMessage = new char[messageArray.length];
        int counter = 0;
        for (char x : messageArray) {
            if ((int)x >= 97 && (int)x <= 122) {
                // if lowercase, switch case and move two ahead
                encodedMessage[counter] = (char)(((int)x+2)%90+32);
            } else if ((int)x >= 65 && (int)x <= 90) {
                // if uppercase, switch case and move two ahead
                encodedMessage[counter] = (char)(((int)x+2)%90+33);
            } else {
                encodedMessage[counter] = x;
            }
            counter++;
        }
        return String.valueOf(encodedMessage);
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
