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
    // The key insight is that a square number (such as 16) is the sum of two
    // perfect squares (8 and 8)
    //
    // So we keep reducing n by half until we hit 1, and if n is odd, we add 1
    // to the count.
    //
    // This implementation is O(log n) because we're only decrementing n by 1/2
    // until it reaches 1.

    int count = 0;
    while (n > 0) {
      count++;
      n -= (n & 1);
      n >>= 1;
    }

    return count;
  }
  public static void main(String[] args) {
    assert minPerfectSquareSum(26) == 2 : "Test case 1 failed";
    assert minPerfectSquareSum(17) == 2 : "Test case 2 failed";
    assert minPerfectSquareSum(99) == 3 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}