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

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                minHeap.offer(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            int index = minHeap.poll();
            char c = (char) (index + 'a');
            int times = count[index];
            while (times-- > 0) {
                sb.append(c);
            }
            if (!minHeap.isEmpty()) {
                int nextIndex = minHeap.peek();
                while (nextIndex > index) {
                    int next = minHeap.poll();
                    minHeap.offer(next);
                    nextIndex = next;
                }
            }
        }

        for (int i = 25; i >= 0; i--) {
            if (count[i] > 0) {
                char c = (char) (i + 'a');
                int times = count[i];
                while (times-- > 0) {
                    sb.append(c);
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