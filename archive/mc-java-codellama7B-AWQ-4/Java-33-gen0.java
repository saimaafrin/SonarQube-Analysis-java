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
        if (n <= 0 || k <= 0) return "";
        char[] arr = new char[n];
        for (int i = 0, j = k - 1; i < n; i++) {
            arr[i] = (char) (j % 26 + 'a');
            j /= 26;
        }
        return new String(arr);
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