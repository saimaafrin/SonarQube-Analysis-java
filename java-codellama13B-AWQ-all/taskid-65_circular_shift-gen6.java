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

        // convert the integer to a string
        String s = Long.toString(x);
        // reverse the string
        String sRev = new StringBuffer(s).reverse().toString();
        // get the number of digits in the string
        int nDigits = s.length();
        // if the shift is larger than the number of digits
        // then just return the string reversed
        if (shift > nDigits) {
            return sRev;
        }
        // otherwise, use the modulus operator
        // to find the new starting index
        int newStart = nDigits - (int)(shift % nDigits);
        // get the new digits in reverse order
        String sNew = sRev.substring(newStart, nDigits);
        // return the new string
        return sNew;
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
