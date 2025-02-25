import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to write a function that returns true if a number x is a simple
    // power of n and false in other cases.
    // x is a simple power of n if n**int=x
    // For example:
    // >>> isSimplePower((1l), (4l))
    // (true)
    // >>> isSimplePower((2l), (2l))
    // (true)
    // >>> isSimplePower((8l), (2l))
    // (true)
    // >>> isSimplePower((3l), (2l))
    // (false)
    // >>> isSimplePower((3l), (1l))
    // (false)
    // >>> isSimplePower((5l), (3l))
    // (false)
    public static boolean isSimplePower(long x, long n) {

        long n2 = (long) Math.pow(n, 2);
        long n3 = (long) Math.pow(n, 3);
        long n4 = (long) Math.pow(n, 4);
        long n5 = (long) Math.pow(n, 5);
        long n6 = (long) Math.pow(n, 6);
        long n7 = (long) Math.pow(n, 7);
        long n8 = (long) Math.pow(n, 8);
        long n9 = (long) Math.pow(n, 9);
        long n10 = (long) Math.pow(n, 10);
        long n11 = (long) Math.pow(n, 11);
        long n12 = (long) Math.pow(n, 12);
        long n13 = (long) Math.pow(n, 13);
        long n14 = (long) Math.pow(n, 14);
        long n15 = (long) Math.pow(n, 15);
        long n16 = (long) Math.pow(n, 16);
        long n17 = (long) Math.pow(n, 17);
        long n18 = (long) Math.pow(n, 18);
        long n19 = (long) Math.pow(n, 19);
        long n20 = (long) Math.pow(n, 20);
        if (x == n2 || x == n3 || x == n4 || x == n5 || x == n6 || x == n7 || x == n8 || x == n9 || x == n10 || x == n11 || x == n12 || x == n13 || x == n14 || x == n15 || x == n16 || x == n17 || x == n18 || x == n19 || x == n20) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    assert(isSimplePower((16l), (2l)) == (true));
    assert(isSimplePower((143214l), (16l)) == (false));
    assert(isSimplePower((4l), (2l)) == (true));
    assert(isSimplePower((9l), (3l)) == (true));
    assert(isSimplePower((16l), (4l)) == (true));
    assert(isSimplePower((24l), (2l)) == (false));
    assert(isSimplePower((128l), (4l)) == (false));
    assert(isSimplePower((12l), (6l)) == (false));
    assert(isSimplePower((1l), (1l)) == (true));
    assert(isSimplePower((1l), (12l)) == (true));
    }

}
