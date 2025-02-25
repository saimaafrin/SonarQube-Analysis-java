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

        BigDecimal bd = new BigDecimal(value);
        // Convert String to BigDecimal
        long long1 = bd.longValue();
        // Convert BigDecimal to long
        BigDecimal bd2 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
        // Round BigDecimal to long
        long long2 = bd2.longValue();
        // Convert BigDecimal to long
        if (long1 != long2)
            return long2;
        // Check if the numbers are different
        if (long1 == 0)
            return 0;
        // Check if the number is 0
        if (long1 < 0)
            return long2 - 1;
        // Return the closest integer to 0
        return long2 + 1;
        // Return the closest integer away from 0
    }
    public static void main(String[] args) {
    assert(closestInteger(("10")) == (10l));
    assert(closestInteger(("14.5")) == (15l));
    assert(closestInteger(("-15.5")) == (-16l));
    assert(closestInteger(("15.3")) == (15l));
    assert(closestInteger(("0")) == (0l));
    }

}
