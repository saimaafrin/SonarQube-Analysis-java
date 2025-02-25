import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the given number is the multiplication of 3 prime numbers
    // and false otherwise.
    // Knowing that (a) is less then 100. 
    // Example:
    // >>> isMultiplyPrime((30l))
    // (true)
    // 30 = 2 * 3 * 5
    public static boolean isMultiplyPrime(long a) {

        if (a == 1)
            return false;
        if (a == 2 || a == 3 || a == 5)
            return true;
        int[] cnt = new int[3];
        int[] primes = new int[3];
        for (int i = 0; i < 3; i++) {
            primes[i] = 2;
        }
        for (int i = 0; i < 3; i++) {
            while (!isPrime(primes[i])) {
                primes[i]++;
            }
        }
        while (true) {
            int i = 0;
            while (primes[i] * primes[i + 1] * primes[i + 2] <= a) {
                if (a % (primes[i] * primes[i + 1] * primes[i + 2]) == 0) {
                    cnt[i]++;
                }
                i++;
            }
            if (cnt[0] == 1 && cnt[1] == 1 && cnt[2] == 1)
                return true;
            for (i = 0; i < 3; i++) {
                if (cnt[i] == 0) {
                    primes[i]++;
                    while (!isPrime(primes[i])) {
                        primes[i]++;
                    }
                    break;
                }
            }
            if (i == 3)
                break;
        }
        return false;
    }
    public static void main(String[] args) {
    assert(isMultiplyPrime((5l)) == (false));
    assert(isMultiplyPrime((30l)) == (true));
    assert(isMultiplyPrime((8l)) == (true));
    assert(isMultiplyPrime((10l)) == (false));
    assert(isMultiplyPrime((125l)) == (true));
    assert(isMultiplyPrime((105l)) == (true));
    assert(isMultiplyPrime((126l)) == (false));
    assert(isMultiplyPrime((729l)) == (false));
    assert(isMultiplyPrime((891l)) == (false));
    assert(isMultiplyPrime((1001l)) == (true));
    }

}
