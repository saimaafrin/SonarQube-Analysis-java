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
    char[] digits = Integer.toString(n).toCharArray();
    int i;
    for (i = digits.length - 2; i >= 0; i--) {
      if (digits[i] < digits[i + 1]) {
        break;
      }
    }
    if (i < 0) {
      return -1;
    }
    int j;
    for (j = digits.length - 1; j > i; j--) {
      if (digits[j] > digits[i]) {
        break;
      }
    }
    char temp = digits[i];
    digits[i] = digits[j];
    digits[j] = temp;
    Arrays.sort(digits, i + 1, digits.length);
    return Integer.parseInt(new String(digits));
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}