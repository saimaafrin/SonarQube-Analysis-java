import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given two positive integers a and b, return the even digits between a
    // and b, in ascending order.
    // For example:
    // >>> generateIntegers((2l), (8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))
    // >>> generateIntegers((8l), (2l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))
    // >>> generateIntegers((10l), (14l))
    // (new ArrayList<Long>(Arrays.asList()))
    public static ArrayList<Long> generateIntegers(long a, long b) {

        // Your code here
        ArrayList<Long> evens = new ArrayList<Long>();
        long lower, upper;
        if (a < b) {
            lower = a;
            upper = b;
        } else {
            lower = b;
            upper = a;
        }
        long temp = lower;
        while (temp <= upper) {
            String num = Long.toString(temp);
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '2' || num.charAt(i) == '4' || num.charAt(i) == '6' || num.charAt(i) == '8') {
                    evens.add(Long.parseLong(num));
                    break;
                }
            }
            temp++;
        }
        return evens;
    }
    public static void main(String[] args) {
    assert(generateIntegers((2l), (10l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((10l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((132l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((17l), (89l)).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
