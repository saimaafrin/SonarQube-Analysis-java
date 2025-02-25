import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

        long counter = 0;
        String n_str = String.valueOf(n);
        int len = n_str.length();
        String pre = n_str.substring(0, 1);
        String suf = n_str.substring(len - 1, len);
        if (pre.equals("1") || suf.equals("1")) {
            return Math.pow(10, len - 1);
        } else {
            return Math.pow(10, len - 2) * 2;
        }
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
