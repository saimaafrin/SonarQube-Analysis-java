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

        // Convert value to a decimal number
        double decimalNumber = Double.valueOf(value);
        // Check if the number is equidistant from two integers
        // by checking if the decimal part is greater or equal to 0.5
        // and less or equal to -0.5
        if (decimalNumber >= 0.5 && decimalNumber <= -0.5) {
            // If the number is equidistant return the number that is
            // the farthest from zero
            if (decimalNumber > 0) {
                return (long) Math.ceil(decimalNumber);
            } else if (decimalNumber < 0) {
                return (long) Math.floor(decimalNumber);
            } else {
                return (long) Math.ceil(decimalNumber);
            }
        } else {
            // If the number is not equidistant return the
            // nearest integer
            return (long) Math.round(decimalNumber);
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
