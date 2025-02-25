import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the largest prime factor of n. Assume n > 1 and is not a prime.
    // >>> largestPrimeFactor((13195l))
    // (29l)
    // >>> largestPrimeFactor((2048l))
    // (2l)
    public static long largestPrimeFactor(long n) {

        // The smallest prime divisor of n is greater than the square root of n.
        // (2l)
        // >>> primeFactors((64l))
        // (2l, 2l, 2l, 2l)
        // >>> primeFactors((256l))
        // (2l, 2l, 2l, 2l, 2l, 2l)
        long max = (long)(Math.floor(Math.sqrt(n)));
        for (long i = 3; i <= max; i += 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1l;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
