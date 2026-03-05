class Problem {

  /**
   * Find the smallest integer that can be formed by rearranging the digits of the given positive integer n, which is greater than n.
   *
   * @param n The input positive integer.
   * @return The smallest rearranged integer greater than n, or -1 if not possible.
   *
   * Example:
   * findSmallestInteger(12)
   * Output: 21
   */
  public static int findSmallestInteger(int n)  {
    // Write your solution here
    int[] digits = new int[10];
    for (int i = 0; i < 10; i++) {
      digits[i] = 0;
    }
    while (n > 0) {
      digits[n % 10]++;
      n /= 10;
    }
    int result = 0;
    for (int i = 9; i >= 0; i--) {
      while (digits[i] > 0) {
        result = result * 10 + i;
        digits[i]--;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}