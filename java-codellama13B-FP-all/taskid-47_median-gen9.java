import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return median of elements in the array list l.
    // >>> median((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l))))
    // (float)3l
    // >>> median((new ArrayList<Long>(Arrays.asList((long)-10l, (long)4l, (long)6l, (long)1000l, (long)10l, (long)20l))))
    // (15.0f)
    public static float median(ArrayList<Long> l) {

        // Check whether the list has elements.
        if (l.size() == 0) {
            throw new IllegalArgumentException("list l is empty.");
        }
        // Create a new array of same size as list.
        long[] arr = new long[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i] = (long)l.get(i);
        }
        // Sort the array.
        Arrays.sort(arr);
        // Return middle element if list size is odd.
        if (l.size() % 2 == 1) {
            return (float)arr[l.size() / 2];
        }
        // Return average of the two middle elements if list size is even.
        return (float)(arr[l.size() / 2] + arr[l.size() / 2 - 1]) / 2;
    }
    public static void main(String[] args) {
    assert(median((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l)))) == (float)3l);
    assert(median((new ArrayList<Long>(Arrays.asList((long)-10l, (long)4l, (long)6l, (long)1000l, (long)10l, (long)20l)))) == (8.0f));
    assert(median((new ArrayList<Long>(Arrays.asList((long)5l)))) == (float)5l);
    assert(median((new ArrayList<Long>(Arrays.asList((long)6l, (long)5l)))) == (5.5f));
    assert(median((new ArrayList<Long>(Arrays.asList((long)8l, (long)1l, (long)3l, (long)9l, (long)9l, (long)2l, (long)7l)))) == (float)7l);
    }

}
