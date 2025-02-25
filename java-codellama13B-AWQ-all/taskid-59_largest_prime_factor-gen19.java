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

        if (n <= 1 || (n & 1l) == 0l)
            throw new IllegalArgumentException("n must be > 1 and odd");
        long m = n;
        // search for prime factors from largest to smallest
        for (long i = (long) Math.sqrt(n); i > 1l; i -= 2l)
            if (n % i == 0l) {
                m = i;
                break;
            }
        // while we're still looking at 2, continue looking for a larger prime
        // factor
        for (long i = m - 2l; i > 1l; i -= 2l)
            if (m % i == 0l)
                return i;
        return m;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
