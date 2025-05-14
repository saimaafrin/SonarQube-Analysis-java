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
        if (arr == null || arr.length == 0) return false;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // If k is even and there's no multiple of k in the array then it's impossible
        if (k % 2 == 0 && count.getOrDefault(k, 0) == 0) return false;

        // If the remainder of k/2 is not present in the count, it's also impossible
        if (count.getOrDefault(k / 2, 0) == 0) return false;

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            sum += entry.getKey() * entry.getValue();
       
            // If sum is not divisible by k, it's impossible
            if (sum % k != 0) return false;
        }

        // If sum is divisible by k, count the number of pairs
        int pairCount = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getKey() * 2 == k && entry.getValue() > 1) {
                pairCount += entry.getValue() - 1;
            }
        }

        // If the number of pairs is not divisible by k/2, it's impossible
        if (pairCount % (k / 2) != 0) return false;

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