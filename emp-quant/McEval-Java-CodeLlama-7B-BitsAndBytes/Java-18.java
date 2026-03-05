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
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] count = new int[26];
        for (char c : arr) {
            count[c - 'a']++;
        }
        int[] index = new int[26];
        for (int i = 0; i < 26; i++) {
            index[i] = count[i];
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < n) {
            int min = -1;
            int max = -1;
            for (int i = 0; i < 26; i++) {
                if (index[i] > 0) {
                    if (min == -1 || arr[index[i] - 1] < arr[min - 'a']) {
                        min = index[i];
                    }
                    if (max == -1 || arr[index[i] - 1] > arr[max - 'a']) {
                        max = index[i];
                    }
                }
            }
            if (min != -1) {
                sb.append(arr[min - 1]);
                index[min - 1]--;
            }
            if (max != -1) {
                sb.append(arr[max - 1]);
                index[max - 1]--;
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