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
            return "out of bounds";
        }
        if (number < 1) {
            return "out of bounds";
        }
        String[] numerals = {
                "i",
                "v",
                "x",
                "l",
                "c",
                "d",
                "m"
        };
        StringBuilder sb = new StringBuilder();
        String n = number + "";
        String[] digits = new String[n.length()];
        for (int i = 0; i < n.length(); i++) {
            digits[i] = n.substring(i, i + 1);
        }
        for (int j = 0; j < digits.length; j++) {
            if (digits[j].equals("1")) {
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("2")) {
                sb.append(numerals[j * 2]);
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("3")) {
                sb.append(numerals[j * 2]);
                sb.append(numerals[j * 2]);
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("4")) {
                sb.append(numerals[(j * 2) + 1]);
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("5")) {
                sb.append(numerals[(j * 2) + 1]);
            }
            if (digits[j].equals("6")) {
                sb.append(numerals[(j * 2) + 1]);
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("7")) {
                sb.append(numerals[(j * 2) + 1]);
                sb.append(numerals[j * 2]);
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("8")) {
                sb.append(numerals[(j * 2) + 1]);
                sb.append(numerals[j * 2]);
                sb.append(numerals[j * 2]);
                sb.append(numerals[j * 2]);
            }
            if (digits[j].equals("9")) {
                sb.append(numerals[(j * 2) + 2]);
                sb.append(numerals[(j * 2)]);
            }
        }
        return sb.toString();
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
