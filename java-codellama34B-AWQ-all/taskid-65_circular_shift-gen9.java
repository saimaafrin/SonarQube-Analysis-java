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

        String num = x + "";
        char[] chars = num.toCharArray();
        String newNum = "";
        if (shift > chars.length) {
            for (int i = chars.length - 1; i >= 0; i--) {
                newNum += chars[i];
            }
        } else {
            for (int i = (int) shift; i < chars.length; i++) {
                newNum += chars[i];
            }
            for (int i = 0; i < (int) shift; i++) {
                newNum += chars[i];
            }
        }
        return newNum;
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
