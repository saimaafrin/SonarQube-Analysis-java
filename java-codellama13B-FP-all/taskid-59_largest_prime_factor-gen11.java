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

        // This is the largest prime that is less than or equal to the
        // square root of n.
        long limit = (long)Math.sqrt(n);
        // i is the current candidate for the largest prime factor of n.
        // The smallest prime that could be a factor of n is 3, so start with
        // i = 3.
        long i = 3;
        // while i is less than or equal to the square root of n, and n is
        // not evenly divisible by i, keep going through the loop.
        // When this loop exits, either i > n/i, or i divides n exactly.
        while (i <= limit) {
            if (n % i == 0) {
                return i;
            }
            i += 2;
        }
        // If we reach here, then i is greater than n/i, and i is not a factor
        // of n. Thus, n is a prime.
        return n;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
