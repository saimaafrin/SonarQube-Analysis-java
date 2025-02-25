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

        // Use a hash map to store the previously calculated fibfib numbers, keyed by the index of the fibfib number
        Map<Long, Long> fibfibs = new HashMap<>();
        fibfibs.put(0l, 0l);
        fibfibs.put(1l, 0l);
        fibfibs.put(2l, 1l);
        // Using a for loop to generate the fibfib numbers
        for (long i = 3; i <= n; i++) {
            // The n-th fibfib number is the sum of the previous three numbers
            long fibfib = fibfibs.get(i - 1) + fibfibs.get(i - 2) + fibfibs.get(i - 3);
            fibfibs.put(i, fibfib);
        }
        return fibfibs.get(n);
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
