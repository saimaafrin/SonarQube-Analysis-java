import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer N, return the total sum of its digits in binary.
    // Example
    // >>> solve((1000l))
    // ("1")
    // >>> solve((150l))
    // ("110")
    // >>> solve((147l))
    // ("1100")
    // Variables:
    // @N integer
    // Constraints: 0 ≤ N ≤ 10000.
    // Output:
    // a string of binary number
    public static String solve(long N) {

        ArrayList<Integer> digits = new ArrayList<Integer>();
        String res = "";
        while (N > 0){
            digits.add((int)(N % 2));
            N = N / 2;
        }
        //System.out.println(digits.toString());
        //int size = digits.size();
        //int[] arr = digits.toArray(new int[size]);
        Collections.reverse(digits);
        for (int i : digits){
            res = res + i;
        }
        return res;
    }
    public static void main(String[] args) {
    assert(solve((1000l)).equals(("1")));
    assert(solve((150l)).equals(("110")));
    assert(solve((147l)).equals(("1100")));
    assert(solve((333l)).equals(("1001")));
    assert(solve((963l)).equals(("10010")));
    }

}
