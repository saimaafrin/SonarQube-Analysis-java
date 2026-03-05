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
        // write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                // in the left part
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                // in the right part
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
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