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

        // There are 1000000000 possible numbers that are less than 10^9
        long[] arr = new long[1000000000];
        // 7 is the only digit that is divisible by 11 and 13
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 11 == 0 || arr[i] % 13 == 0) {
                arr[i] += 7;
            }
        }
        long counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                break;
            }
            if (arr[i] % 11 == 0 || arr[i] % 13 == 0) {
                counter++;
            }
        }
        return counter;
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
