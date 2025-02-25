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

        // Check if the number can be divided by the prime numbers less than or equal to sqrt(n)
        // If it can, the largest prime factor of n is not a prime number less than or equal to sqrt(n)
        // And the largest prime factor of n is the largest prime factor of n/i
        // If it cannot, the largest prime factor of n is a prime number less than or equal to sqrt(n)
        for (long i = 2l; i * i <= n; i++) {
            if (n % i == 0) {
                return largestPrimeFactor(n / i);
            }
        }
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
