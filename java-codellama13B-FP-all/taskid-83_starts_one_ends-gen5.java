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

        long pow_10 = (long)Math.pow(10, (double)n);
        long pow_10_minus_1 = (long)Math.pow(10, (double)n-1);
        long count = 0;
        for(long i = 1; i < pow_10; i *= 10) {
            count += pow_10_minus_1;
        }
        return count;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
