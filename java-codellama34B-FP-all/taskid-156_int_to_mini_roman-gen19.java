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

        List<Long> thousands = Arrays.asList(1000l, 900l, 500l, 400l, 100l);
        List<String> thousand_symbols = Arrays.asList("m", "cm", "d", "cd", "c");
        List<Long> fives = Arrays.asList(50l, 90l, 40l, 5l);
        List<String> five_symbols = Arrays.asList("l", "xl", "x", "v");
        List<Long> ones = Arrays.asList(10l, 9l, 5l, 4l, 1l);
        List<String> one_symbols = Arrays.asList("x", "ix", "v", "iv", "i");

        // If it's a four, we need to add an extra symbol to the string
        // based on the number
        String ones_string = ones.stream()
            .filter(x -> x < number)
            .map(x -> one_symbols.get(ones.indexOf(x)))
            .reduce("", (acc, x) -> acc + x);
        if (number % 4 == 0) {
            return ones_string + "iv";
        }

        // Same logic as above, but for fives
        String fives_string = fives.stream()
            .filter(x -> x < number)
            .map(x -> five_symbols.get(fives.indexOf(x)))
            .reduce("", (acc, x) -> acc + x);
        if (number % 5 == 0) {
            return fives_string + "v";
        }

        // Same logic as above, but for thousands
        String thousands_string = thousands.stream()
            .filter(x -> x < number)
            .map(x -> thousand_symbols.get(thousands.indexOf(x)))
            .reduce("", (acc, x) -> acc + x);
        if (number % 1000 == 0) {
            return thousands_string + "m";
        }

        return thousands_string + fives_string + ones_string;
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
