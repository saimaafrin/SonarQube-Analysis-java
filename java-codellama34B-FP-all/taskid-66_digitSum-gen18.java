import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Task
    // Write a function that takes a string as input and returns the sum of the upper characters only'
    // ASCII codes.
    // Examples:
    // >>> digitSum((""))
    // (0l)
    // >>> digitSum(("abAB"))
    // (131l)
    // >>> digitSum(("abcCd"))
    // (67l)
    // >>> digitSum(("helloE"))
    // (69l)
    // >>> digitSum(("woArBld"))
    // (131l)
    // >>> digitSum(("aAaaaXa"))
    // (153l)
    public static long digitSum(String s) {

        // 1. Get character array from string
        char[] arr = s.toCharArray();
        // 2. Get ASCII value of each character
        int[] ascii_arr = Arrays.stream(arr).map(c -> (int)c).toArray();
        // 3. Filter characters that are not uppercase
        int[] upper = Arrays.stream(ascii_arr).filter(c -> c > 64 && c < 91).toArray();
        // 4. Get the sum
        int sum = Arrays.stream(upper).reduce(0, (a,b) -> a+b);
        return (long)sum;
    }
    public static void main(String[] args) {
    assert(digitSum(("")) == (0l));
    assert(digitSum(("abAB")) == (131l));
    assert(digitSum(("abcCd")) == (67l));
    assert(digitSum(("helloE")) == (69l));
    assert(digitSum(("woArBld")) == (131l));
    assert(digitSum(("aAaaaXa")) == (153l));
    assert(digitSum((" How are yOu?")) == (151l));
    assert(digitSum(("You arE Very Smart")) == (327l));
    }

}
