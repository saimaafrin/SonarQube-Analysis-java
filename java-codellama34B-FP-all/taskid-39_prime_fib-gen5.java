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

        List<Long> fib_seq = new ArrayList<Long>();
        fib_seq.add(0l);
        fib_seq.add(1l);
        long f_0, f_1, f_n = 0;
        f_0 = 0;
        f_1 = 1;
        for (long i = 2; i < n + 1; i++) {
            f_n = f_0 + f_1;
            fib_seq.add(f_n);
            f_0 = f_1;
            f_1 = f_n;
        }
        long count = 0;
        for (long i : fib_seq) {
            if (BigInteger.valueOf(i).isProbablePrime((int) (100))) {
                count += 1;
            }
            if (count == n) {
                return i;
            }
        }
        return 0;
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
