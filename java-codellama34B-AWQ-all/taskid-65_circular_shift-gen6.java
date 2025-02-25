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

        String xS = String.valueOf(x);
        String result = "";
        long numDigits = 0;
        long numLeadingZeros = 0;
        long i = 0;
        long j = 0;
        long k = 0;
        numDigits = xS.length();
        if (shift >= numDigits) {
            // If the number of digits in x is less than or equal to shift, the
            // digits are shifted all the way right.
            // The result is the digits of x in reverse order.
            for (i = numDigits - 1; i >= 0; i--) {
                result += xS.charAt((int) i);
            }
            return result;
        }
        // If the number of digits in x is greater than shift, the result is the
        // digits of x shifted to the right by shift.
        for (j = shift; j < numDigits; j++) {
            result += xS.charAt((int) j);
        }
        for (k = 0; k < shift; k++) {
            result += xS.charAt((int) k);
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
