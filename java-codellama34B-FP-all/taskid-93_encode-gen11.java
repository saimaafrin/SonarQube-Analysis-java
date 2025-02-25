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

        String res = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'a') {
                res += 'c';
            } else if (message.charAt(i) == 'e') {
                res += 'g';
            } else if (message.charAt(i) == 'i') {
                res += 'k';
            } else if (message.charAt(i) == 'o') {
                res += 'm';
            } else if (message.charAt(i) == 'u') {
                res += 'o';
            } else if (message.charAt(i) == 'A') {
                res += 'C';
            } else if (message.charAt(i) == 'E') {
                res += 'G';
            } else if (message.charAt(i) == 'I') {
                res += 'K';
            } else if (message.charAt(i) == 'O') {
                res += 'M';
            } else if (message.charAt(i) == 'U') {
                res += 'O';
            } else {
                res += message.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
