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
    double[] dp = new double[n + 1];
    dp[n] = 1.0;
    for (int i = n - 1; i >= 0; i--) {
      dp[i] = (dp[i + 1] + (n - i) * (1 - dp[i + 1])) / (double) (n - i);
    }
    return dp[0];
  }
public static void main(String[] args) {
    assert Math.abs(calculateProbability(6) - 0.50000) < 0.00001;
    assert Math.abs(calculateProbability(10) - 0.50000) < 0.00001;
    assert Math.abs(calculateProbability(50) - 0.50000) < 0.00001;

    System.out.println("All tests passed");
  }
}