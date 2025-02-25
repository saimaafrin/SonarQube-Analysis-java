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

        long count = 0;
        // Number of digits of n
        long d = (long)Math.log10(n) + 1;
        // The first and last digit are 1
        count += Math.pow(9, d-2) * 2;
        // The first and last digit are 1, the other digits are 0
        count += Math.pow(9, d-3) * 2;
        // The first and last digit are 1, the other digits are 2 to 9
        count += Math.pow(9, d-3) * 8;
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
