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

        // Convert the number to a roman numeral
        String romanNumeral = "";
        // Create a map of Roman Numerals to their integer values
        Map<String, Long> map = new HashMap<>();
        map.put("M", 1000l);
        map.put("D", 500l);
        map.put("C", 100l);
        map.put("L", 50l);
        map.put("X", 10l);
        map.put("V", 5l);
        map.put("I", 1l);
        // Iterate through each Roman Numeral in the map
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            // Get the value of the current Roman Numeral
            long value = entry.getValue();
            // Get the corresponding Roman Numeral
            String roman = entry.getKey();
            // Keep subtracting the value of the current Roman Numeral from the number
            // until it is 0, or the Roman Numeral is "M"
            while (value <= number) {
                // Add the Roman Numeral to the string
                romanNumeral += roman;
                // Subtract the value of the current Roman Numeral from the number
                number -= value;
            }
        }
        // Return the Roman Numeral as a string
        return romanNumeral;
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
