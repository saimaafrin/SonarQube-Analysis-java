class Problem {

  /**
   * Calculate the number of times the digit 1 appears in all non-negative integers less than or equal to n.
   *
   * @param n An integer representing the upper limit.
   * @return The number of times the digit 1 appears.
   *
   * Example:
   * countDigitOne(13)
   * Output: 6
   *
   * Example:
   * countDigitOne(0)
   * Output: 0
   */
  public static int countDigitOne(int n)  {
    if (n <= 0) return 0;
    String s = Integer.toString(n);
    int first = s.charAt(0) - '0';
    int length = s.length();
    int numFirst = first == 1 ? Integer.parseInt(s.substring(1)) + 1 : (int)Math.pow(10, length - 1);
    int numOther = first * (length - 2) * (int)Math.pow(10, length - 2);
    int numRecursive = countDigitOne(Integer.parseInt(s.substring(1)));
    return numFirst + numOther + numRecursive;
  }
  public static void main(String[] args) {
    assert countDigitOne(20) == 12 : "Test case 1 failed";
    assert countDigitOne(55) == 16 : "Test case 2 failed";
    assert countDigitOne(99) == 20 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}