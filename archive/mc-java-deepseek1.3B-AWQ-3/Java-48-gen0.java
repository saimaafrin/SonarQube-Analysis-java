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

    int[] ugly = new int[n];
    ugly[0] = 1;

    int i2 = 0, i3 = 0, i5 = 0;
    int next_multiple_of_2 = 2;
    int next_multiple_of_3 = 3;
    int next_multiple_of_5 = 5;

    for (int i = 1; i < n; i++) {
      ugly[i] = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));

      if (ugly[i] == next_multiple_of_2) {
        i2 += 1;
        next_multiple_of_2 = ugly[i2] * 2;
      }

      if (ugly[i] == next_multiple_of_3) {
        i3 += 1;
        next_multiple_of_3 = ugly[i3] * 3;
     
      }

      if (ugly[i] == next_multiple_of_5) {
        i5 += 1;
        next_multiple_of_5 = ugly[i5] * 5;
      }
    }

    return ugly[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
