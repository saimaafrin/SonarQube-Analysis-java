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
    // Convert the integer to a string
    String nStr = String.valueOf(n);
    // Reverse the string
    String nStrReverse = new StringBuilder(nStr).reverse().toString();
    // Convert the reversed string back to an integer
    int nReverse = Integer.parseInt(nStrReverse);
    // Check if the reversed integer is less than the original integer
    if (nReverse < n) {
      return nReverse;
    } else {
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