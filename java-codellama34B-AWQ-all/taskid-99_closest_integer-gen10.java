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

        // your code here
        double number = Double.parseDouble(value);
        double positive_number = Math.floor(number);
        double negative_number = Math.ceil(number);
        double positive_difference = number - positive_number;
        double negative_difference = number - negative_number;
        if (positive_difference > negative_difference) {
            return (long) negative_number;
        } else {
            return (long) positive_number;
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
