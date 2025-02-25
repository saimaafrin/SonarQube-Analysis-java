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

        // Find the midpoint of the array and count up from there.
        long length = arr.size();
        long midpoint = length / 2;
        long i = midpoint;
        long j = midpoint;
        long count = 0;
        // If the length is odd, then we need to start with one of the central elements.
        if (length % 2 == 1) {
            // We should start with a smaller element.
            if (arr.get((int)i) > arr.get((int)j)) {
                // Swap the elements.
                long temp = arr.get((int)i);
                arr.set((int)i, arr.get((int)j));
                arr.set((int)j, temp);
                count = count + 1;
            }
            // Move on to the next elements.
            i = i + 1;
            j = j - 1;
        }
        // Continue until we reach the end.
        while (i < length && j >= 0) {
            // We should start with a smaller element.
            if (arr.get((int)i) > arr.get((int)j)) {
                // Swap the elements.
                long temp = arr.get((int)i);
                arr.set((int)i, arr.get((int)j));
                arr.set((int)j, temp);
                count = count + 1;
            }
            // Move on to the next elements.
            i = i + 1;
            j = j - 1;
        }
        return count;
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
