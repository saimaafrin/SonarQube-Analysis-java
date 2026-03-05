import java.util.*;

class Problem {

  /**
   * Given a string s, split the string and return the maximum number of unique substrings.
   * The split substrings should be able to reconstruct the original string, and each substring must be unique.
   *
   * Example:
   * Input: s = "ababccc"
   * Output: 5
   * Explanation: One possible way to split the string is ['a', 'b', 'ab', 'c', 'cc'].
   *              Splitting the string as ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid, because both 'a' and 'b' appear more than once.
   *
   * Note:
   * - The length of s is between 1 and 16.
   * - s only contains lowercase English letters.
   */
  public int maxUniqueSplit(String s)  {
    int n = s.length();
    int[] dp = new int[n + 1];
    int[][] dp2 = new int[n + 1][n + 1];
    for (int i = 1; i <= n; i++) {
      dp[i] = 1;
      for (int j = 1; j < i; j++) {
        if (s.charAt(i - 1) == s.charAt(j - 1)) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        if (s.charAt(i - 1) == s.charAt(j - 1)) {
          dp2[i][j] = dp2[j][i];
        } else {
          dp2[i][j] = Math.max(dp2[i][j], dp2[j][i] + 1);
        }
      }
    }
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      ans = Math.max(ans, dp[i]);
    }
    return ans;
  }
  public static void main(String[] args) {
    Problem solution = new Problem();

    // Test the function with different test cases
    assert solution.maxUniqueSplit("ababccc") == 5;
    assert solution.maxUniqueSplit("abcabcabc") == 6;
    assert solution.maxUniqueSplit("abcdefg") == 7;
    assert solution.maxUniqueSplit("aaaaaaa") == 3;
    System.out.println("All tests passed");
  }
}