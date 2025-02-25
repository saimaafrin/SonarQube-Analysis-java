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

        // Write your code here
        int n = arr.size();
        int[][] dp = new int[n][n];
        int[][] lps = new int[n][n];
        for (int[] row : lps) Arrays.fill(row, 0);
        for (int[] row : dp) Arrays.fill(row, 0);
        for (int i = 0; i < n; i++) lps[i][i] = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) == arr.get(i + 1)) lps[i][i + 1] = 1;
            else lps[i][i + 1] = 0;
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                if (arr.get(i) == arr.get(j)) lps[i][j] = 2 + lps[i + 1][j - 1];
                else lps[i][j] = Math.max(lps[i + 1][j], lps[i][j - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (j < n - i - 1) {
                    if (arr.get(j) == arr.get(n - 1 - i)) dp[j][n - 1 - i] = Math.min(dp[j + 1][n - 2 - i] + 1, dp[j][n - 1 - i]);
                    else dp[j][n - 1 - i] = dp[j + 1][n - 2 - i] + 1;
                } else {
                    dp[j][n - 1 - i] = 0;
                }
                dp[j][n - 1 - i] = Math.min(dp[j][n - 1 - i], lps[j][n - 1 - i] + 1);
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
