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
        Map<String, String> stringInverseMap = new HashMap<>();
        for(String str: strings){
            String inverse = new StringBuilder(str).reverse().toString();
            stringInverseMap.put(inverse, str);
        }
        for(String str: strings){
            int length = str.length();
            if(stringInverseMap.containsKey(str)){
                maxLength = Math.max(maxLength, length + str.indexOf(stringInverseMap.get(str)));
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