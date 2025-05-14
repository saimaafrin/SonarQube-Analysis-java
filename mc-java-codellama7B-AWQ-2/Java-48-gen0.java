import java.lang.Math;

class Problem {

  /**
   * Find and return the nth ugly number.
   *
   * @param n The index of the ugly number to find.
   * @return The nth ugly number.
   *
   * Example:
   * findNthUglyNumber(10)
   * Output: 12
   */
  public static int findNthUglyNumber(int n)  {
    int[] factors = {2, 3, 5};
    int[] mults = new int[n];
    mults[0] = 1;
    for (int i = 1; i < n; i++) {
      mults[i] = Math.min(Math.min(mults[i - 1] * factors[0], mults[i - 1] * factors[1]), mults[i - 1] * factors[2]);
    }
    return mults[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
