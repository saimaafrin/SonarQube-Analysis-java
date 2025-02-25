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

        // Convert the integer into a map, where the keys are the exponent of ten,
        // and the values are the digit at that exponent.
        // Then, for each item in the map, find the corresponding letter value,
        // and append it to the roman string.
        String roman = "";
        HashMap<Long, Long> powers = new HashMap<Long, Long>();
        for (long exp = 1; exp < 10; exp++) {
            long power = (long) Math.pow(10, exp);
            long digit = (number % power) / (long) Math.pow(10, exp - 1);
            powers.put(power, digit);
        }
        for (Map.Entry<Long, Long> e : powers.entrySet()) {
            long power = e.getKey();
            long digit = e.getValue();
            for (int i = 0; i < digit; i++) {
                roman += getLetter(power);
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
