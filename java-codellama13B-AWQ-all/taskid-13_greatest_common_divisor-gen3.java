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

        // 最大公約数を求める
        long gcd = 1;
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        for (long i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
    assert(greatestCommonDivisor((3l), (7l)) == (1l));
    assert(greatestCommonDivisor((10l), (15l)) == (5l));
    assert(greatestCommonDivisor((49l), (14l)) == (7l));
    assert(greatestCommonDivisor((144l), (60l)) == (12l));
    }

}
