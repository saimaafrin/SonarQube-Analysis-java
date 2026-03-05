import java.util.*;

class Problem {
    /**
     * Given a number of case-sensitive strings, finds the largest string X, such that either X, or its inverse can be found as a substring of any of the given strings.
     * 
     * Example:
     * >>> findLargestSubstring(Arrays.asList("ABCD", "BCDFF", "BRCD"))
     * 2
     * >>> findLargestSubstring(Arrays.asList("rose", "orchid"))
     * 2
     */
    public int findLargestSubstring(List<String> strings)  {
        int longestSubstring = 0;
        for (String s1 : strings) {
            for (String s2 : strings) {
                if (s1.equals(s2)) {
                    continue;
                }
                int start = s1.indexOf(s2);
                if (start >= 0) {
                    longestSubstring = Math.max(longestSubstring, s2.length());
                }
                start = s2.indexOf(s1);
                if (start >= 0) {
                    longestSubstring = Math.max(longestSubstring, s2.length());
                }
            }
        }
        return longestSubstring;
    }
    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.findLargestSubstring(Arrays.asList("ABCD", "BCDFF", "BRCD")) == 2;
        assert solution.findLargestSubstring(Arrays.asList("rose", "orchid")) == 2;
        assert solution.findLargestSubstring(Arrays.asList("hello", "world")) == 1;
        System.out.println("All tests passed");
    }
}