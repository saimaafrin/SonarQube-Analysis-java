import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
    // >>> fizzBuzz((50l))
    // (0l)
    // >>> fizzBuzz((78l))
    // (2l)
    // >>> fizzBuzz((79l))
    // (3l)
    public static long fizzBuzz(long n) {

        long result = 0;
        long start = 11;
        long end = n - 1;
        long divisible_by_11 = 0;
        long divisible_by_13 = 0;
        long[] multiples_of_11 = new long[0];
        long[] multiples_of_13 = new long[0];
        long[] arr = new long[1000];
        long i;
        long temp;
        if (n < 10) {
            for (i = 0; i < n; i++)
                arr[i] = 1;
        } else {
            for (i = 0; i < n; i++) {
                temp = i;
                do {
                    if (temp % 10 == 7) {
                        arr[i] = 1;
                        break;
                    }
                    temp = temp / 10;
                } while (temp > 0);
            }
        }
        for (i = start; i < end; i++) {
            if (i % 11 == 0)
                divisible_by_11++;
            if (i % 13 == 0)
                divisible_by_13++;
        }
        multiples_of_11 = new long[divisible_by_11];
        multiples_of_13 = new long[divisible_by_13];
        i = 0;
        long j;
        long k;
        for (i = start; i < end; i++) {
            if (i % 11 == 0) {
                multiples_of_11[i] = 1;
            }
            if (i % 13 == 0) {
                multiples_of_13[i] = 1;
            }
        }
        for (i = 0; i < divisible_by_11; i++) {
            for (j = 0; j < divisible_by_13; j++) {
                if (multiples_of_11[i] == 1 && multiples_of_13[j] == 1) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(fizzBuzz((50l)) == (0l));
    assert(fizzBuzz((78l)) == (2l));
    assert(fizzBuzz((79l)) == (3l));
    assert(fizzBuzz((100l)) == (3l));
    assert(fizzBuzz((200l)) == (6l));
    assert(fizzBuzz((4000l)) == (192l));
    assert(fizzBuzz((10000l)) == (639l));
    assert(fizzBuzz((100000l)) == (8026l));
    }

}
