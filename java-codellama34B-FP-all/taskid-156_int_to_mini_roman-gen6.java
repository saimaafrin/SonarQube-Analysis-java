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

        // Create a mapping of values to Mini Roman Numerals.
        Map<Integer, String> romans = new HashMap<Integer, String>() {{
            put(1, "i");
            put(4, "iv");
            put(5, "v");
            put(9, "ix");
            put(10, "x");
            put(40, "xl");
            put(50, "l");
            put(90, "xc");
            put(100, "c");
            put(400, "cd");
            put(500, "d");
            put(900, "cm");
            put(1000, "m");
        }};
        // Split the number into digits.
        List<Integer> digits = new ArrayList<Integer>();
        while (number > 0) {
            digits.add(0, (int) (number % 10));
            number /= 10;
        }
        // Create a buffer to store the Mini Roman Numeral equivalent.
        StringBuilder buffer = new StringBuilder();
        // Iterate over the digits.
        for (int i = 0; i < digits.size(); i++) {
            int digit = digits.get(i);
            // Obtain the corresponding Mini Roman Numeral for the digit.
            String roman = romans.get(digit);
            // If the digit's value is greater than 5, we need to subtract the base
            // value from the digit's value, and append the Mini Roman Numeral
            // for the base value.
            if (digit > 5) {
                int base = digit - 5;
                roman = romans.get(base) + roman;
            }
            // If the digit's value is greater than 4, we need to subtract the
            // base value from the digit's value, and append the Mini Roman
            // Numeral for the base value.
            if (digit > 4) {
                int base = digit - 4;
                roman = romans.get(base) + roman;
            }
            // If the digit's value is less than 4, we need to append the Mini
            // Roman Numeral for the digit's value.
            if (digit < 4) {
                roman = String.join("", Collections.nCopies(digit, romans.get(1)));
            }
            // If the digit is not the least significant digit, and its value
            // is not equal to 1, we need to append the Mini Roman Numeral for
            // the power of ten.
            if (i != 0 && digit != 1) {
                roman += romans.get((int) Math.pow(10, i));
            }
            // Append the Mini Roman Numeral for the digit to the buffer.
            buffer.append(roman);
        }
        // Return the Mini Roman Numeral equivalent.
        return buffer.toString();
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
