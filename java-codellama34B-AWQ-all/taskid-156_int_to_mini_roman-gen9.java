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

        // A dictionary for converting ints to their roman numeral strings.
        HashMap<Integer, String> romanNumerals = new HashMap<Integer, String>();
        romanNumerals.put(1, "i");
        romanNumerals.put(5, "v");
        romanNumerals.put(10, "x");
        romanNumerals.put(50, "l");
        romanNumerals.put(100, "c");
        romanNumerals.put(500, "d");
        romanNumerals.put(1000, "m");
        romanNumerals.put(1000000, "e");
        // Split the int up into its component parts, and convert each part to
        // a roman numeral string.
        String romanNumber = "";
        for (Map.Entry<Integer, String> numeral : romanNumerals.entrySet()) {
            while (number >= numeral.getKey()) {
                romanNumber += numeral.getValue();
                number -= numeral.getKey();
            }
        }
        return romanNumber;
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
