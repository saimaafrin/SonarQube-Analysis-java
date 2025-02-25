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

        if (n <= 3) {
            if (n == 0) return 0;
            if (n == 1) return 0;
            if (n == 2) return 2;
            if (n == 3) return 0;
        }
        long[] fib = new long[5];
        fib[0] = 0;
        fib[1] = 0;
        fib[2] = 2;
        fib[3] = 0;
        fib[4] = 1;
        long first = 1;
        long second = 1;
        long third = 2;
        long fourth = 0;
        long fifth = 1;
        long fifthS = 0;
        long fifthB = 1;
        long sixth = 1;
        long sixthS = 0;
        long sixthB = 1;
        long temp;
        for (long i = 4; i < n; i++) {
            temp = first;
            first = second;
            second = third;
            third = fourth;
            fourth = fifth;
            fifth = fifthS + fifthB;
            fifthS = temp;
            fifthB = second;
            temp = sixth;
            sixth = sixthS + sixthB;
            sixthS = temp;
            sixthB = fifth;
        }
        return fifthS + fifthB;
    }
    public static void main(String[] args) {
    assert(fib4((5l)) == (4l));
    assert(fib4((8l)) == (28l));
    assert(fib4((10l)) == (104l));
    assert(fib4((12l)) == (386l));
    }

}
