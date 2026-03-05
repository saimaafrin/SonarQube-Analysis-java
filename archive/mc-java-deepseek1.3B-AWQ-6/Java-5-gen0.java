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
        int max = 0;
        Set<String> allStrings = new HashSet<>();

        for (String string : strings) {
            for (int i = 0; i < string.length(); i++) {
                String str = string;
                String rev = new StringBuilder(str).reverse().toString();
                allStrings.add(str);
                allStrings.add(rev);
           
            }
       
        }

        for (String string : strings) {
            if (allStrings.contains(string)) {
                max = Math.max(max, string.length());
            }
        }

        return max;
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