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
    int i = 0, j = digits.length - 1;
    while (i < j) {
      if (digits[i] == digits[j]) {
        i++;
        j--;
      外部:
        for (int k = i; k < j; k++) {
          if (digits[k] == digits[j]) {
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
            i++;
            j--;
            break;
          }
        }
      } else {
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        j--;
      }
    }
    try {
      return Integer.parseInt(new String(digits));
    } catch (Exception e) {
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