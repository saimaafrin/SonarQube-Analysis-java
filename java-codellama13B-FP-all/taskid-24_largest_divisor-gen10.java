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

        long divisor = 0;
        for (long i = (long) Math.sqrt(n); i > 0; i -= 1) {
            if (n % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
