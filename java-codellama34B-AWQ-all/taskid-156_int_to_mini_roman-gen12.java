import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer, obtain its roman numeral equivalent as a string,
    // and return it in lowercase.
    // Restrictions: 1 <= num <= 1000
    // Examples:
    // >>> intToMiniRoman((19l))
    // ("xix")
    // >>> intToMiniRoman((152l))
    // ("clii")
    // >>> intToMiniRoman((426l))
    // ("cdxxvi")
    public static String intToMiniRoman(long number) {

        // This is a programming assignment for Freshworks.
        // You only need to write code in the blank section below, and some
        // parts are already filled in for you. You will need to write
        // at least 1 and at most 4 lines of code.
        // You do not need to write any import statements, the necessary
        // import statements are already written for you.
        // NOTE: You do not need to write a main method, we will be
        //   calling your intToMiniRoman method directly.

        // WRITE YOUR CODE HERE
        String roman = "";
        while (number > 0) {
            if (number >= 1000) {
                roman += "m";
                number -= 1000;
            } else if (number >= 900) {
                roman += "cm";
                number -= 900;
            } else if (number >= 500) {
                roman += "d";
                number -= 500;
            } else if (number >= 400) {
                roman += "cd";
                number -= 400;
            } else if (number >= 100) {
                roman += "c";
                number -= 100;
            } else if (number >= 90) {
                roman += "xc";
                number -= 90;
            } else if (number >= 50) {
                roman += "l";
                number -= 50;
            } else if (number >= 40) {
                roman += "xl";
                number -= 40;
            } else if (number >= 10) {
                roman += "x";
                number -= 10;
            } else if (number >= 9) {
                roman += "ix";
                number -= 9;
            } else if (number >= 5) {
                roman += "v";
                number -= 5;
            } else if (number >= 4) {
                roman += "iv";
                number -= 4;
            } else if (number >= 1) {
                roman += "i";
                number -= 1;
            }
        }
        return roman;
    }
    public static void main(String[] args) {
    assert(intToMiniRoman((19l)).equals(("xix")));
    assert(intToMiniRoman((152l)).equals(("clii")));
    assert(intToMiniRoman((251l)).equals(("ccli")));
    assert(intToMiniRoman((426l)).equals(("cdxxvi")));
    assert(intToMiniRoman((500l)).equals(("d")));
    assert(intToMiniRoman((1l)).equals(("i")));
    assert(intToMiniRoman((4l)).equals(("iv")));
    assert(intToMiniRoman((43l)).equals(("xliii")));
    assert(intToMiniRoman((90l)).equals(("xc")));
    assert(intToMiniRoman((94l)).equals(("xciv")));
    assert(intToMiniRoman((532l)).equals(("dxxxii")));
    assert(intToMiniRoman((900l)).equals(("cm")));
    assert(intToMiniRoman((994l)).equals(("cmxciv")));
    assert(intToMiniRoman((1000l)).equals(("m")));
    }

}
