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

        long x_abs = Math.abs(x);
        int count = 0;
        long result = 0;
        while (x_abs > 0) {
            long rem = x_abs % 10;
            result = result * 10 + rem;
            x_abs /= 10;
            count++;
        }
        if (count == 1) return Long.toString(result);
        if (count == 0) return "0";
        if (count < shift) return Long.toString(result);
        while (shift > 0) {
            long rem = result % 10;
            result = result / 10;
            result = rem * 10 + result;
            shift--;
        }
        return Long.toString(result);
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
