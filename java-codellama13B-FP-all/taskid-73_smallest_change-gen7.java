import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list arr of integers, find the minimum number of elements that
    // need to be changed to make the array array list palindromic. A palindromic array array list is an array array list that
    // is read the same backwards and forwards. In one change, you can change one element to any other element.
    // For example:
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l))))
    // (4l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l))))
    // (1l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l))))
    // (0l)
    public static long smallestChange(ArrayList<Long> arr) {

        int n = arr.size();
        int l = 0;
        int r = n - 1;
        long res = 0;
        while (l < r) {
            if (arr.get(l) != arr.get(r)) {
                if (arr.get(l) == arr.get(r - 1)) {
                    long temp = arr.get(l);
                    arr.set(l, arr.get(r));
                    arr.set(r, temp);
                    l++;
                    r--;
                } else if (arr.get(l + 1) == arr.get(r)) {
                    long temp = arr.get(l);
                    arr.set(l, arr.get(r - 1));
                    arr.set(r - 1, temp);
                    l++;
                    r -= 2;
                } else if (arr.get(l + 1) == arr.get(r - 1)) {
                    long temp = arr.get(l);
                    arr.set(l, arr.get(r));
                    arr.set(r, arr.get(r - 1));
                    arr.set(r - 1, temp);
                    l++;
                    r -= 2;
                } else {
                    res++;
                    l++;
                    r--;
                }
            } else {
                l++;
                r--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l)))) == (4l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)1l, (long)3l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))) == (1l));
    }

}
