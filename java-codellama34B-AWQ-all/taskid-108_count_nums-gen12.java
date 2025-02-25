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

        ArrayList<Long> positiveNums = new ArrayList<Long>();
        for (Long num : arr) {
            // Get the sum of the digits.
            int sum = 0;
            int numAbs = Math.abs((int) num);
            while (numAbs > 0) {
                sum += numAbs % 10;
                numAbs /= 10;
            }
            // Check if the sum of the digits is greater than 0.
            if (sum > 0) {
                positiveNums.add(num);
            }
        }
        return positiveNums.size();
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
