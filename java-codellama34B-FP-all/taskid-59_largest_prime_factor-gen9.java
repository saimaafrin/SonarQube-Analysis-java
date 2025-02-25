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

        // Check if n is a prime number
        if (isPrime(n)) {
            return n;
        }
        // Find the largest divisor of n
        long largest_divisor = n;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                largest_divisor = i;
            }
        }
        // If the largest divisor is prime, then n must be a prime number
        if (isPrime(largest_divisor)) {
            return largest_divisor;
        } else {
            // Otherwise, keep checking until we find the largest prime divisor
            return largestPrimeFactor(largest_divisor);
        }
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
