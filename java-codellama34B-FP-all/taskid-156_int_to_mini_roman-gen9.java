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

        if (number > 1000) return "Error";
        if (number == 1000) return "m";
        String mr = "";
        while (number > 0) {
            // Divide by 1000
            if (number / 1000 != 0) {
                mr += "m";
                number %= 1000;
            }
            // Divide by 500
            if (number / 500 != 0) {
                mr += "d";
                number %= 500;
            }
            // Divide by 100
            if (number / 100 != 0) {
                mr += "c";
                number %= 100;
            }
            // Divide by 50
            if (number / 50 != 0) {
                mr += "l";
                number %= 50;
            }
            // Divide by 10
            if (number / 10 != 0) {
                mr += "x";
                number %= 10;
            }
            // Divide by 5
            if (number / 5 != 0) {
                mr += "v";
                number %= 5;
            }
            // Divide by 1
            if (number / 1 != 0) {
                mr += "i";
                number %= 1;
            }
            // If the number is less than 1000, then it should be in lowercase
            // because 1000 and above are in uppercase.
            // if (number < 1000) {
            //     mr.toLowerCase();
            // }
        }
        return mr;
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
