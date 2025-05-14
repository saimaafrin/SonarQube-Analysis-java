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
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (i * i == n) return 1;
    }
    int perfectSquare = (int) Math.sqrt(n);
    int left = 1;
    int right = perfectSquare;
    while (left <= right) {
      int mid = (left + right) >>> 1;
      int sum = (mid * mid + mid) >>> 1;
      if (sum == n) {
        count++;
        break;
      } else if (sum > n) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
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