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
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int maxAbs = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] + maxSoFar > 0){
                maxSoFar = nums[i] + maxSoFar > 0 ? nums[i] + maxSoFar : 0;
           
            }else{
                maxSoFar = nums[i];
            }
            
            if(nums[i] + minSoFar < 0){
                minSoFar = nums[i] + minSoFar < 0 ? nums[i] + minSoFar : 0;
            }else{
                minSoFar = nums[i];
           
            }
            
            maxAbs = Math.max(maxAbs, Math.max(maxSoFar, minSoFar));
        }
        return maxAbs;
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