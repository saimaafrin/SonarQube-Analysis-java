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
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    for (int i = n + 1; i <= Integer.MAX_VALUE; i++) {
      String str = String.valueOf(i);
      char[] ch = str.toCharArray();
      Arrays.sort(ch);
      if (Arrays.equals(ch, arr)) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}