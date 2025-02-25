import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function which sorts the given array list of integers
    // in ascending order according to the sum of their digits.
    // Note: if there are several items with similar sum of their digits,
    // order them based on their index in original array list.
    // For example:
    // >>> orderByPoints((new ArrayList<Long>(Arrays.asList((long)1l, (long)11l, (long)-1l, (long)-11l, (long)-12l))))
    // (new ArrayList<Long>(Arrays.asList((long)-1l, (long)-11l, (long)1l, (long)-12l, (long)11l)))
    // >>> orderByPoints((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    public static ArrayList<Long> orderByPoints(ArrayList<Long> nums) {

        HashMap<Long, Long> nums2 = new HashMap<Long, Long>();
        HashMap<Long, Long> sum = new HashMap<Long, Long>();
        nums.forEach(x -> {
            nums2.put(x, 0L);
        });
        nums.forEach(x -> {
            sum.put(x, 0L);
        });
        for (long i = 0; i < nums.size(); i++) {
            long l = nums.get((int) i);
            if (l < 0) {
                sum.put(l, (long) (0 - sumOfDigits((long) l)));
            } else {
                sum.put(l, sumOfDigits((long) l));
            }
        }
        ArrayList<Long> rr = new ArrayList<Long>();
        ArrayList<Long> rr2 = new ArrayList<Long>();
        for (Map.Entry<Long, Long> entry : sum.entrySet()) {
            rr.add(entry.getKey());
            rr2.add(entry.getValue());
        }
        ArrayList<Long> rr4 = new ArrayList<Long>();
        for (long i = 0; i < rr2.size(); i++) {
            long l = rr2.get((int) i);
            rr4.add(l);
        }
        ArrayList<Long> rr3 = new ArrayList<Long>();
        for (long i = 0; i < rr4.size(); i++) {
            long l = rr4.get((int) i);
            rr3.add(l);
        }
        ArrayList<Long> rr5 = new ArrayList<Long>();
        for (long i = 0; i < rr.size(); i++) {
            long l = rr.get((int) i);
            rr5.add(l);
        }
        ArrayList<Long> rr6 = new ArrayList<Long>();
        for (long i = 0; i < rr5.size(); i++) {
            long l = rr5.get((int) i);
            rr6.add(l);
        }
        for (long i = 0; i < rr3.size(); i++) {
            long l = rr3.get((int) i);
            rr2.set((int) i, l);
        }
        for (long i = 0; i < rr2.size(); i++) {
            long l = rr2.get((int) i);
            rr3.set((int) i, l);
        }
        for (long i = 0; i < rr6.size(); i++) {
            long l = rr6.get((int) i);
            rr4.set((int) i, l);
        }
        for (long i = 0; i < rr4.size(); i++) {
            long l = rr4.get((int) i);
            rr5.set((int) i, l);
        }
        rr3.sort(null);
        rr5.sort(null);
        ArrayList<Long> rr
    }
    public static void main(String[] args) {
    assert(orderByPoints((new ArrayList<Long>(Arrays.asList((long)1l, (long)11l, (long)-1l, (long)-11l, (long)-12l)))).equals((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-11l, (long)1l, (long)-12l, (long)11l)))));
    assert(orderByPoints((new ArrayList<Long>(Arrays.asList((long)1234l, (long)423l, (long)463l, (long)145l, (long)2l, (long)423l, (long)423l, (long)53l, (long)6l, (long)37l, (long)3457l, (long)3l, (long)56l, (long)0l, (long)46l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)2l, (long)3l, (long)6l, (long)53l, (long)423l, (long)423l, (long)423l, (long)1234l, (long)145l, (long)37l, (long)46l, (long)56l, (long)463l, (long)3457l)))));
    assert(orderByPoints((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(orderByPoints((new ArrayList<Long>(Arrays.asList((long)1l, (long)-11l, (long)-32l, (long)43l, (long)54l, (long)-98l, (long)2l, (long)-3l)))).equals((new ArrayList<Long>(Arrays.asList((long)-3l, (long)-32l, (long)-98l, (long)-11l, (long)1l, (long)2l, (long)43l, (long)54l)))));
    assert(orderByPoints((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l, (long)10l, (long)11l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)10l, (long)2l, (long)11l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l)))));
    assert(orderByPoints((new ArrayList<Long>(Arrays.asList((long)0l, (long)6l, (long)6l, (long)-76l, (long)-21l, (long)23l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)-76l, (long)-21l, (long)0l, (long)4l, (long)23l, (long)6l, (long)6l)))));
    }

}
