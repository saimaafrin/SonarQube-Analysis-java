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
    // sort the array in non-increasing order
    Arrays.sort(arr);
    // keep track of the sum of all pairs
    int sum = 0;
    // keep track of the current sum
    int currSum = 0;
    // loop through the array
    for (int i = 0; i < arr.length; i++) {
      // update the current sum
      currSum += arr[i];
      // check if the current sum is divisible by k
      if (currSum % k == 0) {
        // update the total sum
        sum += currSum;
        // set the current sum back to 0
        currSum = 0;
      }
    }
    // check if the total sum is divisible by k
    return sum % k == 0;
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