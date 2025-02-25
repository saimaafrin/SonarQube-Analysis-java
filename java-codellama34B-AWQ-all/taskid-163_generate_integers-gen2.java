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

        ArrayList<Long> retval = new ArrayList<Long>();
        String astr = a + "";
        String bstr = b + "";
        for (int i = 0; i < astr.length(); i++) {
            if (astr.charAt(i) % 2 == 0 && (Long.parseLong(astr.charAt(i) + "") >= a && Long.parseLong(astr.charAt(i) + "") <= b)) {
                retval.add(Long.parseLong(astr.charAt(i) + ""));
            }
        }
        for (int i = 0; i < bstr.length(); i++) {
            if (bstr.charAt(i) % 2 == 0 && (Long.parseLong(bstr.charAt(i) + "") >= a && Long.parseLong(bstr.charAt(i) + "") <= b)) {
                retval.add(Long.parseLong(bstr.charAt(i) + ""));
            }
        }
        Collections.sort(retval);
        return retval;
    }
    public static void main(String[] args) {
    assert(generateIntegers((2l), (10l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((10l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((132l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((17l), (89l)).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
