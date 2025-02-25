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

        String romans = "i";
        while (number > 0) {
            if (number >= 1000) {
                romans = romans + "m";
                number -= 1000;
            }
            if (number >= 900) {
                romans = romans + "cm";
                number -= 900;
            }
            if (number >= 500) {
                romans = romans + "d";
                number -= 500;
            }
            if (number >= 400) {
                romans = romans + "cd";
                number -= 400;
            }
            if (number >= 100) {
                romans = romans + "c";
                number -= 100;
            }
            if (number >= 90) {
                romans = romans + "xc";
                number -= 90;
            }
            if (number >= 50) {
                romans = romans + "l";
                number -= 50;
            }
            if (number >= 40) {
                romans = romans + "xl";
                number -= 40;
            }
            if (number >= 10) {
                romans = romans + "x";
                number -= 10;
            }
            if (number >= 9) {
                romans = romans + "ix";
                number -= 9;
            }
            if (number >= 5) {
                romans = romans + "v";
                number -= 5;
            }
            if (number >= 4) {
                romans = romans + "iv";
                number -= 4;
            }
            if (number >= 1) {
                romans = romans + "i";
                number -= 1;
            }
        }
        return romans.toLowerCase();
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
