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

        // We will iterate through numbers less than n and count how many are divisible by 11 and 13
        // We will also count how many times the digit 7 appears.
        long count = 0l;
        long seven = 0l;
        long eleven = 0l;
        long thirteen = 0l;
        for (long i = 0l; i < n; i++) {
            // We can use the fact that if a number is divisible by 11 or 13 it will be divisible by 11 * 13 = 143
            if (i % 143l == 0l) {
                count++;
            }
            // We can also count the number of times the digit 7 appears
            while (i % 10l == 7l) {
                seven++;
                i /= 10l;
            }
        }
        return seven;
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
