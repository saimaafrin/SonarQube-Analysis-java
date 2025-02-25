import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the largest prime factor of n. Assume n > 1 and is not a prime.
    // >>> largestPrimeFactor((13195l))
    // (29l)
    // >>> largestPrimeFactor((2048l))
    // (2l)
    public static long largestPrimeFactor(long n) {

        // return max( [i for i in range(1,int(n**0.5)) if n % i == 0], key=lambda x: isPrime(x) )
        for(long i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                long div = n/i;
                if(div<i) {
                    return i;
                } else if(isPrime(div)) {
                    return div;
                }
                if(isPrime(i)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    assert(largestPrimeFactor((15l)) == (5l));
    assert(largestPrimeFactor((27l)) == (3l));
    assert(largestPrimeFactor((63l)) == (7l));
    assert(largestPrimeFactor((330l)) == (11l));
    assert(largestPrimeFactor((13195l)) == (29l));
    }

}
