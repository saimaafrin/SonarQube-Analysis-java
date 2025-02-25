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

        final Map<Long, Pair<Long, Long>> cache = new HashMap<Long, Pair<Long, Long>>();
        long fib = 0;
        long fibPrev = 1;
        long fibPrevPrev = 0;
        long i = 1;
        while (i <= n) {
            fib = fibPrev + fibPrevPrev;
            if (isPrime(fib) == true) {
                i += 1;
            }
            if (i == 1) {
                cache.put((i), new Pair<Long, Long>((fib), (fibPrev)));
            }
            if (i >= 2) {
                cache.put((i), new Pair<Long, Long>((fib), (fibPrev)));
                cache.put((i - 1), new Pair<Long, Long>((fibPrev), (fibPrevPrev)));
            }
            fibPrevPrev = fibPrev;
            fibPrev = fib;
        }
        return cache.get((n)).getValue0();
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
