class Problem {

  /**
   * Given an integer n, return the minimum number of perfect square numbers that sum up to n.
   *
   * @param n The target integer.
   * @return The minimum number of perfect square numbers.
   *
   * Example:
   * minPerfectSquareSum(12)
   * Output: 3
   *
   * Example:
   * minPerfectSquareSum(13)
   * Output: 2
   */
  public static int minPerfectSquareSum(int n)  {
    if (n == 0) return 0;

    // Prepare dp[] to store minimum number of perfect square numbers that sum up to n.
    int[] dp = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      dp[i] = Integer.MAX_VALUE;
    }

    // Initialize base case.
    dp[0] = 0;

    // Iterate for all the numbers from 1 to n.
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j * j <= i; j++) {
        dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
      }
    }

    return dp[n];
  }
  public static void main(String[] args) {
    assert minPerfectSquareSum(26) == 2 : "Test case 1 failed";
    assert minPerfectSquareSum(17) == 2 : "Test case 2 failed";
    assert minPerfectSquareSum(99) == 3 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}