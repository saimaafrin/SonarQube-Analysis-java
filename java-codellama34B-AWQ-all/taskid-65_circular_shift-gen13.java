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

        // Get the digits of x into a list
        List<Integer> digits = new ArrayList<Integer>();
        while (x != 0l) {
            digits.add((int) (x % 10l));
            x /= 10l;
        }
        Collections.reverse(digits);
        // Shift digits right by shift amount
        List<Integer> shifted = digits.subList((int) shift, (int) digits.size());
        shifted.addAll(digits.subList(0, (int) shift));
        // Convert shifted to a string
        return String.join("", shifted.stream().map(e -> String.valueOf(e)).collect(Collectors.toList()));
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
