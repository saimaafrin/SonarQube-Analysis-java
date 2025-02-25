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

        long n = (long)arr.size();
        long[] arr1 = new long[(int)n];
        for(long i=0l;i<n;i++) {
            arr1[(int)i] = arr.get((int)i);
        }
        for(long i=0l;i<n-1l;i++) {
            if((arr1[i] < arr1[i+1l])) {
                return -1l;
            }
        }
        long ans = -1l;
        long max = -1l;
        for(long i=0l;i<n-1l;i++) {
            if(arr1[i] > max) {
                max = arr1[i];
            }
        }
        long c = 0l;
        for(long i=0l;i<n;i++) {
            if(arr1[i] > max) {
                c++;
            }
        }
        for(long i=0l;i<n-1l;i++) {
            if((arr1[i] == max) && (arr1[i+1l] < max)) {
                ans = i;
                break;
            }
        }
        if(ans == -1l) {
            if(c == n) {
                return ans;
            }
            return -1l;
        }
        return ans;
    }
    public static void main(String[] args) {
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l)))) == (3l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)5l)))) == (-1l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l, (long)10l)))) == (2l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)4l, (long)8l, (long)5l, (long)7l, (long)3l)))) == (4l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList()))) == (-1l));
    }

}
