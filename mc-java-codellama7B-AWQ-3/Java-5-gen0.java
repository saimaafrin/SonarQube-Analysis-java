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
        int maxLength = 0;

        for (int i = 0; i < strings.size(); i++) {
            String s1 = strings.get(i);
            String s2 = s1.toLowerCase();

            if (s1.length() != s2.length()) {
                continue;
            }

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    continue;
                }
            }

            if (s1.length() > maxLength) {
                maxLength = s1.length();
            }
        }

        return maxLength;
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