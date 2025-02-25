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

        long c;
        long d;
        long e;
        long f;
        // If a > b, swap them
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        // Initialize variables
        d = a;
        e = b;
        // Loop through until we find the greatest common divisor
        while (true) {
            f = d % e;
            if (f == 0) {
                break;
            }
            d = e;
            e = f;
        }
        return e;
    }
    public static void main(String[] args) {
    assert(greatestCommonDivisor((3l), (7l)) == (1l));
    assert(greatestCommonDivisor((10l), (15l)) == (5l));
    assert(greatestCommonDivisor((49l), (14l)) == (7l));
    assert(greatestCommonDivisor((144l), (60l)) == (12l));
    }

}
