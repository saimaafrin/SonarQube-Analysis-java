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
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : strings) {
            String reverse = new StringBuilder(s).reverse().toString();
            if (map.containsKey(reverse)) {
                if (s.length() + map.get(reverse) > maxLength) {
                    maxLength = s.length() + map.get(reverse);
                }
           
            } else {
                map.put(s, s.length());
            }
           
            if (map.containsKey(reverse)) {
                if (map.get(reverse) + s.length() > maxLength) {
                    maxLength = map.get(reverse) + s.length();
                }
            } else {
                map.put(reverse, s.length());
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