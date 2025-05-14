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
    int uglyNumber = 0;
    int uglies = 0;
    int ugly1 = 1;
    int ugly2 = 1;
    int ugly3 = 1;
    int[] uglyNumbers = new int[n];

    while (uglies < n) {
      int nextUgly1 = ugly1 * 2;
      int nextUgly2 = ugly2 * 3;
      int nextUgly3 = ugly3 * 5;
      int nextUgly = Math.min(nextUgly1, Math.min(nextUgly2, nextUgly3));

      if (nextUgly == nextUgly1) {
        uglyNumber = nextUgly;
        uglies++;
        ugly1 = nextUgly;
      }

      if (nextUgly == nextUgly2) {
        uglyNumber = nextUgly;
        uglies++;
        ugly2 = nextUgly;
      }

      if (nextUgly == nextUgly3) {
        uglyNumber = nextUgly;
        uglies++;
        ugly3 = nextUgly;
      }
    }

    return uglyNumber;
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
