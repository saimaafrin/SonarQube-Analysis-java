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
        int len = nums.length;
        double total = 0;
        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > total) continue;
            double splitSum = (total - nums[i]) / 2;
            double currentSum = nums[i];
            Set<Double> set = new HashSet<>();
            set.add(nums[i]);

            for (int j = i + 1; j < len; j++) {
                if (nums[j] + currentSum > splitSum && !set.contains(nums[j] + currentSum)) {
                    set.add(nums[j]);
                    currentSum += nums[j];
                    if (currentSum == splitSum && set.size() > 1) return true;
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