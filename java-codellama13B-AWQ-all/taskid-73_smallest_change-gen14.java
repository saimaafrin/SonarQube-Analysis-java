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

        ArrayList<Long> list1 = new ArrayList<Long>(arr);
        ArrayList<Long> list2 = new ArrayList<Long>(arr);
        ArrayList<Long> list3 = new ArrayList<Long>(arr);
        int left = 0;
        int right = arr.size() - 1;
        while(left < right) {
            long tmp = list1.get(left);
            list1.set(left, list1.get(right));
            list1.set(right, tmp);
            left++;
            right--;
        }
        left = 0;
        right = arr.size() - 1;
        while(left < right) {
            long tmp = list2.get(left);
            list2.set(left, list2.get(right));
            list2.set(right, tmp);
            left++;
            right--;
        }
        left = 0;
        right = arr.size() - 1;
        while(left < right) {
            long tmp = list3.get(left);
            list3.set(left, list3.get(right));
            list3.set(right, tmp);
            left++;
            right--;
        }
        long count1 = 0;
        long count2 = 0;
        long count3 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(list1.get(i) != list2.get(i))
                count1++;
            if(list1.get(i) != list3.get(i))
                count2++;
            if(list2.get(i) != list3.get(i))
                count3++;
        }
        long min = Math.min(Math.min(count1, count2), count3);
        return min;
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
