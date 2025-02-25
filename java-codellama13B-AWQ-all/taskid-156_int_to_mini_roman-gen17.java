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

        if (number == 1l) { return ("i"); }
        if (number == 4l) { return ("iv"); }
        if (number == 5l) { return ("v"); }
        if (number == 9l) { return ("ix"); }
        if (number == 10l) { return ("x"); }
        if (number == 40l) { return ("xl"); }
        if (number == 50l) { return ("l"); }
        if (number == 90l) { return ("xc"); }
        if (number == 100l) { return ("c"); }
        if (number == 400l) { return ("cd"); }
        if (number == 500l) { return ("d"); }
        if (number == 900l) { return ("cm"); }
        if (number == 1000l) { return ("m"); }
        if (number >= 1l && number < 4l) {
            return (intToMiniRoman((number - 1l)) + "i");
        } else if (number >= 4l && number < 5l) {
            return (intToMiniRoman((number - 4l)) + "v");
        } else if (number >= 5l && number < 9l) {
            return (intToMiniRoman((number - 5l)) + "x");
        } else if (number >= 9l && number < 10l) {
            return (intToMiniRoman((number - 9l)) + "i");
        } else if (number >= 10l && number < 40l) {
            return (intToMiniRoman((number - 10l)) + "x");
        } else if (number >= 40l && number < 50l) {
            return (intToMiniRoman((number - 40l)) + "xl");
        } else if (number >= 50l && number < 90l) {
            return (intToMiniRoman((number - 50l)) + "l");
        } else if (number >= 90l && number < 100l) {
            return (intToMiniRoman((number - 90l)) + "xc");
        } else if (number >= 100l && number < 400l) {
            return (intToMiniRoman((number - 100l)) + "c");
        } else if (number >= 400l && number < 500l) {
            return (intToMiniRoman((number - 400l)) + "cd");
        } else if (number >= 500l && number < 900l) {
            return (intToMiniRoman((number - 500l)) + "d");
        } else if (number >= 900l && number < 1000l) {
            return (intToMiniRoman((number - 900l)) + "cm");
        } else if (number >= 1000l) {
            return (intToMiniRoman((number - 1000l)) + "m");
        }
        return "Error: Not a number";
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
