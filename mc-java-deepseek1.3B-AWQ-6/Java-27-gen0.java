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
        int size = nums.length;
        if (size == 0) return 0;

        int max = nums[0], min = nums[0], globalMax = nums[0];

        for (int i = 1; i < size; i++) {
            int current = nums[i];

            int tempMax = Math.max(current, Math.max(max + current, min));
            min = Math.min(current, Math.min(max + current, min));
            max = tempMax;

            if (max > globalMax) {
                globalMax = max;
            }
        }

        return globalMax;
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