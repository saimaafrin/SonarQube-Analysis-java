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

        // Convert to string
        String x_str = Long.toString(x);
        // Get length of string
        long length = x_str.length();
        // If shift > length, shift by length instead
        if (shift >= length) {
            shift = length;
        }
        // Cut the string into two parts
        String str_2 = x_str.substring(0, (int) (length - shift));
        String str_1 = x_str.substring((int) (length - shift));
        // Reverse the order of str_1
        String reverse = new StringBuilder(str_1).reverse().toString();
        // Return both parts concatenated
        return str_2 + reverse;
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
