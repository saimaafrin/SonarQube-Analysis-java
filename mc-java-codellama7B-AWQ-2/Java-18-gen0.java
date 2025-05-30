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
        if (s.length() == 1) return s;
        PriorityQueue<Character> minQ = new PriorityQueue<>();
        PriorityQueue<Character> maxQ = new PriorityQueue<>(Comparator.reverse());
        for (char c : s.toCharArray()) {
            minQ.add(c);
            maxQ.add(c);
        }
        StringBuilder res = new StringBuilder();
        while (!minQ.isEmpty() && !maxQ.isEmpty()) {
            while (!minQ.isEmpty()) {
                Character min = minQ.poll();
                res.append(min);
                if (minQ.contains(min)) {
                    minQ.remove(min);
                }
            }
            while (!maxQ.isEmpty()) {
                Character max = maxQ.poll();
                res.append(max);
                if (maxQ.contains(max)) {
                    maxQ.remove(max);
                }
            }
        }
        while (!minQ.isEmpty()) {
            Character min = minQ.poll();
            res.append(min);
            if (minQ.contains(min)) {
                minQ.remove(min);
            }
        }
        while (!maxQ.isEmpty()) {
            Character max = maxQ.poll();
            res.append(max);
            if (maxQ.contains(max)) {
                maxQ.remove(max);
            }
        }
        return res.toString();
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