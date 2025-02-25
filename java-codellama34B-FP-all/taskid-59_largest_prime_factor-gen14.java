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

        // If n is even, then it's largest prime factor is 2.
        if (n % 2 == 0) {
            return 2;
        }

        // We don't need to check all the way up to n.
        for (long i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return largestPrimeFactor(i);
            }
        }
        // If n is odd and this point is reached, then it is a prime number.
        // Therefore, it's largest prime factor is itself.
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
