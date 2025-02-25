import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given number n, find the largest number that divides n evenly, smaller than n
    // >>> largestDivisor((15l))
    // (5l)
    public static long largestDivisor(long n) {

        // This code is a bit tricky, so please read it carefully.
        // We want to find the largest number that divides n evenly,
        // and is smaller than n. That is, we want to find the largest
        // divisor of n that is less than n.
        //
        // We do this by starting with n-1 and trying to divide it by
        // n. If it is a divisor, we can return n-1. If not, we divide
        // n-2 by n, and so on, until we find the largest number that
        // divides n evenly.
        long x = n-1;
        while (!(x==0)) {
            if ((x==0)||(n%x==0)) {
                // If x is 0, then it is not a divisor of n, and
                // we should return the largest number that
                // is smaller than n. If x is not 0, and it is a
                // divisor of n, then return x.
                return x;
            }
            x = x-1;
        }
        // If we reach this point, it means that we have tried all
        // numbers from 1 to n-1, and no divisor was found. In this
        // case, we should return 1, since it is the largest number
        // that divides n evenly.
        return 1;
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
