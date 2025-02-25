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

        if (number < 0) {
            // deal with negative numbers
            return -truncateNumber(-number);
        } else if (number >= 1) {
            // deal with numbers >= 1
            return truncateNumber(number - 1) + 1;
        } else {
            // deal with number between 0 and 1
            float x = 0;
            int y = 0;
            while (y == 0) {
                x += number;
                y = (int) x;
            }
            return x - y;
        }
    }
    public static void main(String[] args) {
    assert(truncateNumber((3.5f)) == (0.5f));
    assert(truncateNumber((1.25f)) == (0.25f));
    assert(truncateNumber((123.0f)) == (0.0f));
    }

}
