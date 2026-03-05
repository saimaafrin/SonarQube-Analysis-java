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
        if(n == 0) return 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int max = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] < 0){
                maxSum = Math.max(nums[i], maxSum + nums[i]);
                minSum = Math.min(nums[i], minSum + nums[i]);
           
            }
            else{
                maxSum = Math.max(nums[i], maxSum + nums[i]);
                minSum = Math.min(nums[i], minSum + nums[i]);
            }
            
            max = Math.max(max, maxSum);
        }
        return max;
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