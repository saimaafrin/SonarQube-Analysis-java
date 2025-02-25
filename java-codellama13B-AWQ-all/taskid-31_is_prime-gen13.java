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

        boolean isPrime = false;
        // (If n is less than 2, then it is not prime)
        if (n < 2) {
            isPrime = false;
        } else {
            // (Otherwise, if n is divisible by 2 except for itself and 1, it is not prime)
            if (n % 2 == 0 && n != 2) {
                isPrime = false;
            } else {
                // (Otherwise, if n has a remainder of 0 when divided by i, where i ranges from 3 to the square root of n, then n is not prime)
                for (int i = 3; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
            }
        }
        return isPrime;
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
