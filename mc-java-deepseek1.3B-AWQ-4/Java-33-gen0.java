import java.util.*;

class Problem {
    /**
     * Return the lexicographically smallest string of length n and value k.
     * The value of a string is the sum of the positions of its characters in the alphabet (starting from 1).
     * Example:
     * >>> getSmallestString(3, 27)
     * "aay"
     * >>> getSmallestString(5, 73)
     * "aaszz"
     */
    public String getSmallestString(int n, int k)  {
        StringBuilder sb = new StringBuilder();
        k = 26 - k; // we are adding 1 at the end to make it lexicographically smallest
        while (n > 0) {
            if (n == 1) {
                sb.insert(0, (char) ('a' + k - 1));
                n--;
            } else {
                if (k > 26) {
                    sb.insert(0, (char) ('z'));
                    k -= 26;
                } else {
                    sb.insert(0, (char) ('a' + k - 1));
                    k = 0;
                }
                n--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.getSmallestString(3, 27).equals("aay");
        assert solution.getSmallestString(5, 73).equals("aaszz");
        assert solution.getSmallestString(3, 30).equals("acz");
        System.out.println("All tests passed");
    }
}