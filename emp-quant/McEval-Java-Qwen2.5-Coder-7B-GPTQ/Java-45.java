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
    // Convert the number to a character array for easier manipulation
    char[] digits = Integer.toString(n).toCharArray();
    
    // Traverse the array from right to left to find the first digit that is smaller than the digit next to it
    for (int i = digits.length - 2; i >= 0; i--) {
      if (digits[i] < digits[i + 1]) {
        // Find the smallest digit on the right side of digits[i] but larger than digits[i]
        int minIndex = i + 1;
        for (int j = i + 2; j < digits.length; j++) {
          if (digits[j] > digits[i] && digits[j] < digits[minIndex]) {
            minIndex = j;
          }
        }
        
        // Swap the found digit with digits[i]
        char temp = digits[i];
        digits[i] = digits[minIndex];
        digits[minIndex] = temp;
        
        // Sort the digits after the current position in ascending order
        Arrays.sort(digits, i + 1, digits.length);
        
        // Convert the character array back to an integer and return
        return Integer.parseInt(new String(digits));
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