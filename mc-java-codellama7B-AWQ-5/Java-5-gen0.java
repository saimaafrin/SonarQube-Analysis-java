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
        if (strings == null || strings.isEmpty()) {
            return 0;
        }

        String largest = strings.get(0);
        int max = 0;
        for (int i = 0; i < strings.size(); i++) {
            String s1 = strings.get(i);
            for (int j = 0; j < strings.size(); j++) {
                if (i == j) {
                    continue;
                }
                String s2 = strings.get(j);
                if (s1.contains(s2) || s2.contains(s1)) {
                    int size = Math.max(s1.length(), s2.length());
                    if (size > max) {
                        max = size;
                        largest = s1;
                    }
                }
            }
        }

        return largest.length();
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