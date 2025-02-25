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

        // Declare the closest value and initialize it to null
        Long closestValue = null;
        // Get the decimal point of the value
        int decimalPoint = value.indexOf(".");
        // Check if there is a decimal point
        if (decimalPoint != -1) {
            // Create a substring for the value after the decimal point
            String afterDecimalPoint = value.substring(decimalPoint + 1);
            // Check if there are more than 5 numbers after the decimal point
            if (afterDecimalPoint.length() > 5) {
                // Round the value
                String round = value.substring(0, decimalPoint + 6);
                // Set the closest value to the rounded value
                closestValue = Long.parseLong(round);
            }
            // Check if the value is a whole number
            if (afterDecimalPoint.length() == 1) {
                // Get the number after the decimal point
                int number = Integer.parseInt(afterDecimalPoint);
                // Check if the number is less than 5
                if (number < 5) {
                    // Get the substring of the whole number
                    String beforeDecimalPoint = value.substring(0, decimalPoint);
                    // Set the closest value to the whole number
                    closestValue = Long.parseLong(beforeDecimalPoint);
                }
                // Check if the number is greater than 5
                if (number > 5) {
                    // Get the substring of the whole number
                    String beforeDecimalPoint = value.substring(0, decimalPoint);
                    // Set the closest value to the whole number + 1
                    closestValue = Long.parseLong(beforeDecimalPoint) + 1;
                }
            }
        } else {
            // Set the closest value to the whole number
            closestValue = Long.parseLong(value);
        }
        // Return the closest value
        return closestValue;
    }
    public static void main(String[] args) {
    assert(closestInteger(("10")) == (10l));
    assert(closestInteger(("14.5")) == (15l));
    assert(closestInteger(("-15.5")) == (-16l));
    assert(closestInteger(("15.3")) == (15l));
    assert(closestInteger(("0")) == (0l));
    }

}
