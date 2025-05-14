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
    int min = 0, max = n;
    while (min <= max) {
      int mid = min + (max - min) / 2;
      int sum = 0;
      for (int i = 0; i < mid; i++) {
        sum += (int) Math.sqrt(i);
      }
      if (sum == n) return mid;
      else if (sum > n) max = mid - 1;
      else min = mid + 1;
    }
    return min;
  }
  public static void main(String[] args) {
    assert minPerfectSquareSum(26) == 2 : "Test case 1 failed";
    assert minPerfectSquareSum(17) == 2 : "Test case 2 failed";
    assert minPerfectSquareSum(99) == 3 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}