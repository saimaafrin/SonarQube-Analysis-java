import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a positive integer n. You have to create an integer array array list a of length n.
    // For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
    // Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
    // and a[i] + a[j] + a[k] is a multiple of 3.
    // Example :
    // >>> getMaxTriples((5l))
    // (1l)
    // Explanation: 
    // a = [1, 3, 7, 13, 21]
    // The only valid triple is (1, 7, 13).
    public static long getMaxTriples(long n) {

        // Write your code here
        long[] arr = new long[((int)n)];
        for(long i = 1l; i <= n; i++){
            arr[((int)i)-1] = (i*i-i+1);
        }
        long count = 0l;
        for(long i = 0l; i < n-2; i++){
            for(long j = i+1l; j < n-1; j++){
                for(long k = j+1l; k < n; k++){
                    if(((arr[((int)i)]+arr[((int)j)]+arr[((int)k)])%3l) == 0l){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
    assert(getMaxTriples((5l)) == (1l));
    assert(getMaxTriples((6l)) == (4l));
    assert(getMaxTriples((10l)) == (36l));
    assert(getMaxTriples((100l)) == (53361l));
    }

}
