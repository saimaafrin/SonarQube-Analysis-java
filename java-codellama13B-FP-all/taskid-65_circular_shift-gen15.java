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

        // Get number of digits of x
        int num_digits = String.valueOf(x).length();
        // Get digits of x
        List<Long> digits = new ArrayList<Long>();
        for (long div = x; div > 0; div /= 10)
            digits.add(div % 10);
        // Check if shift > number of digits
        if (shift > num_digits) {
            // If so, reverse digits
            Collections.reverse(digits);
            return String.valueOf(digits.stream().mapToLong(v -> v).sum());
        }
        // Get digits from right to left
        List<Long> right_digits = new ArrayList<Long>();
        for (int i = num_digits - shift; i < num_digits; i++)
            right_digits.add(digits.get(i));
        // Add shifted digits from left to right
        for (int i = 0; i < shift; i++)
            right_digits.add(digits.get(i));
        // Return right digits as string
        return String.valueOf(right_digits.stream().mapToLong(v -> v).sum());
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
