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
        char[] s = new char[n];
        int start = 'a' - 1, end = 'z' - 1;
        for (int i = 0; i < n; i++) {
            int pos = k % (end - start + 1) + start;
            s[i] = (char) pos;
            k = (k - pos) / (end - start + 1);
        }
        return new String(s);
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