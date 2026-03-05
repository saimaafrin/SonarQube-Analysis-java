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
    
    // Start from the rightmost digit and move leftwards
    for (int i = digits.length - 2; i >= 0; i--) {
      // If the current digit is less than the next digit
      if (digits[i] < digits[i + 1]) {
        // Find the smallest digit on the right side of (i-th digit) but larger than digits[i]
        for (int j = digits.length - 1; j > i; j--) {
          if (digits[j] > digits[i]) {
            // Swap the found digit with the (i-th digit)
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
            
            // Sort all digits after (i+1)-th digit in ascending order
            Arrays.sort(digits, i + 1, digits.length);
            
            // Convert the array back to an integer and return it
            return Integer.parseInt(new String(digits));
          }
        }
      }
    }
    
    // If no such arrangement exists, return -1
    return -1;
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}