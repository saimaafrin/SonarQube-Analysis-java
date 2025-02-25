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

        String encodedMessage = "";
        for(int i = 0; i < message.length(); i++){
            char c = message.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char)(c - 32);
            }else if(c >= 'A' && c <= 'Z'){
                c = (char)(c + 32);
            }
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                c = (char)(c + 2);
            }
            encodedMessage += c;
        }
        return encodedMessage;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
