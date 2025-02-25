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

        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1");
        }
        long a = 0, b = 1, c = 1;
        while (true) {
            long d = a + b;
            if (BigInteger.valueOf(d).isProbablePrime(10) && (n == 1)) {
                break;
            }
            if (BigInteger.valueOf(d).isProbablePrime(10) && (n == 2)) {
                break;
            }
            if (BigInteger.valueOf(d).isProbablePrime(10) && (n == 3)) {
                break;
            }
            a = b;
            b = c;
            c = d;
            n -= 1;
        }
        return c;
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
