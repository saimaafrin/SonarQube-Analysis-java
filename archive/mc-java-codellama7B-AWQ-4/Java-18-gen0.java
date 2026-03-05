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
        // 1. 找到最小值
        // 2. 找到第二小的值
        // 3. 找到最大值
        // 4. 找到第二大的值

        int len = s.length();
        String result = "";
        int[] freq = new int[26];

        for (int i = 0; i < len; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int min = 'a', max = 'z';
        int minPos = -1, maxPos = -1;

        for (int i = 0; i < len; i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                if (min == 'z') {
                    minPos = i;
                }
                min = s.charAt(i);
            }
            if (freq[s.charAt(i) - 'a'] == 1) {
                if (max == 'a') {
                    maxPos = i;
                }
                max = s.charAt(i);
            }
        }

        while (minPos != -1 || maxPos != -1) {
            if (minPos != -1) {
                result += (char) min;
                minPos = -1;
                for (int i = 0; i < len; i++) {
                    if (freq[s.charAt(i) - 'a'] == 1) {
                        minPos = i;
                        break;
                    }
                }
                if (minPos != -1) {
                    min = s.charAt(minPos);
                    freq[min - 'a']--;
                    continue;
                }
            }

            if (maxPos != -1) {
                result += (char) max;
                maxPos = -1;
                for (int i = 0; i < len; i++) {
                    if (freq[s.charAt(i) - 'a'] == 1) {
                        maxPos = i;
                        break;
                    }
                }
                if (maxPos != -1) {
                    max = s.charAt(maxPos);
                    freq[max - 'a']--;
                    continue;
                }
            }
        }

        return result;
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