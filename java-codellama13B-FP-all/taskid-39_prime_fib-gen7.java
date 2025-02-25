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

        int p;
        long f;
        BigInteger x;
        x = BigInteger.valueOf(1);
        f = 0l;
        p = 1;
        while (true) {
            p = 2;
            while (p <= Math.sqrt(f)) {
                p = p + 1;
                if (f % p == 0l) {
                    x = BigInteger.valueOf(f);
                    break;
                }
            }
            if (p > Math.sqrt(f)) {
                x = BigInteger.valueOf(f);
            }
            f = f + 1l;
            if (x.isProbablePrime(1000)) {
                n = n - 1l;
                if (n == 0l) {
                    break;
                }
            }
        }
        return f;
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
