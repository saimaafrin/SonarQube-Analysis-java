import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement the function f that takes n as a parameter,
    // and returns an array array list of size n, such that the value of the element at index i is the factorial of i if i is even
    // or the sum of numbers from 1 to i otherwise.
    // i starts from 1.
    // the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    // Example:
    // >>> f((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))
    public static ArrayList<Long> f(long n) {

        // Write your code here
        ArrayList<Long> ans = new ArrayList<Long>();
        for(long i=0l;i<n;i++){
            if(i%2l==0l){
                long ans_i = 1l;
                for(long j=i;j>0l;j--){
                    ans_i *= j;
                }
                ans.add(ans_i);
            }
            else{
                long ans_i = 0l;
                for(long j=1l;j<=i;j++){
                    ans_i += j;
                }
                ans.add(ans_i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    assert(f((5l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))));
    assert(f((7l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l, (long)720l, (long)28l)))));
    assert(f((1l)).equals((new ArrayList<Long>(Arrays.asList((long)1l)))));
    assert(f((3l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l)))));
    }

}
