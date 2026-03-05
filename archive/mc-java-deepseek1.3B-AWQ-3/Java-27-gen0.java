class Problem {
    /**
     * Given an integer array nums, return the maximum absolute sum of any subarray.
     *
     * >>> maxAbsoluteSum(new int[]{1,-3,2,3,-4})
     * 5
     *
     * >>> maxAbsoluteSum(new int[]{2,-5,1,-4,3,-2})
     * 8
     */
    public int maxAbsoluteSum(int[] nums)  {
        int n = nums.length;
        if (n == 0) return 0;

        int globalMax = nums[0], localMax = nums[0], globalMin = nums[0], localMin = nums[0];
        for (int i = 1; i < n; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            localMin = Math.min(nums[i], localMin + nums[i]);

            globalMax = Math.max(globalMax, localMax);
            globalMin = Math.min(globalMin, localMin);
        }
        return Math.max(globalMax, Math.abs(globalMin));
    }
public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.maxAbsoluteSum(new int[]{1,-3,2,3,-4}) == 5;
        assert solution.maxAbsoluteSum(new int[]{2,-5,1,-4,3,-2}) == 8;
        assert solution.maxAbsoluteSum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}) == 7;
        System.out.println("All tests passed");
    }
}