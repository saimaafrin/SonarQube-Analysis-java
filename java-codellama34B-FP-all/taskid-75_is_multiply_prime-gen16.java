import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the given number is the multiplication of 3 prime numbers
    // and false otherwise.
    // Knowing that (a) is less then 100. 
    // Example:
    // >>> isMultiplyPrime((30l))
    // (true)
    // 30 = 2 * 3 * 5
    public static boolean isMultiplyPrime(long a) {

        List<Long> primeList = Arrays.asList(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L);
        // The product of three prime numbers cannot be greater than 37^3 = 47729.
        long[] divisors = IntStream.range(0, primeList.size()).mapToLong(l -> primeList.get(l)).filter(l -> (a % l) == 0).sorted().toArray();
        if (divisors.length != 3) {
            return false;
        }
        if (divisors[2] == 29 && (divisors[0] == 3 || divisors[1] == 3)) {
            return true;
        }
        if (divisors[2] == 31 && (divisors[0] == 5 || divisors[1] == 5)) {
            return true;
        }
        if (divisors[2] == 43 && (divisors[0] == 7 || divisors[1] == 7)) {
            return true;
        }
        if (divisors[2] == 97 && (divisors[0] == 11 || divisors[1] == 11)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    assert(isMultiplyPrime((5l)) == (false));
    assert(isMultiplyPrime((30l)) == (true));
    assert(isMultiplyPrime((8l)) == (true));
    assert(isMultiplyPrime((10l)) == (false));
    assert(isMultiplyPrime((125l)) == (true));
    assert(isMultiplyPrime((105l)) == (true));
    assert(isMultiplyPrime((126l)) == (false));
    assert(isMultiplyPrime((729l)) == (false));
    assert(isMultiplyPrime((891l)) == (false));
    assert(isMultiplyPrime((1001l)) == (true));
    }

}
