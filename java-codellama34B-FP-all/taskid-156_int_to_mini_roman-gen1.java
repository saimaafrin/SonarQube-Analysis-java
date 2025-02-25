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

        // The base-10 digits of number.
        final long[] digits = new long[(int) Math.ceil(Math.log10(number))];
        for (int i = digits.length - 1; i >= 0; i--, number /= 10) {
            digits[i] = number % 10;
        }

        final StringBuilder buf = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            final long digit = digits[i];

            // 'M' * digit.
            for (long j = 0; j < digit; j++) {
                buf.append('M');
            }

            if (i == 0) {
                continue;
            }

            // 'C' * (digit - 1).
            for (long j = 0; j < digit - 1; j++) {
                buf.append('C');
            }

            // 'D'.
            if (digit >= 5) {
                buf.append('D');
            }
        }

        return buf.toString();
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
