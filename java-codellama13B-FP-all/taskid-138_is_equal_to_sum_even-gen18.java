import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    // Example
    // >>> isEqualToSumEven((4l))
    // (false)
    // >>> isEqualToSumEven((6l))
    // (false)
    // >>> isEqualToSumEven((8l))
    // (true)
    public static boolean isEqualToSumEven(long n) {

        long n1 = 1l;
        long n2 = 2l;
        long n3 = 3l;
        long n4 = 4l;
        long n5 = 5l;
        long n6 = 6l;
        long n7 = 7l;
        long n8 = 8l;
        long n9 = 9l;
        long n10 = 10l;
        if (n1 == n2 + n3 + n4 + n5) {
            return true;
        } else if (n2 == n1 + n3 + n4 + n5) {
            return true;
        } else if (n3 == n1 + n2 + n4 + n5) {
            return true;
        } else if (n4 == n1 + n2 + n3 + n5) {
            return true;
        } else if (n5 == n1 + n2 + n3 + n4) {
            return true;
        } else if (n6 == n1 + n2 + n3 + n4) {
            return true;
        } else if (n7 == n1 + n2 + n3 + n4) {
            return true;
        } else if (n8 == n1 + n2 + n3 + n4) {
            return true;
        } else if (n9 == n1 + n2 + n3 + n4) {
            return true;
        } else if (n10 == n1 + n2 + n3 + n4) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    assert(isEqualToSumEven((4l)) == (false));
    assert(isEqualToSumEven((6l)) == (false));
    assert(isEqualToSumEven((8l)) == (true));
    assert(isEqualToSumEven((10l)) == (true));
    assert(isEqualToSumEven((11l)) == (false));
    assert(isEqualToSumEven((12l)) == (true));
    assert(isEqualToSumEven((13l)) == (false));
    assert(isEqualToSumEven((16l)) == (true));
    }

}
