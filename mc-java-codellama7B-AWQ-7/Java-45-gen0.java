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
    // Find the digits of the input number.
    int[] digits = new int[10];
    while (n > 0) {
      digits[n % 10]++;
      n /= 10;
    }

    // Find the largest digit.
    int largest = -1;
    for (int i = 0; i < 10; i++) {
      if (digits[i] > largest) {
        largest = i;
      }
    }

    // Find the smallest integer by rearranging the digits.
    int smallest = 0;
    for (int i = largest; i > 0; i--) {
      smallest += (int) Math.pow(10, digits[i] - 1);
    }
    return smallest;
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}