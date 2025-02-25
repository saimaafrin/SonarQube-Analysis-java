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

        long mid = (x + y) / 2l;
        if (mid % 2l == 0l) {
            if (mid >= x && mid <= y) {
                return mid;
            } else if (mid < x) {
                return chooseNum(mid + 2l, y);
            } else if (mid > y) {
                return chooseNum(x, mid - 2l);
            }
        }
        return -1l;
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
