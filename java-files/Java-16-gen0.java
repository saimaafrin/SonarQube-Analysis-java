import java.lang.*;
import java.util.*;

class Problem {
    /**
     * Check if it is possible to divide the array into n/2 pairs such that the sum of each pair is divisible by k.
     *
     * @param arr the input integer array
     * @param k the divisor
     * @return true if it is possible, false otherwise
     *
     * Example:
     * Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
     * Output: true
     * Explanation: The pairs are (1,9), (2,8), (3,7), (4,6), (5,10), and the sum of each pair is divisible by 5.
     *
     * Input: arr = [1,2,3,4,5,6], k = 7
     * Output: true
     * Explanation: The pairs are (1,6), (2,5), (3,4), and the sum of each pair is divisible by 7.
     *
     * Input: arr = [1,2,3,4,5,6], k = 10
     * Output: false
     * Explanation: It is not possible to divide the array into n/2 pairs such that the sum of each pair is divisible by 10.
     */
  public boolean canArrange(int[] arr, int k)  {
    Map<Integer, Integer> map = new HashMap<>();
    int n = arr.length;

    // count the frequency of each remainder in the array
    for (int num : arr) {
      map.put(num % k, map.getOrDefault(num % k, 0) + 1);
    }

    // if k is 0, then we can always arrange arr[::2] with arr[1::2]
    if (k == 0) {
      for (int count : map.values()) {
        if (count % 2 != 0) {
          return false;
        }
     
        if (count == 0) {
          continue;
        }

        if (count == 1) {
          return false;
        }
      }

      return true;
    }

    // if k is not 0, then we can't arrange arr[::2] with arr[1::2]
    if (map.getOrDefault(0, 0) % 2 != 0 || map.getOrDefault(0, 1) != 1) {
      return false;
    }

    // check if there are any number pairs which are divisible by k
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getKey() == 0 || entry.getKey() == k || (entry.getKey() > 0 && k % entry.getKey() == 0)) {
        // if the count of the remainder in the array is odd, or there are more numbers than can be divided by the remainder
        if (entry.getValue() % 2 != 0 || entry.getValue() > map.getOrDefault(k - entry.getKey(), 0)) {
          return false;
        }
      }
    }

    return true;
  }
  public static void main(String[] args) {
    Problem solution = new Problem();

    // Test the function with different test cases
    assert solution.canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5) == true;
    assert solution.canArrange(new int[]{1,2,3,4,5,6}, 7) == true;
    assert solution.canArrange(new int[]{1,2,3,4,5,6}, 10) == false;
    System.out.println("All tests passed");
  }
}