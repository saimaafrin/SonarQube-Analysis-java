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
        // Find all possible substrings
        Set<String> substrings = new HashSet<String>();
        for (String str : strings) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    substrings.add(str.substring(i, j+1));
                }
            }
        }

        // Find the longest substring that can be found in at least one of the strings
        int longest = 0;
        for (String str : strings) {
            for (String substr : substrings) {
                if (str.contains(substr)) {
                    longest = Math.max(longest, substr.length());
                    break;
                }
            }
        }

        return longest;
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