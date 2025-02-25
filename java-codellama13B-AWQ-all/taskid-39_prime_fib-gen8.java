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

        // Generate Fibonacci numbers.
        LongStream fib = LongStream.iterate(0, x -> x + 1).map(x -> (long) Math.pow(x, 2) + 5 * x + 2);
        // Generate primes.
        int primeLimit = (int) Math.sqrt(fib.limit().getAsLong());
        BooleanStream prime = LongStream.range(2, primeLimit).boxed().map(x -> {
            boolean isPrime = true;
            for (int y = 2; y < (x + 1) / 2; y++) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        });
        // Find first n primeFib.
        LongStream primeFib = fib.filter(x -> prime.limit(x).sum() == n);
        return primeFib.findFirst().getAsLong();
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
