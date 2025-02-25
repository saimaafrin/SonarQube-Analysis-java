import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of numbers, return the sum of squares of the numbers
    // in the array list that are odd. Ignore numbers that are negative or not integers.
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)0l))))
    // (10l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)-1l, (long)-2l, (long)0l))))
    // (0l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)9l, (long)-2l))))
    // (81l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)0l))))
    // (0l)
    // If the input array list is empty, return 0.
    public static long doubleTheDifference(ArrayList<Float> lst) {

        // 1) Get the sum of the squared odd numbers.
        long oddSum = 0;
        for (float num : lst) {
            if (!isInteger(num) || num < 0)
                continue;
            if (num % 2 != 0)
                oddSum += num * num;
        }
        // 2) Get the sum of the squared even numbers.
        long evenSum = 0;
        for (float num : lst) {
            if (!isInteger(num) || num < 0)
                continue;
            if (num % 2 == 0)
                evenSum += num * num;
        }
        // 3) Return the difference between the sum of odd and even numbers.
        return evenSum - oddSum;
    }
    public static void main(String[] args) {
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList()))) == (0l));
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList((float)5.0f, (float)4.0f)))) == (25l));
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList((float)0.1f, (float)0.2f, (float)0.3f)))) == (0l));
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList((float)-10.0f, (float)-20.0f, (float)-30.0f)))) == (0l));
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList((float)-1.0f, (float)-2.0f, (float)8.0f)))) == (0l));
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList((float)0.2f, (float)3.0f, (float)5.0f)))) == (34l));
    assert(doubleTheDifference((new ArrayList<Float>(Arrays.asList((float)-9.0f, (float)-7.0f, (float)-5.0f, (float)-3.0f, (float)-1.0f, (float)1.0f, (float)3.0f, (float)5.0f, (float)7.0f, (float)9.0f)))) == (165l));
    }

}
