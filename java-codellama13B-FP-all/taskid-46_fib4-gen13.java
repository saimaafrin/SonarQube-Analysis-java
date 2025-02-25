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
            return n;
        } else {
            long fib3 = 0, fib2 = 0, fib1 = 2, fib0 = 0;
            long i = 3;
            while (i <= n) {
                long temp = fib0 + fib1 + fib2 + fib3;
                fib0 = fib1;
                fib1 = fib2;
                fib2 = fib3;
                fib3 = temp;
                i = i + 1;
            }
            return fib3;
        }
    }
    public static void main(String[] args) {
    assert(fib4((5l)) == (4l));
    assert(fib4((8l)) == (28l));
    assert(fib4((10l)) == (104l));
    assert(fib4((12l)) == (386l));
    }

}
