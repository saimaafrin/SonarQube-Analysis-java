import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // prime_fib returns n-th number that is a Fibonacci number and it's also prime.
    // >>> primeFib((1l))
    // (2l)
    // >>> primeFib((2l))
    // (3l)
    // >>> primeFib((3l))
    // (5l)
    // >>> primeFib((4l))
    // (13l)
    // >>> primeFib((5l))
    // (89l)
    public static long primeFib(long n) {

        long fib_num = 0;
        long prime_num = 0;
        long i = 1;
        long j = 2;
        long fib_i_minus_2 = 1;
        long fib_i_minus_1 = 2;
        long fib_i = 3;
        long prime_i_minus_2 = 2;
        long prime_i_minus_1 = 3;
        long prime_i = 5;
        long count = 3;
        while(count < n){
            fib_num = fib_i_minus_1 + fib_i_minus_2;
            prime_num = prime_i_minus_1 + prime_i_minus_2;
            if(isPrime(prime_num)){
                count++;
                if(count == n){
                    return prime_num;
                }
            }
            fib_i_minus_2 = fib_i_minus_1;
            fib_i_minus_1 = fib_i;
            fib_i = fib_num;
            prime_i_minus_2 = prime_i_minus_1;
            prime_i_minus_1 = prime_num;
            prime_i = prime_num;
        }
        return -1;
    }
    public static void main(String[] args) {
    assert(primeFib((1l)) == (2l));
    assert(primeFib((2l)) == (3l));
    assert(primeFib((3l)) == (5l));
    assert(primeFib((4l)) == (13l));
    assert(primeFib((5l)) == (89l));
    assert(primeFib((6l)) == (233l));
    assert(primeFib((7l)) == (1597l));
    assert(primeFib((8l)) == (28657l));
    assert(primeFib((9l)) == (514229l));
    assert(primeFib((10l)) == (433494437l));
    }

}
