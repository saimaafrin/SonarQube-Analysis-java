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
    if (n <= 0) return 0;
    int[] nums = new int[n];
    nums[0] = 1;
    int idx2 = 0, idx3 = 0, idx5 = 0;
    for (int i = 1; i < n; i++) {
      int curr = Math.min(nums[idx2] * 2, Math.min(nums[idx3] * 3, nums[idx5] * 5));
      if (curr == nums[idx2] * 2) idx2++;
      if (curr == nums[idx3] * 3) idx3++;
      if (curr == nums[idx5] * 5) idx5++;
      nums[i] = curr;
    }
    return nums[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
