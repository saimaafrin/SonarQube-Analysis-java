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

        if (number == 0)
            return "";
        String s = "";
        while (number > 0) {
            if (number >= 1000) {
                s += "m";
                number -= 1000;
            }
            if (number >= 900) {
                s += "cm";
                number -= 900;
            }
            if (number >= 500) {
                s += "d";
                number -= 500;
            }
            if (number >= 400) {
                s += "cd";
                number -= 400;
            }
            if (number >= 100) {
                s += "c";
                number -= 100;
            }
            if (number >= 90) {
                s += "xc";
                number -= 90;
            }
            if (number >= 50) {
                s += "l";
                number -= 50;
            }
            if (number >= 40) {
                s += "xl";
                number -= 40;
            }
            if (number >= 10) {
                s += "x";
                number -= 10;
            }
            if (number >= 9) {
                s += "ix";
                number -= 9;
            }
            if (number >= 5) {
                s += "v";
                number -= 5;
            }
            if (number >= 4) {
                s += "iv";
                number -= 4;
            }
            if (number >= 1) {
                s += "i";
                number -= 1;
            }
        }
        return s;
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
