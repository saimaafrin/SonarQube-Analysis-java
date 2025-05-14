import java.util.*;

class Problem {
    /**
     * Given the number of triangles N, determine the maximum number of regions the plane can be divided into.
     *
     * Example:
     * >>> maxRegions(1)
     * 2
     * >>> maxRegions(2)
     * 8
     *
     * @param N the number of triangles
     * @return the maximum number of regions
     */
    public static int maxRegions(int N)  {
        // Write an implementation that uses constant memory.
        if (N == 0) return 1;
        int n = (int)Math.floor(Math.sqrt(N*2));
        int m = (int)Math.ceil(Math.sqrt(N*2));
        int[][] dp = new int[n+1][m+1];
        Arrays.fill(dp[0], 1);
        Arrays.fill(dp[1], 2);
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert maxRegions(3) == 13;
        assert maxRegions(4) == 21;
        assert maxRegions(5) == 31;
        System.out.println("All tests passed");
    }
}