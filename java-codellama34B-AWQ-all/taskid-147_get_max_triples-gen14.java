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

        int [] a = new int[(int)n];
        int [] b = new int[(int)n];
        int [] c = new int[(int)n];
        for(int i = 0; i < n; i++) {
            a[i] = (int)Math.pow((double)i, 2) - i + 1;
        }
        for(int j = 0; j < n; j++) {
            b[j] = (int)Math.pow((double)j, 2) - j + 1;
        }
        for(int k = 0; k < n; k++) {
            c[k] = (int)Math.pow((double)k, 2) - k + 1;
        }
        int [] a1 = Arrays.copyOf(a, (int)n);
        int [] b1 = Arrays.copyOf(b, (int)n);
        int [] c1 = Arrays.copyOf(c, (int)n);
        int i = 0;
        long t = 0;
        while(i < n - 1) {
            if(a1[i] % 3 == 0) {
                for(int j = i + 1; j < n; j++) {
                    if(b1[j] % 3 == 0 && a1[i] + b1[j] % 3 == 0) {
                        for(int k = j + 1; k < n; k++) {
                            if(c1[k] % 3 == 0 && a1[i] + b1[j] + c1[k] % 3 == 0) {
                                t++;
                            }
                        }
                    }
                }
            }
            i++;
        }
        return t;
    }
    public static void main(String[] args) {
    assert(getMaxTriples((5l)) == (1l));
    assert(getMaxTriples((6l)) == (4l));
    assert(getMaxTriples((10l)) == (36l));
    assert(getMaxTriples((100l)) == (53361l));
    }

}
