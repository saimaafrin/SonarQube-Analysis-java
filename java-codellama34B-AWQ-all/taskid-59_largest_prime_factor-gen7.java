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

        // Find all prime factors of n. Since n > 1, it must have at least one prime factor.
        // If it were prime, it would be its own largest prime factor and the loop would terminate.
        // Therefore, we can start with smallest = 2.
        long largest = 0l;
        for (long smallest = 2; smallest < n; smallest += 1) {
            // Check if smallest is a factor of n.
            if (n % smallest == 0) {
                // It is a factor, so we now know that n / smallest is at least 2 (smallest can't be 1).
                // If n / smallest is prime, then it must be the largest prime factor.
                if (isPrime(n / smallest)) {
                    return n / smallest;
                } else {
                    // It isn't prime, so we now know that smallest is at most largest.
                    // largestPrimeFactor(n / smallest) is at least 2 and at most n / (smallest + 1).
                    // We can continue the search for the largest prime factor from largest = n / smallest.
                    largest = smallest;
                }
            }
        }
        // If we reach here, then we have searched all factors up to largest and have found no prime factors.
        // largest must be the largest prime factor.
        return largest;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
