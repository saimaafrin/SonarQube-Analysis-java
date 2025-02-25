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

        long arr_length = arr.size();
        if (arr_length == 1)
            return 0;
        else if (arr_length == 2)
            return 1;
        else if (arr_length == 3)
            return 1;
        int start = 0, end = arr_length - 1;
        ArrayList<Long> arr_first = new ArrayList<Long>();
        ArrayList<Long> arr_last = new ArrayList<Long>();
        ArrayList<Long> arr_rev = new ArrayList<Long>();
        ArrayList<Long> arr_comp = new ArrayList<Long>();
        while (start < end) {
            arr_first.add(arr.get(start));
            arr_last.add(arr.get(end));
            start++;
            end--;
        }
        int first_length = arr_first.size();
        int last_length = arr_last.size();
        if (last_length < first_length) {
            int diff = first_length - last_length;
            int i = 0;
            while (i < diff) {
                arr_last.add(0, 0);
                i++;
            }
            arr_rev = arr_last;
        } else if (last_length > first_length) {
            int diff = last_length - first_length;
            int i = 0;
            while (i < diff) {
                arr_first.add(0);
                i++;
            }
            arr_rev = arr_first;
        } else {
            arr_rev = arr_last;
        }
        arr_comp = arr_rev;
        Collections.reverse(arr_rev);
        int comp_length = arr_comp.size();
        int i = 0;
        while (i < comp_length) {
            if (arr_comp.get(i) != arr_rev.get(i))
                arr_comp.set(i, 1);
            else
                arr_comp.set(i, 0);
            i++;
        }
        long sum = 0;
        for (i = 0; i < comp_length; i++)
            sum += arr_comp.get(i);
        return sum;
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
