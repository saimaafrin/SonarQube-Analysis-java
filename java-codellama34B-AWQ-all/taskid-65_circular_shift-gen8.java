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

        if (shift > Math.round(Math.log10(x))) return Long.toString(x).chars().sorted().mapToObj(i -> (char) i).map(String::valueOf).collect(Collectors.joining());
        int digitCount = (int) Math.round(Math.log10(x));
        long digits = x;
        long[] digitsArr = new long[digitCount + 1];
        for (int i = 0; i < digitCount + 1; i++) {
            digitsArr[i] = digits % 10;
            digits /= 10;
        }
        int digitsLeft = digitCount - (int) shift;
        int digitsRight = (int) shift;
        int[] right = new int[digitsRight];
        int[] left = new int[digitsLeft];
        for (int i = 0; i < digitsRight; i++) right[i] = (int) digitsArr[i];
        for (int i = 0; i < digitsLeft; i++) left[i] = (int) digitsArr[digitsRight + i];
        Arrays.sort(right);
        Arrays.sort(left);
        long result = 0;
        for (int i = digitsRight - 1; i >= 0; i--) {
            result *= 10;
            result += right[i];
        }
        for (int i = digitsLeft - 1; i >= 0; i--) {
            result *= 10;
            result += left[i];
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
