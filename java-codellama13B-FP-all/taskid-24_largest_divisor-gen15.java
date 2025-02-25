import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given number n, find the largest number that divides n evenly, smaller than n
    // >>> largestDivisor((15l))
    // (5l)
    public static long largestDivisor(long n) {

        // Use a set to keep track of the divisors
        Set<Long> divisors = new HashSet<>();
        // Loop through all possible divisors
        for (long i = 1; i <= n; i++) {
            // If the number is a divisor
            if (n % i == 0) {
                // Add it to the set
                divisors.add(i);
            }
        }
        // Return the last divisor
        return divisors.stream().reduce(0l, (a, b) -> b);
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
