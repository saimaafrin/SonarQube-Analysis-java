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
    // Convert the integer to a string and reverse it
    String str = new StringBuilder(String.valueOf(n)).reverse().toString();

    // Try to convert the reversed string to an integer
    try {
      int smallest = Integer.parseInt(str);

      // If the reversed string can be converted to an integer, return it
      if (smallest > n) {
        return smallest;
      }
    } catch (NumberFormatException ex) {
      // If the reversed string can't be converted to an integer, return -1
   
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