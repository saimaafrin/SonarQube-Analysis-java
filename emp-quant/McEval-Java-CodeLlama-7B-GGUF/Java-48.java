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
    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;
    int i2 = 0;
    int i3 = 0;
    int i5 = 0;
    for (int i = 1; i < n; i++) {
      int nextUglyNumber = Math.min(Math.min(uglyNumbers[i2] * 2, uglyNumbers[i3] * 3), uglyNumbers[i5] * 5);
      uglyNumbers[i] = nextUglyNumber;
      if (nextUglyNumber == uglyNumbers[i2] * 2) {
        i2++;
      }
      if (nextUglyNumber == uglyNumbers[i3] * 3) {
        i3++;
      }
      if (nextUglyNumber == uglyNumbers[i5] * 5) {
        i5++;
      }
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
