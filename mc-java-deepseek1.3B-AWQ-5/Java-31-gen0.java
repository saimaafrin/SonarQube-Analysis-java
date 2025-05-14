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
    Set<String> seen = new HashSet<>();
    int[] dp = new int[s.length() + 1];
    dp[0] = 0;
    for (int i = 1; i <= s.length(); i++) {
      dp[i] = -1;
      for (int j = 0; j < i; j++) {
        if (seen.contains(s.substring(j, i))) {
          continue;
        }
        if (dp[j] != -1) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
       
        }
        seen.add(s.substring(j, i));
      }
    }
    return dp[s.length()];
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