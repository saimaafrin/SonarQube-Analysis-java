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

        long a = 1, b = 1, c = 2, d = 3, e = 89, f = 208l;
        long max_val = 1e16;
        long ans = 0;
        long cnt = 0;
        while (cnt < n) {
            if (e > max_val) {
                break;
            }
            if (BigInteger.valueOf(e).isProbablePrime(1)) {
                ans = e;
                cnt += 1;
            }
            if (cnt == n) {
                break;
            }
            c = b + c;
            d = a + d;
            e = c + d;
            f = a + e;
            a = b;
            b = c;
        }
        return ans;
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
