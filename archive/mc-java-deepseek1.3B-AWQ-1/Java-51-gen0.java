import java.util.HashMap;

class Problem {

  /**
   * Calculate the sum of unique elements in the given integer array.
   *
   * @param nums An array of integers.
   * @return The sum of unique elements.
   *
   * Example:
   * calculateUniqueSum(new int[]{1, 2, 3, 2})
   * Output: 4
   */
  public static int calculateUniqueSum(int[] nums)  {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int sum = 0;

    for (int num : nums) {
      if (hashMap.containsKey(num)) {
        hashMap.put(num, hashMap.get(num) + 1);
      } else {
        hashMap.put(num, 1);
      }
    }

    for (Integer key : hashMap.keySet()) {
      if (hashMap.get(key) == 1) {
        sum += key;
      }
    }

    return sum;
  }
  public static void main(String[] args) {
    assert calculateUniqueSum(new int[] { 1, 4, 5, 1, 2, 4 }) == 7; // Test Case 1
    assert calculateUniqueSum(new int[] { 0, 0, 0, 0 }) == 0; // Test Case 2
    assert calculateUniqueSum(new int[] { -1, -2, -3, -2 }) == -4; // Test Case 3

    System.out.println("All tests passed");
  }
}