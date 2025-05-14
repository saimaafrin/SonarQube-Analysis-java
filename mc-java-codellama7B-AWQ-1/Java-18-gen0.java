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
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int c : count) {
            min = Math.min(min, c);
            max = Math.max(max, c);
        }
        char[] ans = new char[s.length()];
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char c = (char) (min + 97);
            while (count[c - 'a'] == 0) c++;
            ans[start++] = c;
            while (start < end) {
                char d = (char) (max + 97);
                while (d == c || count[d - 'a'] == 0) d--;
                ans[end--] = d;
            }
            if (start < end) {
                char d = (char) (max + 97);
                while (d == c || count[d - 'a'] == 0) d--;
                ans[start++] = d;
            }
            if (start < end) {
                char c1 = (char) (min + 97);
                while (c1 == d || count[c1 - 'a'] == 0) c1++;
                ans[end--] = c1;
            }
        }
        return new String(ans);
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