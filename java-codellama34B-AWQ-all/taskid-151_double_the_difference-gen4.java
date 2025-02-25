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

        int i;
        int n = 0;
        int count = 0;
        long sum = 0;
        int temp = 0;
        if(lst.size() == 0)
            return sum;
        for(i = 0; i < lst.size(); i++) {
            if(lst.get(i) % 1 == 0 && lst.get(i) > 0) {
                n = (int)lst.get(i);
                if(n % 2 != 0)
                    count += n;
                else
                    continue;
            }
            else
                continue;
        }
        temp = count;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum * sum;
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
