import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a greatest common divisor of two integers a and b
    // >>> greatestCommonDivisor((3l), (5l))
    // (1l)
    // >>> greatestCommonDivisor((25l), (15l))
    // (5l)
    public static long greatestCommonDivisor(long a, long b) {

        // If b is 0, then the answer is a
        if (b == 0) {
            return a;
        }
        // If a is 0, then the answer is b
        if (a == 0) {
            return b;
        }
        // If a is negative, make it positive
        if (a < 0) {
            return greatestCommonDivisor(-a, b);
        }
        // If b is negative, make it positive
        if (b < 0) {
            return greatestCommonDivisor(a, -b);
        }
        // If a and b are both odd, then their GCD is even
        if (a % 2 == 1 && b % 2 == 1) {
            return greatestCommonDivisor(a / 2, b / 2) * 2;
        }
        // Swap a and b if needed so that a >= b
        if (a < b) {
            return greatestCommonDivisor(b, a);
        }
        // Return the largest multiple of b that is less than or equal to a
        return greatestCommonDivisor((a - a % b), b);
    }
    public static void main(String[] args) {
    assert(greatestCommonDivisor((3l), (7l)) == (1l));
    assert(greatestCommonDivisor((10l), (15l)) == (5l));
    assert(greatestCommonDivisor((49l), (14l)) == (7l));
    assert(greatestCommonDivisor((144l), (60l)) == (12l));
    }

}
