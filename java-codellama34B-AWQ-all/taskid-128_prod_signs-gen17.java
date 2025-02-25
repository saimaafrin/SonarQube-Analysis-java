import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list arr of integers and you need to return
    // sum of magnitudes of integers multiplied by product of all signs
    // of each number in the array array list, represented by 1, -1 or 0.
    // Note: return null for empty arr.
    // Example:
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)-4l))))
    // 9l
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l))))
    // 0l
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList())))
    // Optional.empty()
    public static Optional<Long> prodSigns(ArrayList<Long> arr) {

        long[] signs = new long[arr.size()];
        long sign = 1;
        for (int i = 0; i < arr.size(); i++) {
            signs[i] = sign;
            if (arr.get(i) < 0) {
                sign *= -1;
            } else if (arr.get(i) == 0) {
                return Optional.empty();
            }
        }
        long prodSigns = 1;
        for (int i = 0; i < signs.length; i++) {
            prodSigns *= signs[i];
        }
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i));
        }
        return Optional.of(sum * prodSigns);
    }
    public static void main(String[] args) {
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)-4l)))).equals(-9l));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))).equals(0l));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)2l, (long)3l, (long)-1l, (long)1l)))).equals(-10l));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList()))).equals(Optional.empty()));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)2l, (long)-1l, (long)-1l, (long)9l)))).equals(20l));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)-1l, (long)1l, (long)-1l, (long)1l)))).equals(4l));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)-1l, (long)1l, (long)1l, (long)1l)))).equals(-4l));
    assert(prodSigns((new ArrayList<Long>(Arrays.asList((long)-1l, (long)1l, (long)1l, (long)0l)))).equals(0l));
    }

}
