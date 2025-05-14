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
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            String rev = new StringBuilder(s).reverse().toString();
            map.put(s, s.length());
            map.put(rev, s.length());
        }

        int largest = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getKey();
            String rev = entry.getValue();
            for (String string : strings) {
                if (string.contains(s) || string.contains(rev)) {
                    largest = Math.max(largest, s.length());
                    break;
                }
            }
        }
        return largest;
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