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
        int result = 0;
        for (int num : nums) {
            result = Math.max(result, num);
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += nums[k];
                }
                result = Math.max(result, temp);
            }
        }
        return result;
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