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
        int maxEndingHere = nums[0], maxEndingSoFar = nums[0];
        int minEndingHere = nums[0], minEndingSoFar = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxEndingSoFar = Math.max(maxEndingSoFar, maxEndingHere);

            minEndingHere = Math.min(nums[i], minEndingHere + nums[i]);
            minEndingSoFar = Math.min(minEndingSoFar, minEndingHere);

            res = Math.max(res, maxEndingSoFar);
       
        }
        return res;
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