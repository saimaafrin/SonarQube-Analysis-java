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

        // Use a table of pairs for the 10s place.
        // Use a table of triples for the 1s place.
        // The pair or triple in the ones place is repeated
        // according to the digit of the tens place.
        // The pair or triple in the tens place is repeated
        // according to the digit of the hundreds place.
        // The pair or triple in the hundreds place is repeated
        // according to the digit of the thousands place.
        String[][] ROMAN_TRIPLES = {
            {"i", "v", "x"},
            {"x", "l", "c"},
            {"c", "d", "m"},
        };

        // Get a stream of digits for the given number.
        // Start with the highest digit.
        LinkedList<Long> digits = new LinkedList<>();
        while (number != 0) {
            digits.addFirst(number % 10);
            number = number / 10;
        }
        // Now we have the digits in reverse order.
        // For each digit, get the appropriate triple from the table,
        // and repeat it according to the digit's value.
        String result = new String();
        for (Long digit : digits) {
            String triple = ROMAN_TRIPLES[result.length() / 3][result.length() % 3];
            result = result + triple.repeat(Math.toIntExact(digit));
        }
        return result;
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
