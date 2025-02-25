import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Circular shift the digits of the integer x, shift the digits right by shift
    // and return the result as a string.
    // If shift > number of digits, return digits reversed.
    // >>> circularShift((12l), (1l))
    // ("21")
    // >>> circularShift((12l), (2l))
    // ("12")
    public static String circularShift(long x, long shift) {

        int numberOfDigits = (int) (Math.log10(x) + 1);
        if (shift > numberOfDigits) {
            return String.valueOf(x).reverse();
        }
        StringBuilder result = new StringBuilder();
        for (int i = numberOfDigits - shift; i < numberOfDigits; i++) {
            int digit = (int) (x % 10);
            result.append(digit);
            x = x / 10;
        }
        for (int i = 0; i < numberOfDigits - shift; i++) {
            int digit = (int) (x % 10);
            result.append(digit);
            x = x / 10;
        }
        return result.toString();
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
