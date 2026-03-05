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
    int length = digits.length;

    // Find the first digit that is smaller than the digit to its right
    int i;
    for (i = length - 2; i >= 0; i--) {
      if (digits[i] < digits[i + 1]) {
        break;
      }
    }

    // If no such digit is found, no rearrangement can make the number greater
    if (i == -1) {
      return -1;
    }

    // Find the smallest digit on the right side of the found digit that is greater than it
    int j;
    for (j = length - 1; j > i; j--) {
      if (digits[j] > digits[i]) {
        break;
      }
    }

    // Swap the found digits
    char temp = digits[i];
    digits[i] = digits[j];
    digits[j] = temp;

    // Sort the digits after the position of the first found digit
    Arrays.sort(digits, i + 1, length);

    // Convert the array of digits back to an integer
    return Integer.parseInt(new String(digits));
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}