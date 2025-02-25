import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // The FibFib number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
    // fibfib(0) == 0
    // fibfib(1) == 0
    // fibfib(2) == 1
    // fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
    // Please write a function to efficiently compute the n-th element of the fibfib number sequence.
    // >>> fibfib((1l))
    // (0l)
    // >>> fibfib((5l))
    // (4l)
    // >>> fibfib((8l))
    // (24l)
    public static long fibfib(long n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n < 0)
            throw new IllegalArgumentException("n < 0");
        long[] memo = new long[1001];
        memo[0] = 0;
        memo[1] = 0;
        memo[2] = 1;
        long prev = 1, res = 1;
        for (long i = 3; i <= n; i++) {
            prev = res;
            res += memo[i - 1] + memo[i - 2] + memo[i - 3];
            memo[i] = res;
        }
        return res;
    }
    public static void main(String[] args) {
    assert(fibfib((2l)) == (1l));
    assert(fibfib((1l)) == (0l));
    assert(fibfib((5l)) == (4l));
    assert(fibfib((8l)) == (24l));
    assert(fibfib((10l)) == (81l));
    assert(fibfib((12l)) == (274l));
    assert(fibfib((14l)) == (927l));
    }

}
