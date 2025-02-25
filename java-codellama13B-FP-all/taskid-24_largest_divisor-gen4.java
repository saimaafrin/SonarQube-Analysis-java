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

        // We want the largest divisor of n, which is also the smallest number that divides n evenly
        // The smallest divisor of n is 1, so we can start at 1 and increment until we find something that divides n
        // All prime numbers are divisors, but we only need to check odd numbers below sqrt(n)
        for(long divisor = 1; divisor <= (int)(Math.sqrt(n)); divisor+=2) {
            if(n%divisor == 0) {
                return divisor;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
