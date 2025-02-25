import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return n-th Fibonacci number.
    // >>> fib((10l))
    // (55l)
    // >>> fib((1l))
    // (1l)
    // >>> fib((8l))
    // (21l)
    public static long fib(long n) {

        if (n <= 1) return n;
        long n_1 = 0, n_2 = 1, res = 0;
        for (long i = 1; i < n; i++) {
            res = n_1 + n_2;
            n_1 = n_2;
            n_2 = res;
        }
        return res;
    }
    public static void main(String[] args) {
    assert(fib((10l)) == (55l));
    assert(fib((1l)) == (1l));
    assert(fib((8l)) == (21l));
    assert(fib((11l)) == (89l));
    assert(fib((12l)) == (144l));
    }

}
