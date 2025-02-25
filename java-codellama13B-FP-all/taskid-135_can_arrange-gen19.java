import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which returns the largest index of an element which
    // is not greater than or equal to the element immediately preceding it. If
    // no such element exists then return -1. The given array array list will not contain
    // duplicate values.
    // Examples:
    // >>> canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l))))
    // (3l)
    // >>> canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (-1l)
    public static long canArrange(ArrayList<Long> arr) {

        long res = 0;
        long n = arr.size();
        long max = arr.get(0);
        long pre_max = 0;
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (max - arr.get(i) > pre_max) {
                pre_max = max - arr.get(i);
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l)))) == (3l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)5l)))) == (-1l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l, (long)10l)))) == (2l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)4l, (long)8l, (long)5l, (long)7l, (long)3l)))) == (4l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList()))) == (-1l));
    }

}
