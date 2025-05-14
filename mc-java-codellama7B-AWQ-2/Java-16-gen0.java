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
    // write your code here
    if (arr.length <= 1) {
      return false;
    }
    // O(n)
    Set<Integer> set = new HashSet<>();
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      set.add(arr[i]);
    }

    if (set.size() != k) {
      return false;
    }

    // O(n*logn)
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      int num = arr[i];
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    // O(k*logk)
    Map<Integer, Integer> countMap = new HashMap<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int num = entry.getKey();
      int count = entry.getValue();
      if (countMap.containsKey(num)) {
        countMap.put(num, countMap.get(num) + count);
      } else {
        countMap.put(num, count);
      }
    }

    // O(k)
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      int num = entry.getKey();
      int count = entry.getValue();
      if (count % 2 != 0) {
        return false;
      }
      int target = count / 2;
      if (!map.containsKey(num)) {
        return false;
      }
      int currentCount = map.get(num);
      if (currentCount < target) {
        return false;
      }
      map.put(num, currentCount - target);
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