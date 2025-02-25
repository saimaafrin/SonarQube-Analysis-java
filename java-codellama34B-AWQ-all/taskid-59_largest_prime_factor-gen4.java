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

        // Returns the prime factors of n. Assume n > 1 and is not a prime.
        // >>> getPrimeFactors((13195l))
        // (3l, 5l, 3l, 5l)
        List<Long> factors = getPrimeFactors(n);
        long max = 0;
        for (long i = 0; i < factors.size(); i++) {
            if (factors.get(i) > max) {
                max = factors.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
