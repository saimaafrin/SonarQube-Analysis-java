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

        // The largest prime factor of n > 1 is <= n / 2.
        // >>> largestPrimeFactor(3l)
        // (3l)
        // >>> largestPrimeFactor(4l)
        // (2l)
        // >>> largestPrimeFactor(5l)
        // (5l)
        // >>> largestPrimeFactor(6l)
        // (3l)
        // >>> largestPrimeFactor(7l)
        // (7l)
        // >>> largestPrimeFactor(8l)
        // (2l)
        // >>> largestPrimeFactor(9l)
        // (3l)
        // >>> largestPrimeFactor(10l)
        // (5l)
        long upperBound = n / 2;
        // >>> largestPrimeFactor(2l)
        // (2l)
        // >>> largestPrimeFactor(3l)
        // (3l)
        // >>> largestPrimeFactor(4l)
        // (2l)
        // >>> largestPrimeFactor(5l)
        // (5l)
        // >>> largestPrimeFactor(6l)
        // (3l)
        // >>> largestPrimeFactor(7l)
        // (7l)
        // >>> largestPrimeFactor(8l)
        // (2l)
        // >>> largestPrimeFactor(9l)
        // (3l)
        // >>> largestPrimeFactor(10l)
        // (5l)
        // >>> largestPrimeFactor(11l)
        // (11l)
        // >>> largestPrimeFactor(12l)
        // (3l)
        // >>> largestPrimeFactor(13l)
        // (13l)
        // >>> largestPrimeFactor(14l)
        // (2l)
        // >>> largestPrimeFactor(15l)
        // (3l)
        // >>> largestPrimeFactor(16l)
        // (2l)
        // >>> largestPrimeFactor(17l)
        // (17l)
        // >>> largestPrimeFactor(18l)
        // (3l)
        // >>> largestPrimeFactor(19l)
        // (19l)
        // >>> largestPrimeFactor(20l)
        // (5l)
        long largestPrime = 0;
        for (long i = 2; i <= upperBound; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    return i;
                }
            }
        }
        return largestPrime;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
