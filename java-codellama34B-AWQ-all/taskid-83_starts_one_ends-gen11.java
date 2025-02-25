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

        // the number of n-digit numbers which starts with 1
        long numStartsOne = 10;
        // the number of n-digit numbers which ends with 1
        long numEndsOne = 10;
        if (n <= 1) {
            return 2;
        }
        for (long i = 1; i < n; i++) {
            numStartsOne = numStartsOne + 9 * (long) Math.pow(10, i) * 10;
            numEndsOne = numEndsOne + 9 * (long) Math.pow(10, i - 1);
        }
        return numStartsOne + numEndsOne;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
