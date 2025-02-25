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

        int nDigits = (int) (Math.log10(x) + 1);
        int digits[] = new int[nDigits];
        for (int i = nDigits - 1; i >= 0; i--) {
            digits[i] = (int) (x % 10);
            x /= 10;
        }
        if (shift >= nDigits) {
            reverse(digits, 0, nDigits - 1);
        } else {
            reverse(digits, 0, (int) (shift - 1));
            reverse(digits, (int) (shift), nDigits - 1);
            reverse(digits, 0, nDigits - 1);
        }
        String result = "";
        for (int i = 0; i < nDigits; i++) {
            result = result + Integer.toString(digits[i]);
        }
        return result;
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
