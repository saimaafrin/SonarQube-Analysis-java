import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function count_nums which takes an array array list of integers and returns
    // the number of elements which has a sum of digits > 0.
    // If a number is negative, then its first signed digit will be negative:
    // e.g. -123 has signed digits -1, 2, and 3.
    // >>> countNums((new ArrayList<Long>(Arrays.asList())))
    // (0l)
    // >>> countNums((new ArrayList<Long>(Arrays.asList((long)-1l, (long)11l, (long)-11l))))
    // (1l)
    // >>> countNums((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)2l))))
    // (3l)
    public static long countNums(ArrayList<Long> arr) {

        long count = 0l;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).longValue() > 0l) {
                count = count + 1l;
            } else {
                long num = arr.get(i).longValue();
                long sum = 0l;
                while(num != 0l) {
                    sum = sum + num % 10l;
                    num = num / 10l;
                }
                if(sum > 0l) {
                    count = count + 1l;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
    assert(countNums((new ArrayList<Long>(Arrays.asList()))) == (0l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-2l, (long)0l)))) == (0l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)2l, (long)-2l, (long)3l, (long)4l, (long)5l)))) == (6l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)1l, (long)6l, (long)9l, (long)-6l, (long)0l, (long)1l, (long)5l)))) == (5l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)1l, (long)100l, (long)98l, (long)-7l, (long)1l, (long)-1l)))) == (4l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)12l, (long)23l, (long)34l, (long)-45l, (long)-56l, (long)0l)))) == (5l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))) == (1l));
    assert(countNums((new ArrayList<Long>(Arrays.asList((long)1l)))) == (1l));
    }

}
