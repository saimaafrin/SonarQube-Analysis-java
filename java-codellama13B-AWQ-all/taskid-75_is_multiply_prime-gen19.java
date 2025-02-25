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

        long p1 = 0, p2 = 0, p3 = 0;
        for(long i = 1; i <= a/2; i++) {
            if(a % i == 0) {
                if(a / i < 100) {
                    p1 = i;
                    p2 = a / i;
                    break;
                }
            }
        }
        for(long i = 1; i <= p1/2; i++) {
            if(p1 % i == 0) {
                if(p1 / i < 100) {
                    p2 = i;
                    p3 = p1 / i;
                    break;
                }
            }
        }
        for(long i = 1; i <= p2/2; i++) {
            if(p2 % i == 0) {
                if(p2 / i < 100) {
                    p2 = i;
                    p3 = p2 / i;
                    break;
                }
            }
        }
        return p1 * p2 * p3 == a;
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
