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

    // Initialize a variable to store the answer.
    int answer = 0;

    // Loop through the range of perfect squares.
    for (int i = 1; i * i <= n; i++) {

      // Get the sum of the perfect squares.
      int sum = i * i + (n - i * i);

      // If the sum is equal to the target integer, return the answer.
      if (sum == n) {
        return answer + 1;
      }

      // Otherwise, increment the answer.
      answer++;
    }

    // Return the answer.
    return answer;
  }
  public static void main(String[] args) {
    assert minPerfectSquareSum(26) == 2 : "Test case 1 failed";
    assert minPerfectSquareSum(17) == 2 : "Test case 2 failed";
    assert minPerfectSquareSum(99) == 3 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}