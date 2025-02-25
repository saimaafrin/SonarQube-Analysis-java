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

        // Generated code
        // Begin solution
        long result = 0;
        long i = 11;
        long j = 13;
        while (i < n) {
            if (i % 11 == 0 || i % 13 == 0) {
                if (Long.toString(i).contains("7")) {
                    result = result + 1;
                }
            }
            i = i + 1;
        }
        while (j < n) {
            if (j % 11 == 0 || j % 13 == 0) {
                if (Long.toString(j).contains("7")) {
                    result = result + 1;
                }
            }
            j = j + 1;
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
