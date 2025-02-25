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

        final HashSet<Long> primes = new HashSet<>();
        final HashSet<Long> fibs = new HashSet<>();
        long a = 0;
        long b = 1;
        fibs.add(a);
        fibs.add(b);
        primes.add(2l);
        primes.add(3l);
        primes.add(5l);
        primes.add(7l);
        long index = 0;
        while(index<n) {
            long sum = a+b;
            fibs.add(sum);
            if(primes.contains(sum)) {
                primes.remove(sum);
                index+=1;
            }
            a = b;
            b = sum;
        }
        long result = fibs.toArray(new Long[0])[n-1];
        return result;
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
