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
        long result = 0;
        if (n == 1) {
            return result;
        }
        // find the index of the minimum value and the index of the maximum value in the array
        int minIndex = 0;
        int maxIndex = 0;
        long min = arr.get(0);
        long max = arr.get(0);
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                minIndex = i;
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
                maxIndex = i;
            }
        }
        // create a new array where the minimum value is at the beginning and the maximum value is at the end
        ArrayList<Long> newArr = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++) {
            if (i < minIndex) {
                newArr.add(arr.get(minIndex - i));
            } else if (i > minIndex) {
                newArr.add(arr.get(n - 1 - (i - minIndex)));
            } else {
                newArr.add(arr.get(i));
            }
        }
        for (int i = 0; i < n / 2; i++) {
            if (newArr.get(i) != newArr.get(n - 1 - i)) {
                result++;
            }
        }
        return result;
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
