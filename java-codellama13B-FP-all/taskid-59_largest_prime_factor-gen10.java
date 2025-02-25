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

        // The largest prime factor of n is either going to be in the range [1, sqrt(n)],
        // or it's going to be in the range [sqrt(n), n].
        long upper = (long)(Math.sqrt(n));
        long lower = 1l;
        while (lower <= upper) {
            long mid = (upper + lower) / 2l;
            if (n % mid == 0l) {
                long divisor = n / mid;
                if (isPrime(divisor)) {
                    return divisor;
                }
                upper = mid - 1l;
            } else {
                lower = mid + 1l;
            }
        }
        // If we reach this point, we've checked all the values in the range [1, sqrt(n)],
        // and the value is not a prime divisor of n.
        return largestPrimeFactor(n - 1l);
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
