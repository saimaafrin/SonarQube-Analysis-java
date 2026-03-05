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
    String s = String.valueOf(n);
    StringBuilder sb = new StringBuilder();

    // Sort the string in ascending order.
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    sb.append(chars);

    // Convert the string to integer.
    int i = Integer.parseInt(sb.toString());

    // If the integer is greater than n, return it.
    if (i > n) {
      return i;
    }
    // Otherwise, return -1.
    return -1;
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}