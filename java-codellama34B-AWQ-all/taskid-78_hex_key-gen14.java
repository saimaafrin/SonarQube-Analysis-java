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

        ArrayList<Integer> primes = new ArrayList<Integer>();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            primes.add(0);
        }
        for (int i = 0; i < num.length(); i++) {
            char currentChar = num.charAt(i);
            if (Character.isDigit(currentChar)) {
                nums.add(Character.getNumericValue(currentChar));
            } else {
                switch (currentChar) {
                    case 'A':
                        nums.add(10);
                        break;
                    case 'B':
                        nums.add(11);
                        break;
                    case 'C':
                        nums.add(12);
                        break;
                    case 'D':
                        nums.add(13);
                        break;
                    case 'E':
                        nums.add(14);
                        break;
                    case 'F':
                        nums.add(15);
                        break;
                }
            }
        }
        primes.set(2, 1);
        primes.set(3, 1);
        primes.set(5, 1);
        primes.set(7, 1);
        primes.set(11, 1);
        primes.set(13, 1);
        primes.set(17, 1);
        long count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (primes.get(nums.get(i)) == 1) {
                count += 1;
            }
        }
        return count;
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
