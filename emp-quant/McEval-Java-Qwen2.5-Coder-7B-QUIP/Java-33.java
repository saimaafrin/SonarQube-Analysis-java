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
        // Initialize the result array with 'a' characters
        char[] result = new char[n];
        Arrays.fill(result, 'a');
        
        // Calculate the remaining value to be distributed
        int remaining = k - n;
        
        // Distribute the remaining value to make the string lexicographically smallest
        for (int i = n - 1; i >= 0; i--) {
            if (remaining > 0) {
                result[i] += 1;
                remaining--;
            }
        }
        
        // Convert the array to a string and return
        return new String(result);
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