import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list arr of integers, find the minimum number of elements that
    // need to be changed to make the array array list palindromic. A palindromic array array list is an array array list that
    // is read the same backwards and forwards. In one change, you can change one element to any other element.
    // For example:
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l))))
    // (4l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l))))
    // (1l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l))))
    // (0l)
    public static long smallestChange(ArrayList<Long> arr) {

        long[] arr_ = arr.stream().mapToLong(l->l).toArray();
        int n = arr_.length;
        // The array is already palindrome.
        if (n == 0) {
            return 0;
        }
        int[][] dp = new int[n][n];
        // This is the only change that can be made when the array is of length 1.
        dp[0][0] = 1;
        // This is the only change that can be made when the array is of length 2.
        if (n == 2) {
            return 1;
        }
        // Initialize the boundary conditions.
        for (int i = 0; i < n - 1; i++) {
            if (arr_[i] == arr_[i + 1]) {
                dp[i][i + 1] = 0;
            } else {
                dp[i][i + 1] = 1;
            }
        }
        // This is the only change that can be made when the array is of length 3.
        if (n == 3) {
            return dp[0][2];
        }
        for (int i = 2; i < n - 1; i++) {
            if (arr_[i] == arr_[i - 1]) {
                dp[i - 1][i + 1] = 0;
            } else {
                dp[i - 1][i + 1] = 1;
            }
        }
        for (int size = 4; size <= n; size++) {
            for (int start = 0; start <= n - size; start++) {
                int end = start + size - 1;
                if (arr_[start] == arr_[end]) {
                    dp[start][end] = dp[start + 1][end - 1];
                } else {
                    dp[start][end] = 1 + Math.min(dp[start][end - 1], dp[start + 1][end]);
                }
            }
        }
        return dp[0][n - 1];
    }
    public static void main(String[] args) {
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l)))) == (4l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)1l, (long)3l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))) == (1l));
    }

}
