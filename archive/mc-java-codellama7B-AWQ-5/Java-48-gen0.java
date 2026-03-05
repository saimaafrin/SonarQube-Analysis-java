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
    int[] factors = new int[3];
    factors[0] = 2;
    factors[1] = 3;
    factors[2] = 5;
    int[] multiples = new int[n];
    multiples[0] = factors[0];
    int currentMultiple = 1;
    for (int i = 1; i < n; i++) {
      multiples[i] = multiples[currentMultiple - 1] * factors[i % 3];
      if (multiples[i] > multiples[currentMultiple - 1]) {
        currentMultiple = i;
      }
    }
    return multiples[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
