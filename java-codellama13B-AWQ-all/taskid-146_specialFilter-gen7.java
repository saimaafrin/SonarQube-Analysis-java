import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes an array array list of numbers as input and returns 
    // the number of elements in the array array list that are greater than 10 and both 
    // first and last digits of a number are odd (1, 3, 5, 7, 9).
    // For example:
    // >>> specialFilter((new ArrayList<Long>(Arrays.asList((long)15l, (long)-73l, (long)14l, (long)-15l))))
    // (1l)
    // >>> specialFilter((new ArrayList<Long>(Arrays.asList((long)33l, (long)-2l, (long)-3l, (long)45l, (long)21l, (long)109l))))
    // (2l)
    public static long specialFilter(ArrayList<Long> nums) {

        long ctr = 0;
        for (int i = 0; i < nums.size(); ++i) {
            long num = nums.get(i);
            long num_abs = Math.abs(num);
            if (num_abs > 10) {
                long first_digit = num_abs % 10;
                long last_digit = num_abs / 10;
                if (first_digit % 2 == 1 && last_digit % 2 == 1) {
                    ctr += 1;
                }
            }
        }
        return ctr;
    }
    public static void main(String[] args) {
    assert(specialFilter((new ArrayList<Long>(Arrays.asList((long)5l, (long)-2l, (long)1l, (long)-5l)))) == (0l));
    assert(specialFilter((new ArrayList<Long>(Arrays.asList((long)15l, (long)-73l, (long)14l, (long)-15l)))) == (1l));
    assert(specialFilter((new ArrayList<Long>(Arrays.asList((long)33l, (long)-2l, (long)-3l, (long)45l, (long)21l, (long)109l)))) == (2l));
    assert(specialFilter((new ArrayList<Long>(Arrays.asList((long)43l, (long)-12l, (long)93l, (long)125l, (long)121l, (long)109l)))) == (4l));
    assert(specialFilter((new ArrayList<Long>(Arrays.asList((long)71l, (long)-2l, (long)-33l, (long)75l, (long)21l, (long)19l)))) == (3l));
    assert(specialFilter((new ArrayList<Long>(Arrays.asList((long)1l)))) == (0l));
    assert(specialFilter((new ArrayList<Long>(Arrays.asList()))) == (0l));
    }

}
