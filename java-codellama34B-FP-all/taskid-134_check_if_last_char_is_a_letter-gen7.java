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

        if (txt.isEmpty()) return false;
        String[] words = txt.split(" ");
        String lastChar = words[words.length-1];
        char lastCharTxt = lastChar.charAt(lastChar.length()-1);
        if (lastChar.length()==1) return Character.isAlphabetic(lastCharTxt);
        return Character.isAlphabetic(lastCharTxt) && !Character.isAlphabetic(lastCharTxt-1);
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
