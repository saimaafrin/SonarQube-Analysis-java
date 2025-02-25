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

        if (number <= 0 || number > 1000)
            return "";

        // I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
        String[] roman = { "i", "v", "x", "l", "c", "d", "m" };

        String result = "";

        String[][] lookup = { { "i", "v", "x" }, { "x", "l", "c" }, { "c", "d", "m" } };

        for (int i = lookup.length - 1; i >= 0; i--) {
            String[] levels = lookup[i];

            int place = (int) Math.pow(10, i + 1);
            int digit = (int) (number / place);
            number %= place;

            if (digit == 9) {
                result += levels[2] + levels[0];
            } else if (digit >= 5) {
                result += levels[1];
                for (int j = 0; j < digit - 5; j++)
                    result += levels[0];
            } else if (digit == 4) {
                result += levels[0] + levels[1];
            } else {
                for (int j = 0; j < digit; j++)
                    result += levels[0];
            }
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
