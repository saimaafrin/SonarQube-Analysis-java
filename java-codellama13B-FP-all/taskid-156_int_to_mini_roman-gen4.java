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

        String s = "";
        while (number > 0) {
            if (number >= 1000) {
                s = s + "m";
                number = number - 1000;
            } else if (number >= 900) {
                s = s + "cm";
                number = number - 900;
            } else if (number >= 500) {
                s = s + "d";
                number = number - 500;
            } else if (number >= 400) {
                s = s + "cd";
                number = number - 400;
            } else if (number >= 100) {
                s = s + "c";
                number = number - 100;
            } else if (number >= 90) {
                s = s + "xc";
                number = number - 90;
            } else if (number >= 50) {
                s = s + "l";
                number = number - 50;
            } else if (number >= 40) {
                s = s + "xl";
                number = number - 40;
            } else if (number >= 10) {
                s = s + "x";
                number = number - 10;
            } else if (number >= 9) {
                s = s + "ix";
                number = number - 9;
            } else if (number >= 5) {
                s = s + "v";
                number = number - 5;
            } else if (number >= 4) {
                s = s + "iv";
                number = number - 4;
            } else if (number >= 1) {
                s = s + "i";
                number = number - 1;
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
