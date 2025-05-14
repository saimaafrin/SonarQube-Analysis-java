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
    if (n <= 0) {
      throw new IllegalArgumentException("Input should be greater than zero.");
    }
    
    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;
    int nextUglyIndex = 1;

    int i2 = 0, i3 = 0, i5 = 0;
    int nextUgly = 0;

    while (nextUglyIndex < n) {
      nextUgly = Math.min(uglyNumbers[i2] * 2, Math.min(uglyNumbers[i3] * 3, uglyNumbers[i5] * 5));

      if (nextUgly == uglyNumbers[i2] * 2) i2++;
      if (nextUgly == uglyNumbers[i3] * 3) i3++;
      if (nextUgly == uglyNumbers[i5] * 5) i5++;

      uglyNumbers[nextUglyIndex++] = nextUgly;
    }

    return uglyNumbers[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
