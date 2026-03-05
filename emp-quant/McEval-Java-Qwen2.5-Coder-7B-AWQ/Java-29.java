class Problem {
    /**
     * Given two positive integers n and k, find the kth factor of n.
     * A factor of n is a positive integer that divides n evenly.
     * Return the kth factor in ascending order. If n has less than k factors, return -1.
     *
     * Example 1:
     * Input: n = 12, k = 3
     * Output: 3
     * Explanation: The factors of 12 are [1, 2, 3, 4, 6, 12]. The 3rd factor is 3.
     *
     * Example 2:
     * Input: n = 7, k = 2
     * Output: 7
     * Explanation: The factors of 7 are [1, 7]. The 2nd factor is 7.
     *
     * Example 3:
     * Input: n = 4, k = 4
     * Output: -1
     * Explanation: The factors of 4 are [1, 2, 4]. There is no 4th factor, so we return -1.
     */
    public int kthFactor(int n, int k)  {
        // Initialize a counter for factors found
        int count = 0;
        
        // Iterate through possible factors from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // Increment the factor count
                count++;
                // Check if this is the kth factor
                if (count == k) {
                    // Return the kth factor
                    return i;
                }
            }
        }
        
        // If fewer than k factors were found, return -1
        return -1;
    }
    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.kthFactor(100, 3) == 4;
        assert solution.kthFactor(15, 4) == 15;
        assert solution.kthFactor(30, 18) == -1;
        System.out.println("All tests passed");
    }
}