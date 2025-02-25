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

        // 2147483648l == 0x80000000l, -2147483648l == -0x80000000l
        if (shift < -2147483648l || shift > 2147483647l) {
            throw new IllegalArgumentException("Illegal shift value");
        }
        // int cast is needed to limit shift to 32 bits
        int s = (int) shift;
        return String.valueOf(Long.parseLong(
                                             String.valueOf(x).substring(s) +
                                             String.valueOf(x).substring(0, s))
                                             );
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
