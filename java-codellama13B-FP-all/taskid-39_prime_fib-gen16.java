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

        long pf = (long)0;
        if (n == (long)0) {
            pf = (long)0;
        } else if (n == (long)1) {
            pf = (long)2;
        } else if (n == (long)2) {
            pf = (long)3;
        } else {
            long a = (long)2;
            long b = (long)3;
            long c = (long)0;
            long i = (long)0;
            long d = (long)1;
            boolean f = false;
            while (true) {
                c = a + b;
                d = d + (long)1;
                if (d == n) {
                    pf = c;
                    break;
                }
                f = isPrime(c);
                if (f) {
                    break;
                }
                a = b;
                b = c;
                i = i + (long)1;
            }
        }
        return pf;
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
