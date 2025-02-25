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

        // use a hash table to store values of the sequence so that the computation is done in O(1) instead of O(2^n).
        // the hash table stores the values of the sequence fib4(0) through fib4(n) and returns the value of fib4(n) if it's already computed.
        // otherwise it computes fib4(n) and stores it in the table before returning it.
        long[] hash = new long[4];
        if(n <= 3) {
            return hash[3] = 1;
        } else if(hash[3] != 0) {
            return hash[3];
        }
        for(int i = 0; i <= n; i++) {
            long sum = 0;
            for(int j = 0; j < 4; j++) {
                sum += hash[j];
                hash[j] = hash[j+1];
            }
            hash[3] = sum;
        }
        return hash[3];
    }
    public static void main(String[] args) {
    assert(fib4((5l)) == (4l));
    assert(fib4((8l)) == (28l));
    assert(fib4((10l)) == (104l));
    assert(fib4((12l)) == (386l));
    }

}
