class Problem {

  // Given the number of passengers n, calculate the probability that the last passenger will sit in their own seat.
  // @param n The number of passengers.
  // @return The probability that the last passenger will sit in their own seat.

  // Example 1:
  // Input: n = 1
  // Output: 1.00000

  // Example 2:
  // Input: n = 2
  // Output: 0.50000

  // Example 3:
  // Input: n = 3
  // Output: 0.50000

  // Example 4:
  // Input: n = 4
  // Output: 0.50000

  // Example 5:
  // Input: n = 5
  // Output: 0.50000

  // Example 6:
  // Input: n = 100000
  // Output: 0.50000

  // Function to calculate the probability that the last passenger will sit in their own seat
  public static double calculateProbability(int n)  {
    // Write your code here
    double[][] dp = new double[n + 1][n + 1];
    for (int i = 0; i <= n; i++) {
      dp[i][0] = 1;
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) / 2;
      }
    }
    return dp[n][n];
  }
public static void main(String[] args) {
    assert Math.abs(calculateProbability(6) - 0.50000) < 0.00001;
    assert Math.abs(calculateProbability(10) - 0.50000) < 0.00001;
    assert Math.abs(calculateProbability(50) - 0.50000) < 0.00001;

    System.out.println("All tests passed");
  }
}