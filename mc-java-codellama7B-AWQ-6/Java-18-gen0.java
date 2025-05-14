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
        int size = s.length();
        if (size <= 1)
            return s;

        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        char[] result = new char[size];
        int i = 0;
        int j = size - 1;
        while (i < size) {
            char c = ' ';
            int count = Integer.MAX_VALUE;
            for (int k = 0; k < 26; k++) {
                if (counts[k] < count) {
                    count = counts[k];
                    c = (char) (k + 'a');
                }
            }

            result[i++] = c;
            counts[c - 'a']--;

            c = ' ';
            count = Integer.MAX_VALUE;
            for (int k = 0; k < 26; k++) {
                if (counts[k] < count) {
                    count = counts[k];
                    c = (char) (k + 'a');
                }
            }

            result[j--] = c;
            counts[c - 'a']--;
        }

        return String.valueOf(result);
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