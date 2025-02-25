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

        String a = x + "";
        char[] b = a.toCharArray();
        char[] c = new char[shift];
        for (long i = 0; i < shift; i++) {
            c[(int) i] = b[(int) i];
        }
        int d = (int) shift;
        int e = a.length() - d;
        char[] f = new char[e];
        for (int i = 0; i < e; i++) {
            f[i] = b[d];
            d += 1;
        }
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < e; i++) {
            g.append(f[i]);
        }
        for (int i = 0; i < d; i++) {
            g.append(c[i]);
        }
        return g.toString();
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
