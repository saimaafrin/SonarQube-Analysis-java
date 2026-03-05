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
    char[] digits = String.valueOf(n).toCharArray();
    int len = digits.length;

    for (int i = len - 2; i >= 0; i--) {
      if (digits[i] < digits[i + 1]) {
        for (int j = len - 1; j > i; j--) {
          if (digits[j] > digits[i] && digits[j] < digits[j - 1]) {
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
            return Integer.parseInt(new String(digits));
          }
        }
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