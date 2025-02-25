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

        // We start by figuring out how many numbers that start with 1
        // There are n-1 digit numbers that start with 1
        // Since we only want to consider the case where they end with 1, we only consider those
        // that do not start with 0
        // So there are n-2 digit numbers that start with 1 and end with 1
        // We can add to that all the numbers that are exactly n digits and end with 1
        // There are 10^(n-1) of those
        // All of those numbers that start with 1 and end with 1 are the ones that start with 1
        // So, how many are those?
        // The first digit can be anything but 0
        // The remaining digits are all 0
        // So, the total is (n-2) 10^(n-1)
        // If we want to count all the numbers that end with 1, we need to count the ones that start
        // with 0 and end with 1
        // All the numbers that end with 1 are the numbers that do not end with 0
        // That means that the last digit is not 0
        // So, the numbers that start with 0 and end with 1 are the numbers that start with 0 and
        // the last digit is not 0
        // The first digit is 0, but not the last one
        // For the last one, we have 10^(n-2) of those
        // So, we need to add to the count from the first one, the total of the last ones
        // The total for the last ones is 10^(n-2)
        // So, the total for this is (n-2) 10^(n-1) + 10^(n-2)
        // If we want to get the total for all the numbers that end with 1, we need to consider
        // the numbers that start with 1
        // We know that there are n-1 digit numbers that start with 1 and end with 1
        // We can add to that all the numbers that are exactly n digits and end with 1
        // There are 10^(n-1) of those
        // All of those numbers that start with 1 and end with 1 are the ones that end with 1
        // So, how many are those?
        // The last digit can be anything but 0
        // The remaining digits are all 0
        // So, the total is (n-1) 10^(n-1)
        // If we want to count all the numbers that start with 1, we need to count the ones that
        // start with 1 and do not end with 0
        // All the numbers that start with 1 are the numbers that start with 1 and the last digit
        // is not 0
        // So, the numbers that start with 1 and do not end with 0 are the numbers that start with
        // 1 and the last digit is not 0
        // The last digit is not 0, but not the first one
        // For the last one, we have 10^(n-2) of those
        // So, we need to add to the count from the first one, the total of the last ones
        // The total for the last ones is 10^(n-2)
        // So, the total for this is (n-1) 10^(n-1) + 10^(n-2)
        return (n - 2) * (long) Math.pow(10, n - 1) + (long) Math.pow(10, n - 2) + (n - 1) * (long) Math.pow(10, n - 1) + (long) Math.pow(10, n - 2);
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
