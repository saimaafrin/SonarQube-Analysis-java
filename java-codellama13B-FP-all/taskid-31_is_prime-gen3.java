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

        // Corner case: 1 is neither prime nor composite.
        // Corner case: 2 and 3 are prime, all other even numbers are not prime.
        // Corner case: If n is divisible by 2 or 3, then it is not prime.
        // Corner case: 61 is prime, all other even numbers are not prime.
        if (n <= 1l || n % 2l == 0l || n % 3l == 0l || n % 5l == 0l || n % 7l == 0l || n % 11l == 0l || n % 13l == 0l || n % 17l == 0l || n % 19l == 0l || n % 23l == 0l || n % 29l == 0l || n % 31l == 0l || n % 37l == 0l || n % 41l == 0l || n % 43l == 0l || n % 47l == 0l || n % 53l == 0l || n % 59l == 0l || n % 61l == 0l || n % 67l == 0l || n % 71l == 0l || n % 73l == 0l || n % 79l == 0l || n % 83l == 0l || n % 89l == 0l || n % 97l == 0l) {
            return false;
        }
        // Corner case: If n is a perfect square, then it is not prime.
        return !isPerfectSquare((long) Math.floor(Math.sqrt((double) n)));
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
