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

        long a = x;
        long num_digits = 0;
        long div = x;
        while (div > 0) {
            num_digits += 1;
            div /= 10;
        }
        if (shift > num_digits) {
            String a_s = Long.toString(a);
            String result = new StringBuilder(a_s).reverse().toString();
            return result;
        }
        if (shift == 0) {
            String result = Long.toString(a);
            return result;
        }
        long digit = a % 10;
        long result = a / 10;
        result = result * (long)Math.pow(10, (int)shift) + digit;
        result = result % (long)Math.pow(10, (int)(num_digits - shift));
        String result_s = Long.toString(result);
        return result_s;
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
