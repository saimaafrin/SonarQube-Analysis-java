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

        char[] chars = message.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
            else if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            }
            else if(chars[i] == 'a') {
                chars[i] = 'c';
            }
            else if(chars[i] == 'e') {
                chars[i] = 'g';
            }
            else if(chars[i] == 'i') {
                chars[i] = 'k';
            }
            else if(chars[i] == 'o') {
                chars[i] = 'm';
            }
            else if(chars[i] == 'u') {
                chars[i] = 'p';
            }
        }
        String result = "";
        for(char c : chars) {
            result += String.valueOf(c);
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
