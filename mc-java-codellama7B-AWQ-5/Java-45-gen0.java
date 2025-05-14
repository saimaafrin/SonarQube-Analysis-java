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
    if (n < 10) return -1;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      sb.append(n % 10);
      n /= 10;
    }
    try {
      int result = Integer.parseInt(sb.toString());
      return result;
    } catch (NumberFormatException e) {
      return -1;
    }
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}