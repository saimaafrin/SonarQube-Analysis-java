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
        // for each char in message
        for (char c : message.toCharArray()) {
            // if char is uppercase
            if (Character.isUpperCase(c)) {
                // change to lowercase
                c = Character.toLowerCase(c);
            }
            // if char is vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // get char 2 places ahead in alphabet
                char ahead = (char) (c + 2);
                // if char is z, add 2 to make it c
                if (ahead > 'z') {
                    ahead = (char) (ahead - 26);
                }
                // add ahead to encoded
                encoded = encoded + ahead;
            }
            // if char is not vowel
            else {
                // add char to encoded
                encoded = encoded + c;
            }
        }
        // return encoded
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
