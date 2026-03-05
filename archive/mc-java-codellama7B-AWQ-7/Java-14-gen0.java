class Problem {
    /**
     * Search for the target value in the rotated sorted array.
     * If the target value exists, return its index; otherwise, return -1.
     * The array nums is rotated at some unknown pivot k, where 0 <= k < nums.length.
     * The time complexity of the algorithm must be O(log n).
     * 
     * >>> search(new int[]{4,5,6,7,0,1,2}, 0)
     * 4
     * >>> search(new int[]{4,5,6,7,0,1,2}, 3)
     * -1
     * >>> search(new int[]{1}, 0)
     * -1
     */
    public int search(int[] nums, int target)  {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) return m;
            if (nums[m] >= nums[l]) {
                if (nums[l] <= target && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m] <= target && target < nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.search(new int[]{4,5,6,7,0,1,2}, 6) == 2;
        assert solution.search(new int[]{4,5,6,7,0,1,2}, 7) == 3;
        assert solution.search(new int[]{1, 3}, 3) == 1;
        System.out.println("All tests passed");
    }
}