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

        long n = (long)Math.floor(Math.log10(x) + 1);
        if (n == 1) return Long.toString(x);
        if (shift >= n) {
            long last = x % 10;
            return Long.toString(last) + circularShift(x / 10, shift - 1);
        }
        else {
            long last = x % 10;
            long first = x / (long)Math.pow(10, n - shift);
            return Long.toString(first) + circularShift(x % (long)Math.pow(10, n - shift) * 10, shift - 1);
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
