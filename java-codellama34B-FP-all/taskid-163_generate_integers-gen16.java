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

        ArrayList<Long> result = new ArrayList<>();
        if (a > b) {
            return result;
        }
        if (a % 2 == 0) {
            result.add(a);
        }
        while (true) {
            a++;
            if (a % 2 != 0) {
                continue;
            }
            if (a % 2 == 0) {
                result.add(a);
            }
            if (a == b) {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(generateIntegers((2l), (10l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((10l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((132l), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)6l, (long)8l)))));
    assert(generateIntegers((17l), (89l)).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
