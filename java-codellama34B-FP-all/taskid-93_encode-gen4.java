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

        // write code here
        String result = "";
        for(int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if(Character.isLowerCase(curr)) {
                if(curr == 'a') {
                    curr = 'c';
                } else if(curr == 'e') {
                    curr = 'g';
                } else if(curr == 'i') {
                    curr = 'k';
                } else if(curr == 'o') {
                    curr = 'm';
                } else if(curr == 'u') {
                    curr = 'o';
                } else {
                    curr = Character.toUpperCase(curr);
                }
            } else {
                if(curr == 'A') {
                    curr = 'C';
                } else if(curr == 'E') {
                    curr = 'G';
                } else if(curr == 'I') {
                    curr = 'K';
                } else if(curr == 'O') {
                    curr = 'M';
                } else if(curr == 'U') {
                    curr = 'O';
                } else {
                    curr = Character.toLowerCase(curr);
                }
            }
            result += curr;
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
