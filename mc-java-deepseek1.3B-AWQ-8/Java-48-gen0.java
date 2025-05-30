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
      return 0;
    }

    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;

    int next = 0;
    int i2 = 0, i3 = 0, i5 = 0;

    while (next < n) {
      int next2 = uglyNumbers[i2] * 2;
      int next3 = uglyNumbers[i3] * 3;
      int next5 = uglyNumbers[i5] * 5;

      int min = Math.min(next2, Math.min(next3, next5));

      if (next2 == min) i2++;
      if (next3 == min) i3++;
      if (next5 == min) i5++;

      uglyNumbers[next] = min;
      next++;
   
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
