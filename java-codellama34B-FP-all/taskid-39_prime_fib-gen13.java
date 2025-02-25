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

        // fibGen generates infinite sequence of Fibonacci numbers.
        Iterable<Long> fibGen = new Iterable<Long>() {
            public Iterator<Long> iterator() {
                return new Iterator<Long>() {
                    long current = 1l;
                    long previous = 1l;
                    boolean firstTime = true;
                    public boolean hasNext() {
                        return true;
                    }
                    public Long next() {
                        if (firstTime) {
                            firstTime = false;
                            return current;
                        }
                        long next = current + previous;
                        previous = current;
                        current = next;
                        return next;
                    }
                };
            }
        };
        // primeFib takes a function that generates infinite sequence of Fibonacci numbers.
        return StreamSupport.stream(fibGen.spliterator(), false).filter(Problem::isPrime).skip(n - 1).findFirst().get();
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
