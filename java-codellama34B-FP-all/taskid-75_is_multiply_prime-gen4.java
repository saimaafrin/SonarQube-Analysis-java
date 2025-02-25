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

        ArrayList<Long> primeFactor = new ArrayList<>();
        primeFactor.add(2l);
        primeFactor.add(3l);
        primeFactor.add(5l);
        boolean isPrimeFactor = true;
        for (int i = 0; i < primeFactor.size(); i++) {
            if (a % primeFactor.get(i) == 0) {
                int n = 0;
                while (a % primeFactor.get(i) == 0) {
                    n++;
                    a /= primeFactor.get(i);
                }
                if (n > 1) {
                    isPrimeFactor = false;
                    break;
                }
            }
        }
        if (a > 1) {
            isPrimeFactor = false;
        }
        return isPrimeFactor;
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
