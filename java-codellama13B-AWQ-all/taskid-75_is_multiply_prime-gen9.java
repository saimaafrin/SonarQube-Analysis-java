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

        boolean b1 = false, b2 = false, b3 = false;
        long num = a;
        long d1 = 0, d2 = 0, d3 = 0;
        for (long i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                d1 = i;
                break;
            }
        }
        num /= d1;
        if(num == 1) {
            b1 = true;
        } else {
            for (long i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    d2 = i;
                    break;
                }
            }
            num /= d2;
            if(num == 1) {
                b2 = true;
            } else {
                for (long i = 2; i <= num/2; i++) {
                    if(num % i == 0) {
                        d3 = i;
                        break;
                    }
                }
                num /= d3;
                if(num == 1) {
                    b3 = true;
                }
            }
        }
        return b1 && b2 && b3;
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
