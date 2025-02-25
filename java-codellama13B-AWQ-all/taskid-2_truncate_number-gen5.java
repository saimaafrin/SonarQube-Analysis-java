import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive floating point number, it can be decomposed into
    // and integer part (largest integer smaller than given number) and decimals
    // (leftover part always smaller than 1).
    // Return the decimal part of the number.
    // >>> truncateNumber((3.5f))
    // (0.5f)
    public static float truncateNumber(float number) {

        // If number is negative return negative of the answer
        // >>> truncateNumber((-3.5f))
        // (-0.5f)
        if (number < 0)
            return -truncateNumber(-number);
        // Get the integer part by casting to int
        // and subtracting it from the number
        // >>> truncateNumber((3.5f))
        // (0.5f)
        int integerPart = (int) number;
        return number - integerPart;
    }
    public static void main(String[] args) {
    assert(truncateNumber((3.5f)) == (0.5f));
    assert(truncateNumber((1.25f)) == (0.25f));
    assert(truncateNumber((123.0f)) == (0.0f));
    }

}
