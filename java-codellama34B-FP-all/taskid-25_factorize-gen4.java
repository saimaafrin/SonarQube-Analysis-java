import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of prime factors of given integer in the order from smallest to largest.
    // Each of the factors should be array listed number of times corresponding to how many times it appeares in factorization.
    // Input number should be equal to the product of all factors
    // >>> factorize((8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))
    // >>> factorize((25l))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l)))
    // >>> factorize((70l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)7l)))
    public static ArrayList<Long> factorize(long n) {

        ArrayList<Long> factors = new ArrayList<Long>();
        while (n % 2 == 0) {
            factors.add(2l);
            n /= 2;
        }
        while (n % 3 == 0) {
            factors.add(3l);
            n /= 3;
        }
        while (n % 5 == 0) {
            factors.add(5l);
            n /= 5;
        }
        while (n % 7 == 0) {
            factors.add(7l);
            n /= 7;
        }
        while (n % 11 == 0) {
            factors.add(11l);
            n /= 11;
        }
        while (n % 13 == 0) {
            factors.add(13l);
            n /= 13;
        }
        while (n % 17 == 0) {
            factors.add(17l);
            n /= 17;
        }
        while (n % 19 == 0) {
            factors.add(19l);
            n /= 19;
        }
        while (n % 23 == 0) {
            factors.add(23l);
            n /= 23;
        }
        while (n % 29 == 0) {
            factors.add(29l);
            n /= 29;
        }
        while (n % 31 == 0) {
            factors.add(31l);
            n /= 31;
        }
        while (n % 37 == 0) {
            factors.add(37l);
            n /= 37;
        }
        while (n % 41 == 0) {
            factors.add(41l);
            n /= 41;
        }
        while (n % 43 == 0) {
            factors.add(43l);
            n /= 43;
        }
        while (n % 47 == 0) {
            factors.add(47l);
            n /= 47;
        }
        while (n % 53 == 0) {
            factors.add(53l);
            n /= 53;
        }
        while (n % 59 == 0) {
            factors.add(59l);
            n /= 59;
        }
        while (n % 61 == 0) {
            factors.add(61l);
            n /= 61;
        }
        while (n % 67 == 0) {
            factors.add(67l);
            n /= 67;
        }
        while (n % 71 == 0) {
            factors.add(71l);
            n /= 71;
        }
        while (n % 73 == 0) {
            factors.add(73l);
            n /= 73;
        }
        while (n % 79 == 0) {
            factors.
    }
    public static void main(String[] args) {
    assert(factorize((2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l)))));
    assert(factorize((4l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l)))));
    assert(factorize((8l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))));
    assert(factorize((57l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)19l)))));
    assert(factorize((3249l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)19l, (long)19l)))));
    assert(factorize((185193l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)3l, (long)19l, (long)19l, (long)19l)))));
    assert(factorize((20577l)).equals((new ArrayList<Long>(Arrays.asList((long)3l, (long)19l, (long)19l, (long)19l)))));
    assert(factorize((18l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)3l)))));
    }

}
