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

        if (x == 0 || shift == 0) {
            return String.valueOf(x);
        }
        // Split the digits into a list
        String[] digits = String.valueOf(x).split("");
        // Calculate the rotation
        int rotate = (int) (shift % digits.length);
        // Reverse the digits and take the appropriate section
        String[] reversed = new String[digits.length];
        int i = 0;
        for (int j = digits.length - rotate - 1; j >= 0; j--) {
            reversed[i] = digits[j];
            i++;
        }
        for (int j = digits.length - 1; j > digits.length - rotate - 1; j--) {
            reversed[i] = digits[j];
            i++;
        }
        // Reverse back to the original order
        List<String> r = Arrays.asList(reversed);
        r = r.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // Create the result string
        String result = "";
        for (String digit : r) {
            result += digit;
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
