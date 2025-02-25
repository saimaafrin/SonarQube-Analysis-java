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

        if (n % 2 == 0) {
            return 2;
        }
        else if (n % 3 == 0) {
            return 3;
        }
        else if (n % 5 == 0) {
            return 5;
        }
        else if (n % 7 == 0) {
            return 7;
        }
        else if (n % 11 == 0) {
            return 11;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
    assert(largestDivisor((3l)) == (1l));
    assert(largestDivisor((7l)) == (1l));
    assert(largestDivisor((10l)) == (5l));
    assert(largestDivisor((100l)) == (50l));
    assert(largestDivisor((49l)) == (7l));
    }

}
