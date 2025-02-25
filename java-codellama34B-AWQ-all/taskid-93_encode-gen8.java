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

        // Your code here
        // Use this to keep track of the encoded string
        String encoded_message = "";
        // Hint: Use this tuple to know which letters to swap
        // ('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
        Tuple52<Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character> alphabet_tuple = new Tuple52<Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character, Character>('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        // Write your code here
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'a') {
                encoded_message += 'c';
            } else if (message.charAt(i) == 'b') {
                encoded_message += 'd';
            } else if (message.charAt(i) == 'c') {
                encoded_message += 'e';
            } else if (message.charAt(i) == 'd') {
                encoded_message += 'f';
            } else if (message.charAt(i) == 'e') {
                encoded_message += 'g';
            } else if (message.charAt(i) == 'f') {
                encoded_message += 'h';
            } else if (message.charAt(i) == 'g') {
                encoded_message += 'i';
            } else if (message.charAt(i) == 'h') {
                encoded_message += 'j';
            } else if (message.charAt(i) == 'i') {
                encoded_message += 'k';
            } else if (message.charAt(i) == 'j') {
                encoded_message += 'l';
            } else if (message.charAt(i) == 'k') {
                encoded_message += 'm';
            } else if (message.charAt(i) == 'l') {
                encoded_message += 'n';
            } else if (message.charAt(i) == 'm') {
                encoded_message += 'o';
            } else if (message.charAt(i) == 'n') {
                encoded_message += 'p';
            } else if (message.charAt(i) == 'o') {
                encoded_message += 'q';
            } else if (message.charAt(i) == 'p') {
                encoded_message += 'r';
            } else if (message.charAt(i) == 'q') {
                encoded_message += 's';
            } else if (message.charAt(i) == 'r') {
               
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
