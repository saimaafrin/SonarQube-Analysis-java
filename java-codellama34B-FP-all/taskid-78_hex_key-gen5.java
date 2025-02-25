import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You have been tasked to write a function that receives 
    // a hexadecimal number as a string and counts the number of hexadecimal 
    // digits that are primes (prime number, or a prime, is a natural number 
    // greater than 1 that is not a product of two smaller natural numbers).
    // Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
    // Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
    // So you have to determine a number of the following digits: 2, 3, 5, 7, 
    // B (=decimal 11), D (=decimal 13).
    // Note: you may assume the input is always correct or empty string, 
    // and symbols A,B,C,D,E,F are always uppercase.
    // Examples:
    // >>> hexKey(("AB"))
    // (1l)
    // >>> hexKey(("1077E"))
    // (2l)
    // >>> hexKey(("ABED1A33"))
    // (4l)
    // >>> hexKey(("123456789ABCDEF0"))
    // (6l)
    // >>> hexKey(("2020"))
    // (2l)
    public static long hexKey(String num) {

        final int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251 };
        // List<Integer> primes = new ArrayList<>();
        // primes.add(2);
        // primes.add(3);
        // primes.add(5);
        // primes.add(7);
        // primes.add(11);
        // primes.add(13);
        // primes.add(17);
        // primes.add(19);
        // primes.add(23);
        // primes.add(29);
        // primes.add(31);
        // primes.add(37);
        // primes.add(41);
        // primes.add(43);
        // primes.add(47);
        // primes.add(53);
        // primes.add(59);
        // primes.add(61);
        // primes.add(67);
        // primes.add(71);
        // primes.add(73);
        // primes.add(79);
        // primes.add(83);
        // primes.add(89);
        // primes.add(97);
        // primes.add(101);
        // primes.add(103);
        // primes.add(107);
        // primes.add(109);
        // primes.add(113);
        // primes.add
    }
    public static void main(String[] args) {
    assert(hexKey(("AB")) == (1l));
    assert(hexKey(("1077E")) == (2l));
    assert(hexKey(("ABED1A33")) == (4l));
    assert(hexKey(("2020")) == (2l));
    assert(hexKey(("123456789ABCDEF0")) == (6l));
    assert(hexKey(("112233445566778899AABBCCDDEEFF00")) == (12l));
    }

}
