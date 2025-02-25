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

        // Write your code here
        // String result = "";
        // for (int i = 0; i < message.length(); i++) {
        //     String current = message.substring(i, i + 1);
        //     switch (current.toLowerCase()) {
        //         case "a":
        //             result += "c";
        //             break;
        //         case "e":
        //             result += "g";
        //             break;
        //         case "i":
        //             result += "k";
        //             break;
        //         case "o":
        //             result += "m";
        //             break;
        //         case "u":
        //             result += "o";
        //             break;
        //         default:
        //             if (Character.isUpperCase(current.charAt(0))) {
        //                 result += current.toLowerCase();
        //             } else {
        //                 result += current.toUpperCase();
        //             }
        //             break;
        //     }
        // }
        // return result;
        return message.chars().map(c -> {
            c ^= 0b00100000;
            switch (c) {
                case 'a':
                    return 'c';
                case 'e':
                    return 'g';
                case 'i':
                    return 'k';
                case 'o':
                    return 'm';
                case 'u':
                    return 'n';
                default:
                    return c;
            }
        }).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
    public static void main(String[] args) {
    assert(encode(("TEST")).equals(("tgst")));
    assert(encode(("Mudasir")).equals(("mWDCSKR")));
    assert(encode(("YES")).equals(("ygs")));
    assert(encode(("This is a message")).equals(("tHKS KS C MGSSCGG")));
    assert(encode(("I DoNt KnOw WhAt tO WrItE")).equals(("k dQnT kNqW wHcT Tq wRkTg")));
    }

}
