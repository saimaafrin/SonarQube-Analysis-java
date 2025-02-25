import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

        // 10^n-1 numbers
        // 10^n numbers
        // 10^(n-1) numbers of length n-1 ending in 1
        // 10^n - (10^(n-1)) = 9*10^(n-1) numbers of length n starting in 1
        // 10^(n-1) numbers of length n-1 starting in 1
        return 9 * (long) Math.pow(10, (n - 1)) + (long) Math.pow(10, n) + (long) Math.pow(10, n - 1);
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
