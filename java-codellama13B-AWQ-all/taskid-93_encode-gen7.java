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

        // your code here
        String newMessage = "";
        int newMessageLength = message.length();
        for(int i = 0; i < newMessageLength; i++){
            newMessage += message.charAt(i);
            if(Character.isUpperCase(message.charAt(i))){
                if(message.charAt(i) == 'A'){
                    newMessage += 'C';
                }
                else if(message.charAt(i) == 'E'){
                    newMessage += 'G';
                }
                else if(message.charAt(i) == 'I'){
                    newMessage += 'K';
                }
                else if(message.charAt(i) == 'O'){
                    newMessage += 'S';
                }
                else if(message.charAt(i) == 'U'){
                    newMessage += 'X';
                }
                else{
                    newMessage += (char)(message.charAt(i) + 2);
                }
            }
            else{
                if(message.charAt(i) == 'a'){
                    newMessage += 'c';
                }
                else if(message.charAt(i) == 'e'){
                    newMessage += 'g';
                }
                else if(message.charAt(i) == 'i'){
                    newMessage += 'k';
                }
                else if(message.charAt(i) == 'o'){
                    newMessage += 's';
                }
                else if(message.charAt(i) == 'u'){
                    newMessage += 'x';
                }
                else{
                    newMessage += (char)(message.charAt(i) + 2);
                }
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
