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
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // Try all possible sizes of subsets
        for (int i = 1; i <= n / 2; i++) {
            Set<Integer> subsetSums = new HashSet<>();
            subsetSums.add(0);
            for (int j = 0; j < n; j++) {
                Set<Integer> newSubsetSums = new HashSet<>(subsetSums);
                for (int s : subsetSums) {
                    if (s + nums[j] <= sum) {
                        newSubsetSums.add(s + nums[j]);
                    }
                }
                subsetSums = newSubsetSums;
            }
            
            // Check if there's a subset with the required sum
            if (subsetSums.contains(sum * i / n)) {
                return true;
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