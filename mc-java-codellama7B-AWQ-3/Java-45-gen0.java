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
    char[] c = Integer.toString(n).toCharArray();
    Arrays.sort(c);
    int count = 0;
    for (int i = 0; i < c.length; i++) {
      if (c[i] != c[i - 1]) {
        c[count++] = c[i];
      }
    }
    if (n == Integer.parseInt(new String(c))) {
      return -1;
    }
    return Integer.parseInt(new String(c));
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}