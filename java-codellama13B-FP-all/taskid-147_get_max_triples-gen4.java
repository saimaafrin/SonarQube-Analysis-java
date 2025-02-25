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

        long[] a = new long[(int)n];
        for(int i=0;i<n;i++)
            a[i] = i*i+1-i;
        long sum=0,k=0,res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum = a[i]+a[j];
                for(int l=j;l<n;l++){
                    if(sum+a[l]%3==0)
                        k++;
                }
            }
            res = Math.max(k,res);
        }
        return res;
    }
    public static void main(String[] args) {
    assert(getMaxTriples((5l)) == (1l));
    assert(getMaxTriples((6l)) == (4l));
    assert(getMaxTriples((10l)) == (36l));
    assert(getMaxTriples((100l)) == (53361l));
    }

}
