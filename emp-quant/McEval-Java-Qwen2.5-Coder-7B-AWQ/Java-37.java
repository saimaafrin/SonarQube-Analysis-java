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
    
    long res = 0;
    for (long m = 1; m <= n; m *= 10) {
      long a = n / (m * 10);
      long b = n % m;
      if (a > 0 && a != 1) {
        res += (a + 1) * m;
      } else if (a == 1) {
        res += b + 1;
      }
    }
    return (int)res;
  }
  public static void main(String[] args) {
    assert countDigitOne(20) == 12 : "Test case 1 failed";
    assert countDigitOne(55) == 16 : "Test case 2 failed";
    assert countDigitOne(99) == 20 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}