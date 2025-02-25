import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of prime factors of given integer in the order from smallest to largest.
    // Each of the factors should be array listed number of times corresponding to how many times it appeares in factorization.
    // Input number should be equal to the product of all factors
    // >>> factorize((8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))
    // >>> factorize((25l))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l)))
    // >>> factorize((70l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)7l)))
    public static ArrayList<Long> factorize(long n) {

        // Use a boolean array to remember if a number is prime
        ArrayList<Long> factors = new ArrayList<Long>();
        long largest = 0;
        for (long i = 2; i <= n; i++) {
            // Start with i and repeatedly divide i by the smallest integer j such that i is divisible by j
            // If the result is equal to i, then i is prime
            // Start with i and repeatedly divide i by the smallest integer j such that i is divisible by j
            // If the result is equal to i, then i is prime
            long j = 2;
            long result = 0;
            while (true) {
                result = i / j;
                if (result * j != i) {
                    j++;
                } else {
                    // If i is not divisible by j, then j <= sqrt(i)
                    // If i is not divisible by j, then j <= sqrt(i)
                    break;
                }
            }
            if (result == i) {
                factors.add(i);
                largest = i;
            } else if (result <= largest) {
                // If i is divisible by some j with j <= sqrt(i), then i = j * k for some integer k with j <= k <= sqrt(i)
                // If i is divisible by some j with j <= sqrt(i), then i = j * k for some integer k with j <= k <= sqrt(i)
                int count = 0;
                while (i % j == 0) {
                    i = i / j;
                    count++;
                }
                factors.add(j);
                factors.add(count);
                largest = j;
            }
        }
        return factors;
    }
    public static void main(String[] args) {
    assert(factorize((2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l)))));
    assert(factorize((4l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l)))));
    assert(factorize((8l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))));
    assert(factorize((57l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)19l)))));
    assert(factorize((3249l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)19l, (long)19l)))));
    assert(factorize((185193l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)3l, (long)19l, (long)19l, (long)19l)))));
    assert(factorize((20577l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)19l, (long)19l, (long)19l)))));
    assert(factorize((18l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)3l)))));
    }

}
