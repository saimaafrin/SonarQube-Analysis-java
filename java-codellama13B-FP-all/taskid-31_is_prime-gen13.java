import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true if a given number is prime, and false otherwise.
    // >>> isPrime((6l))
    // (false)
    // >>> isPrime((101l))
    // (true)
    // >>> isPrime((11l))
    // (true)
    // >>> isPrime((13441l))
    // (true)
    // >>> isPrime((61l))
    // (true)
    // >>> isPrime((4l))
    // (false)
    // >>> isPrime((1l))
    // (false)
    public static boolean isPrime(long n) {

        // If n is less than 2, it is not prime.
        if (n < 2l) {
            return false;
        }
        // If n is equal to 2 or 3, it is prime.
        if (n == 2l || n == 3l) {
            return true;
        }
        // If the number is divisible by 2 or 3, it is not prime.
        if (n % 2l == 0l || n % 3l == 0l) {
            return false;
        }
        // Go from 5 to square root of n in increments of 6.
        // If any of these numbers are equal to n, it is not prime.
        // If the number is equal to 1, it is not prime.
        for (long i = 5l; i * i <= n; i += 6l) {
            if (n % i == 0l || n % (i + 2l) == 0l) {
                return false;
            }
        }
        // If the number is prime, it is greater than 3 and not divisible by 2 or 3.
        return true;
    }
    public static void main(String[] args) {
    assert(isPrime((6l)) == (false));
    assert(isPrime((101l)) == (true));
    assert(isPrime((11l)) == (true));
    assert(isPrime((13441l)) == (true));
    assert(isPrime((61l)) == (true));
    assert(isPrime((4l)) == (false));
    assert(isPrime((1l)) == (false));
    assert(isPrime((5l)) == (true));
    assert(isPrime((11l)) == (true));
    assert(isPrime((17l)) == (true));
    assert(isPrime((85l)) == (false));
    assert(isPrime((77l)) == (false));
    assert(isPrime((255379l)) == (false));
    }

}
