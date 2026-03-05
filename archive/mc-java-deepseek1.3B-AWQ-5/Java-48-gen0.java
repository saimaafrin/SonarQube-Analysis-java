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
    int i2 = 0, i3 = 0, i5 = 0;
    uglyNumbers[0] = 1;

    int next = 1;

    for (int i = 1; i < n; i++) {
      while (uglyNumbers[i2] * 2 <= next) i2++;
      while (uglyNumbers[i3] * 3 <= next) i3++;
      while (uglyNumbers[i5] * 5 <= next) i5++;

      uglyNumbers[i] = Math.min(uglyNumbers[i2] * 2, Math.min(uglyNumbers[i3] * 3, uglyNumbers[i5] * 5));

      if (uglyNumbers[i2] * 2 == uglyNumbers[i]) i2++;
      if (uglyNumbers[i3] * 3 == uglyNumbers[i]) i3++;
      if (uglyNumbers[i5] * 5 == uglyNumbers[i]) i5++;
   
    }

    return next;
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
