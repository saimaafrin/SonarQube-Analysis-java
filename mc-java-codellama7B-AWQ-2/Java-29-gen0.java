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
        if (n < k)
            return -1;
        if (k == 1)
            return 1;
        if (n % k == 0)
            return k;
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid * k > n)
                high = mid;
            else if (mid * k < n)
                low = mid + 1;
            else
                return mid;
        }
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