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
        // Initialize an array to keep track of the remainder count
        int[] remainderCount = new int[k];
        
        // Count the number of elements with each remainder
        for (int num : arr) {
            int remainder = num % k;
            if (remainder < 0) {
                remainder += k;  // Make the remainder positive if it's negative
            }
            remainderCount[remainder]++;
        }
        
        // Check if it is possible to form n/2 pairs
        for (int i = 1; i <= k / 2; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }
        
        // If k is even, the pair with remainder 0 should have an even count
        if (k % 2 == 0 && remainderCount[k / 2] % 2 != 0) {
            return false;
        }
        
        // If k is 0 and there are elements with remainder 0
        if (k == 0 && remainderCount[0] % 2 != 0) {
            return false;
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