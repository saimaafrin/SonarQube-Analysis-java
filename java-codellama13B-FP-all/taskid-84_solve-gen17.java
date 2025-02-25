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

        long t = N;
        long sum = 0;
        int len = 0;
        while(N!=0){
            sum+=N%2;
            N=N/2;
            len++;
        }
        String res = "";
        String sumString = Long.toString(sum);
        int m = sumString.length();
        int i = 0;
        for(i=0;i<m;i++){
            if(sumString.charAt(i)=='1'){
                res+='1';
            }
        }
        for(int j=0;j<len-m;j++){
            res+='0';
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
