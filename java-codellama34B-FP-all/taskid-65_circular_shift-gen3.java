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

        List<Integer> digits = new ArrayList<>();
        long temp = x;
        if(shift > Math.floor(Math.log10(x)) + 1) {
            shift = shift % Math.floor(Math.log10(x)) + 1;
        }
        while(temp > 0) {
            digits.add(0, (int) (temp % 10));
            temp = temp / 10;
        }
        int digit = digits.size();
        if(shift > digit) {
            shift = shift % digit;
        }
        Collections.rotate(digits, (int) (-shift));
        StringBuilder sb = new StringBuilder();
        for(Integer i : digits) {
            sb.append(i);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    assert(circularShift((100l), (2l)).equals(("001")));
    assert(circularShift((12l), (2l)).equals(("12")));
    assert(circularShift((97l), (8l)).equals(("79")));
    assert(circularShift((12l), (1l)).equals(("21")));
    assert(circularShift((11l), (101l)).equals(("11")));
    }

}
