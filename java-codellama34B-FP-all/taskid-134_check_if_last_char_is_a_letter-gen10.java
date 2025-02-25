import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that returns true if the last character
    // of a given string is an alphabetical character and is not
    // a part of a word, and false otherwise.
    // Note: "word" is a group of characters separated by space.
    // Examples:
    // >>> checkIfLastCharIsALetter(("apple pie"))
    // (false)
    // >>> checkIfLastCharIsALetter(("apple pi e"))
    // (true)
    // >>> checkIfLastCharIsALetter(("apple pi e "))
    // (false)
    // >>> checkIfLastCharIsALetter((""))
    // (false)
    public static boolean checkIfLastCharIsALetter(String txt) {

        // String.charAt(String.length()-1) will return the last character of the string.
        // toCharArray() will convert the string to a character array, so you can loop over the characters
        // and determine if they're all alphabetical (use Character.isAlphabetic() for this).
        // Then, if the last character is alphabetical, you can use String.trim() to remove whitespace
        // from the end of the string, and if there's a difference in length, then you know that the last
        // character was a whitespace character.
        char lastChar = txt.charAt(txt.length()-1);
        Character last = null;
        Character last2 = null;
        for(int i = 0; i < txt.length(); i++){
            char c = txt.charAt(i);
            if(Character.isAlphabetic(c) || c == ' '){
                if(Character.isAlphabetic(c)){
                    last2 = last;
                    last = c;
                }
            }
        }
        if(last == lastChar && last2 == ' '){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    assert(checkIfLastCharIsALetter(("apple")) == (false));
    assert(checkIfLastCharIsALetter(("apple pi e")) == (true));
    assert(checkIfLastCharIsALetter(("eeeee")) == (false));
    assert(checkIfLastCharIsALetter(("A")) == (true));
    assert(checkIfLastCharIsALetter(("Pumpkin pie ")) == (false));
    assert(checkIfLastCharIsALetter(("Pumpkin pie 1")) == (false));
    assert(checkIfLastCharIsALetter(("")) == (false));
    assert(checkIfLastCharIsALetter(("eeeee e ")) == (false));
    assert(checkIfLastCharIsALetter(("apple pie")) == (false));
    assert(checkIfLastCharIsALetter(("apple pi e ")) == (false));
    }

}
