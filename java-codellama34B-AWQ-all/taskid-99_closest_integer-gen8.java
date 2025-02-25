import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes a value (string) representing a number
    // and returns the closest integer to it. If the number is equidistant
    // from two integers, round it away from zero.
    // Examples
    // >>> closestInteger(("10"))
    // (10l)
    // >>> closestInteger(("15.3"))
    // (15l)
    // Note:
    // Rounding away from zero means that if the given number is equidistant
    // from two integers, the one you should return is the one that is the
    // farthest from zero. For example closest_integer("14.5") should
    // return 15 and closest_integer("-14.5") should return -15.
    public static long closestInteger(String value) {

        long num = Long.parseLong(value);
        long down = Math.floor(num);
        long up = Math.ceil(num);
        long downDiff = Math.abs(down - num);
        long upDiff = Math.abs(up - num);
        if (downDiff < upDiff) {
            return down;
        } else if (upDiff < downDiff) {
            return up;
        } else {
            if (down == 0) {
                return 1;
            } else if (up == 0) {
                return -1;
            } else {
                return (num / Math.abs(num)) * (Math.abs(num) - 1);
            }
        }
    }
    public static void main(String[] args) {
    assert(closestInteger(("10")) == (10l));
    assert(closestInteger(("14.5")) == (15l));
    assert(closestInteger(("-15.5")) == (-16l));
    assert(closestInteger(("15.3")) == (15l));
    assert(closestInteger(("0")) == (0l));
    }

}
