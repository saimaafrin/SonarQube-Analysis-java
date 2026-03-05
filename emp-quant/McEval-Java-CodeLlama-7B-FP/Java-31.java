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
      int j = i - 1;
      while (j >= 0 && s.charAt(i) != s.charAt(j)) {
        j--;
      }
      dp[i] = i - j - 1;
      dp2[i][j + 1] = i - j - 1;
    }

    for (int i = n - 1; i >= 0; i--) {
      for (int j = i + 1; j <= n; j++) {
        dp2[i][j] = Math.max(dp2[i][j], dp2[i + 1][j - 1] + 1);
      }
    }

    return dp[n];
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