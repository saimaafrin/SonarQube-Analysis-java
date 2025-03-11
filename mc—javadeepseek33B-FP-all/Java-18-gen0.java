import java.util.*;

class Problem {
    /**
     * Given a string s. You should re-order the string using the following algorithm:
     * 1. Pick the smallest character from s and append it to the result.
     * 2. Pick the smallest character from s which is greater than the last appended character to the result and append it.
     * 3. Repeat step 2 until you cannot pick more characters.
     * 4. Pick the largest character from s and append it to the result.
     * 5. Pick the largest character from s which is smaller than the last appended character to the result and append it.
     * 6. Repeat step 5 until you cannot pick more characters.
     * 7. Repeat the steps from 1 to 6 until you pick all characters from s.
     * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.
     * Return the result string after sorting s with this algorithm.
     */
    public String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        while (s.length() != sb.length()) {
            for (int i = 0; i < c.length; i++) {
                if (i > 0 && c[i] == c[i - 1]) {
                    continue; // avoid duplicated
                }
                if (s.indexOf(c[i]) != -1) {
                    sb.append(c[i]);
                    s = s.replaceFirst(String.valueOf(c[i]), "");
                }
            }
            for (int i = c.length - 1; i >= 0; i--) {
                if (i < c.length - 1 && c[i] == c[i + 1]) {
                    continue; // avoid duplicated
                }
                if (s.indexOf(c[i]) != -1) {
                    sb.append(c[i]);
                    s = s.replaceFirst(String.valueOf(c[i]), "");
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.sortString("aaaabbbbcccc").equals("abccbaabccba");
        assert solution.sortString("rat").equals("art");
        assert solution.sortString("leetcode").equals("cdelotee");
        System.out.println("All tests passed");
    }
}