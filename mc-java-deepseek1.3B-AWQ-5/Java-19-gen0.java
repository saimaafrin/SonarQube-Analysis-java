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
        for(int num : nums)
            sum += num;

        for(int i = 0; i < n; i++) {
            int remain = sum - nums[i];
            Set<Integer> set = new HashSet<>();
            if(remain % 2 == 0 && (sum - remain / 2) % 2 == 0) {
                set.add(nums[i]);
                remain /= 2;
                for(int j = 0; j < n; j++) {
                    if(set.contains(remain) && (n - j) > 1)
                        return true;
                    if(j != i)
                        set.add(nums[j]);
               
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