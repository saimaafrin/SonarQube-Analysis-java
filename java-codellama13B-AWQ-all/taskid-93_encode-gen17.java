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

        char[] charArray = message.toCharArray();
        char[] newArray = new char[charArray.length];
        int i = 0;
        int j = 2;
        while (i < charArray.length) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                newArray[i] = (char) (charArray[i] + 32);
                i++;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                newArray[i] = (char) (charArray[i] - 32);
                i++;
            } else if (charArray[i] == 32) {
                newArray[i] = charArray[i];
                i++;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                newArray[i] = (char) (charArray[i] - 32);
                i++;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                newArray[i] = (char) (charArray[i] + 32);
                i++;
            } else {
                newArray[i] = charArray[i];
                i++;
            }
        }
        return String.valueOf(newArray);
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
