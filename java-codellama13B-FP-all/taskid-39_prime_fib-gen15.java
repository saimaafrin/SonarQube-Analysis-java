import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // prime_fib returns n-th number that is a Fibonacci number and it's also prime.
    // >>> primeFib((1l))
    // (2l)
    // >>> primeFib((2l))
    // (3l)
    // >>> primeFib((3l))
    // (5l)
    // >>> primeFib((4l))
    // (13l)
    // >>> primeFib((5l))
    // (89l)
    public static long primeFib(long n) {

        // Fibonacci sequence, starting with 0,1.
        long[] fib = {0, 1};
        // Prime numbers, 0 means not yet checked.
        long[] primes = {2, 0};
        // Index in primes[] array for next prime number.
        int pidx = 1;
        // Index in fib[] sequence for next Fibonacci number.
        int fidx = 2;
        // Iterate until primes[pidx] is a prime Fibonacci number.
        while (primes[pidx] == 0) {
            // Calculate next number in Fibonacci sequence.
            fib[fidx] = fib[fidx - 1] + fib[fidx - 2];
            // Mark it as prime if it is.
            primes[pidx] = fib[fidx] % 2 == 0 ? 0 : 1;
            // Move to next position in arrays.
            pidx++;
            fidx++;
        }
        // Return first n prime Fibonacci numbers.
        return fib[pidx - 1];
    }
    public static void main(String[] args) {
    assert(primeFib((1l)) == (2l));
    assert(primeFib((2l)) == (3l));
    assert(primeFib((3l)) == (5l));
    assert(primeFib((4l)) == (13l));
    assert(primeFib((5l)) == (89l));
    assert(primeFib((6l)) == (233l));
    assert(primeFib((7l)) == (1597l));
    assert(primeFib((8l)) == (28657l));
    assert(primeFib((9l)) == (514229l));
    assert(primeFib((10l)) == (433494437l));
    }

}
