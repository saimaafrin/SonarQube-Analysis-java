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
        StringBuffer sb = new StringBuffer();
        int pos = 0;
        int len = 0;
        char c = 'a';
        while (len < n) {
            if (pos < k) {
                sb.append(c);
                len++;
                pos++;
            } else {
                pos += (int)Math.pow(26, len);
            }
            c++;
            if (c > 'z') {
                c = 'a';
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