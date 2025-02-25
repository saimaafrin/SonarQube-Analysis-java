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

        // write your code here
        long i = 0;
        long j = 0;
        for (i = 0; i < arr.size(); i++)
            if (arr.get(i) != i + 1)
                break;
        if (i == arr.size())
            return -1;
        for (j = i; j < arr.size(); j++)
            if (arr.get(i) > arr.get(j))
                break;
        if (j == arr.size())
            return i;
        long k = j;
        for (j = i; j < arr.size(); j++)
            if (arr.get(i) < arr.get(j))
                break;
        if (j == arr.size())
            return i;
        long m = j;
        long n = k;
        for (k = i; k < arr.size(); k++)
            if (arr.get(i) > arr.get(k))
                break;
        if (k == arr.size())
            return i;
        if (arr.get(i) > arr.get(k) && arr.get(i) < arr.get(n))
            return i;
        for (n = i; n < arr.size(); n++)
            if (arr.get(i) > arr.get(n))
                break;
        if (arr.get(i) > arr.get(n) && arr.get(i) < arr.get(m))
            return i;
        return -1;
    }
    public static void main(String[] args) {
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l)))) == (3l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)5l)))) == (-1l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l, (long)10l)))) == (2l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)4l, (long)8l, (long)5l, (long)7l, (long)3l)))) == (4l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList()))) == (-1l));
    }

}
