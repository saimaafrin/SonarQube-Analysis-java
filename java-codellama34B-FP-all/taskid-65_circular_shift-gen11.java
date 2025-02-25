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

        String[] s = String.format("%d", x).split("");
        if (s.length < 2) return s[0];
        if (shift > s.length) {
            return circularShift(x, shift - s.length);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < shift; i++) {
                sb.append(s[i]);
            }
            for (int i = shift; i < s.length; i++) {
                sb.append(s[i]);
            }
            for (int i = 0; i < shift; i++) {
                sb.append(s[i]);
            }
            return sb.toString();
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
