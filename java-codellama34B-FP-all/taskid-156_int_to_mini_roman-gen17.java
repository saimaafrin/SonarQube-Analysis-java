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

        if (number > 1000) {
            return "Number is too high";
        }
        // if (number == 1) {
        //     return "I";
        // }
        // if (number == 2) {
        //     return "II";
        // }
        // if (number == 3) {
        //     return "III";
        // }
        // if (number == 4) {
        //     return "IV";
        // }
        // if (number == 5) {
        //     return "V";
        // }
        // if (number == 6) {
        //     return "VI";
        // }
        // if (number == 7) {
        //     return "VII";
        // }
        // if (number == 8) {
        //     return "VIII";
        // }
        // if (number == 9) {
        //     return "IX";
        // }
        // if (number == 10) {
        //     return "X";
        // }
        // if (number == 11) {
        //     return "XI";
        // }
        // if (number == 12) {
        //     return "XII";
        // }
        // if (number == 13) {
        //     return "XIII";
        // }
        // if (number == 14) {
        //     return "XIV";
        // }
        // if (number == 15) {
        //     return "XV";
        // }
        // if (number == 16) {
        //     return "XVI";
        // }
        // if (number == 17) {
        //     return "XVII";
        // }
        // if (number == 18) {
        //     return "XVIII";
        // }
        // if (number == 19) {
        //     return "XIX";
        // }
        // if (number == 20) {
        //     return "XX";
        // }
        // if (number == 21) {
        //     return "XXI";
        // }
        // if (number == 22) {
        //     return "XXII";
        // }
        // if (number == 23) {
        //     return "XXIII";
        // }
        // if (number == 24) {
        //     return "XXIV";
        // }
        // if (number == 25) {
        //     return "XXV";
        // }
        // if (number == 26) {
        //     return "XXVI";
        // }
        // if (number == 27) {
        //     return "XXVII";
        // }
        // if (number == 28) {
        //     return "XXVIII";
        // }
        // if (number == 29) {
        //     return "XXIX";
        // }
        // if (number == 30) {
        //     return "XXX";
        // }
        // if (number == 31) {
        //     return "XXXI";
        // }
        // if (number == 32) {
        //     return "XXXII";
        // }
        // if (number == 33) {
        //     return "XXXIII";
        // }
        // if
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
