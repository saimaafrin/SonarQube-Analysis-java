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
    int uglyNumberIndex = 1;
    int[] primes = new int[] {2, 3, 5};
    int[] primeIndex = new int[] {0, 0, 0};

    while (uglyNumberIndex < n) {
      int min = Math.min(uglyNumbers[uglyNumberIndex - 1] * primes[0],
                         Math.min(uglyNumbers[uglyNumberIndex - 1] * primes[1],
                                  uglyNumbers[uglyNumberIndex - 1] * primes[2]));
      uglyNumbers[uglyNumberIndex] = min;
      uglyNumberIndex++;

      for (int i = 0; i < 3; i++) {
        if (uglyNumbers[uglyNumberIndex - 1] == min) {
          primeIndex[i]++;
        }
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
