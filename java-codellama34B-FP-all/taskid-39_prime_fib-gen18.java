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

        ArrayList<Long> fibs = new ArrayList<Long>();
        fibs.add(0l);
        fibs.add(1l);
        int i = 1;
        while (i < n) {
            fibs.add(fibs.get(i) + fibs.get(i - 1));
            i++;
        }
        long fib = fibs.get((int) n - 1);
        boolean prime = true;
        if (fib == 1) {
            prime = false;
        } else {
            for (long j = 2; j <= (long) Math.sqrt(fib); j++) {
                if (fib % j == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            return fib;
        } else {
            return primeFib(n + 1);
        }
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
