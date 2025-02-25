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

        // Write your answer between # BEGIN and # END
        // # BEGIN
        long max = 1;
        long k = 2;
        while (k <= Math.sqrt(n)) {
            if (n % k == 0) {
                if (k > max) {
                    max = k;
                }
                n /= k;
                k = 1;
            }
            k += 1;
        }
        if (n > max) {
            return n;
        }
        return max;
        // # END
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
