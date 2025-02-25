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

        // The value is a number
        Double v = Double.parseDouble(value);
        // We round it to the closest integer
        Double closestInteger = Math.round(v);
        // We check if the rounded value is the same as the original value
        // We do this because Math.round() returns a double, not an integer
        if (closestInteger.toString().equals(value)) {
            // If the rounded value is the same as the original value we return it
            return closestInteger.longValue();
        } else {
            // If the rounded value is not the same as the original value we check if it is closer to zero or away from zero
            if (v < 0) {
                // If the rounded value is away from zero
                // We return the rounded value - 1
                // Example: closestInteger("-14.5") = -15
                return (closestInteger.longValue() - 1);
            } else {
                // If the rounded value is closer to zero
                // We return the rounded value + 1
                // Example: closestInteger("14.5") = 15
                return (closestInteger.longValue() + 1);
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
