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
    String numStr = Integer.toString(n);
    int length = numStr.length();
    int firstNum = Character.getNumericValue(numStr.charAt(0));
    int powOfTen = (int) Math.pow(10, length - 1);
    int rest = n % powOfTen;

    if (firstNum == 1) {
      return countDigitOne(rest) + countDigitOne(powOfTen - 1) + rest + 1;
    } else {
      return countDigitOne(rest) + (firstNum + 1) * countDigitOne(powOfTen - 1);
    }
  }
  public static void main(String[] args) {
    assert countDigitOne(20) == 12 : "Test case 1 failed";
    assert countDigitOne(55) == 16 : "Test case 2 failed";
    assert countDigitOne(99) == 20 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}