import java.util.*;

class Problem {
    /**
     * Check if it is possible to split the given integer array into two non-empty arrays
     * with the same average.
     *
     * >>> splitArraySameAverage(new int[]{1,2,3,4,5,6,7,8})
     * true
     *
     * >>> splitArraySameAverage(new int[]{3,1})
     * false
     */
    public boolean splitArraySameAverage(int[] nums)  {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % 2 == 0) { // if the length is even, it can't be split into two equal parts
                if (sum / 2 % i == 0 && sum / 2 % (nums.length - i) == 0) {
                    return true;
                }
            } else { // if the length is odd, it can be split into two equal parts
                if (sum / 2 % i == 0 && sum / 2 % (nums.length - i - 1) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}) == true;
        assert solution.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 9}) == false;
        assert solution.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 10}) == true;
        assert solution.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}) == true;
        System.out.println("All tests passed");
    }
}