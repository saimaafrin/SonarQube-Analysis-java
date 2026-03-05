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
        int max = 0;
        int sum = 0;
        int maxsum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

            if (max < sum) {
                maxsum = sum;
            }
        }

        return maxsum;
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