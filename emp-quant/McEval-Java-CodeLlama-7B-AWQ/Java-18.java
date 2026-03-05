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
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        PriorityQueue<Character> min = new PriorityQueue<>();
        PriorityQueue<Character> max = new PriorityQueue<>(Comparator.reverse());
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                min.offer(i + 'a');
                max.offer(i + 'a');
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!min.isEmpty() || !max.isEmpty()) {
            if (!min.isEmpty()) {
                char c = min.poll();
                sb.append(c);
                count[c - 'a']--;
                if (count[c - 'a'] > 0) {
                    min.offer(c);
                }
            }
            if (!max.isEmpty()) {
                char c = max.poll();
                sb.append(c);
                count[c - 'a']--;
                if (count[c - 'a'] > 0) {
                    max.offer(c);
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