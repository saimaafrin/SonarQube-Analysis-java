import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes two positive numbers x and y and returns the
    // biggest even integer number that is in the range [x, y] inclusive. If 
    // there's no such number, then the function should return -1.
    // For example:
    // >>> chooseNum((12l), (15l))
    // (14l)
    // >>> chooseNum((13l), (12l))
    // (-1l)
    public static long chooseNum(long x, long y) {

        long max = Math.max(x, y);
        long min = Math.min(x, y);
        ArrayList<Long> numbers = new ArrayList<Long>();
        for (long i = max; i >= min; i--) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        if (numbers.isEmpty()) {
            return -1;
        } else {
            return numbers.get(0);
        }
    }
    public static void main(String[] args) {
    assert(chooseNum((12l), (15l)) == (14l));
    assert(chooseNum((13l), (12l)) == (-1l));
    assert(chooseNum((33l), (12354l)) == (12354l));
    assert(chooseNum((5234l), (5233l)) == (-1l));
    assert(chooseNum((6l), (29l)) == (28l));
    assert(chooseNum((27l), (10l)) == (-1l));
    assert(chooseNum((7l), (7l)) == (-1l));
    assert(chooseNum((546l), (546l)) == (546l));
    }

}
