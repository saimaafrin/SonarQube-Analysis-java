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

        // Base case
        if(a == 1) return false;
        if(a == 2) return true;
        if(a == 3) return true;
        if(a == 5) return true;
        if(a == 7) return true;
        if(a == 11) return true;
        if(a == 13) return true;
        if(a == 17) return true;
        if(a == 19) return true;
        if(a == 23) return true;
        if(a == 29) return true;

        long b = 1l;
        long c = 1l;
        for(long i = 2l; i <= Math.sqrt(a); i++){
            for(long j = 2l; j <= Math.sqrt(a); j++){
                if(i * j == a){
                    b = i;
                    c = j;
                    break;
                }
            }
            if(b * c == a) break;
        }

        if(b * c == a){
            return isMultiplyPrime(b) && isMultiplyPrime(c) && b != c;
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
