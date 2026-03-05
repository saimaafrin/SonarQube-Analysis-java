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
    // Create a HashMap to store the frequency of elements
    HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
    int sum = 0;

    // Loop through the array
    for(int num: nums) {
      // If the element is not in the map, add it to the sum
      if(freqMap.get(num) == null) {
        freqMap.put(num, 1);
        sum += num;
      }
      // If the element is in the map, increment its frequency
      else {
        freqMap.put(num, freqMap.get(num) + 1);
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