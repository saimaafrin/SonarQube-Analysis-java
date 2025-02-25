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

        // We will use the prime factor decomposition of a to determine if it is the product of three primes
        // We can use the java library to do this
        // https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
        // https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime(int)
        // https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime(int)
        // we can factor a to get its prime factors
        // then we can check to see if it is the product of 3 primes
        BigInteger bigA = new BigInteger(Long.toString(a));
        // we can get a list of factors
        BigInteger[] factors = bigA.factor().toArray(new BigInteger[0]);
        // if we are only factors, then we must be a prime
        // also, the number must be less then 100 to be prime
        if(factors.length != 3) return false;
        return factors[0].isProbablePrime(100) &&
               factors[1].isProbablePrime(100) &&
               factors[2].isProbablePrime(100);
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
