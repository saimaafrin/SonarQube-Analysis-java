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

        BigInteger fib = BigInteger.ZERO;
        BigInteger fib1 = BigInteger.ZERO;
        BigInteger fib2 = BigInteger.ZERO;
        if (n > 0) {
            fib2 = BigInteger.valueOf(1);
        } else {
            fib2 = BigInteger.valueOf(0);
        }
        if (n > 1) {
            fib1 = BigInteger.valueOf(1);
        } else {
            fib1 = BigInteger.valueOf(0);
        }
        if (n > 2) {
            fib = BigInteger.valueOf(2);
        } else {
            fib = BigInteger.valueOf(0);
        }
        for (long i = 3; i <= n; i++) {
            fib = fib1.add(fib2);
            fib1 = fib2;
            fib2 = fib;
            for (long j = 2; j <= i; j++) {
                if (fib.mod(BigInteger.valueOf(j)).compareTo(BigInteger.valueOf(0)) == 0 && fib.compareTo(BigInteger.valueOf(1)) > 0) {
                    fib = fib.subtract(BigInteger.valueOf(1));
                }
            }
        }
        return fib.longValue();
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
