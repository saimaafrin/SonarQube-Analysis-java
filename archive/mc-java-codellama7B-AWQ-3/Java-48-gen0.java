import java.lang.Math;

class Problem {

  /**
   * Find and return the nth ugly number.
   *
   * @param n The index of the ugly number to find.
   * @return The nth ugly number.
   *
   * Example:
   * findNthUglyNumber(10)
   * Output: 12
   */
  public static int findNthUglyNumber(int n)  {
    int[] dp = new int[n];
    dp[0] = 1;
    int[] primes = new int[] {2, 3, 5};
    int[] i = new int[primes.length];

    for (int j = 1; j < n; j++) {
      dp[j] = Math.min(Math.min(primes[0] * dp[i[0]], primes[1] * dp[i[1]]), primes[2] * dp[i[2]]);
      for (int k = 0; k < primes.length; k++) {
        if (dp[j] == primes[k] * dp[i[k]]) i[k]++;
      }
    }
    return dp[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
