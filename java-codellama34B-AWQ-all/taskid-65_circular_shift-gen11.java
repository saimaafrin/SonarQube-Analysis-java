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

        StringBuilder result = new StringBuilder();
        int numberOfDigits = 0;
        long xTemp = x;
        while (xTemp > 0) {
            numberOfDigits += 1;
            xTemp = xTemp / 10;
        }
        if (shift > numberOfDigits) {
            for (int i = numberOfDigits - 1; i >= 0; i--) {
                result.append(Long.toString(x % 10));
                x = x / 10;
            }
            return result.toString();
        }
        else {
            int xAsStringLength = String.valueOf(x).length();
            int numberOfDigitsToCircularShift = (int) (shift % xAsStringLength);
            result.append(String.valueOf(x).substring(0, numberOfDigitsToCircularShift));
            result.append(String.valueOf(x).substring(numberOfDigitsToCircularShift, xAsStringLength));
            result.append(String.valueOf(x).substring(0, numberOfDigitsToCircularShift));
            return result.toString();
        }
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
