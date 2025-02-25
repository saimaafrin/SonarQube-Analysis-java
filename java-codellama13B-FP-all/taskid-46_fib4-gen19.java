import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // The Fib4 number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
    // fib4(0) -> 0
    // fib4(1) -> 0
    // fib4(2) -> 2
    // fib4(3) -> 0
    // fib4(n) -> fib4(n-1) + fib4(n-2) + fib4(n-3) + fib4(n-4).
    // Please write a function to efficiently compute the n-th element of the fib4 number sequence.  Do not use recursion.
    // >>> fib4((5l))
    // (4l)
    // >>> fib4((6l))
    // (8l)
    // >>> fib4((7l))
    // (14l)
    public static long fib4(long n) {

        long[] fib = new long[4];
        fib[0] = 0;
        fib[1] = 0;
        fib[2] = 2;
        fib[3] = 0;
        int[] pos = new int[1];
        pos[0] = 2;
        for (int i = 4; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                long tmp = fib[pos[0]];
                fib[pos[0]] = fib[pos[0]-1] + fib[pos[0]-2] + fib[pos[0]-3] + fib[pos[0]-4];
                fib[pos[0]-1] = fib[pos[0]-2];
                fib[pos[0]-2] = fib[pos[0]-3];
                fib[pos[0]-3] = fib[pos[0]-4];
                fib[pos[0]-4] = tmp;
                pos[0]++;
                if (pos[0] == 4)
                    pos[0] = 0;
            }
        }
        return fib[pos[0]];
    }
    public static void main(String[] args) {
    assert(fib4((5l)) == (4l));
    assert(fib4((8l)) == (28l));
    assert(fib4((10l)) == (104l));
    assert(fib4((12l)) == (386l));
    }

}
