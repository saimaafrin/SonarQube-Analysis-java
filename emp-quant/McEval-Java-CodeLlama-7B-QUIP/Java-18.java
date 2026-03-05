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
        char[] arr = s.toCharArray();
        int[] freq = new int[256];
        for (int i = 0; i < arr.length(); i++) {
            freq[arr[i]]++;
        }
        int[] small = new int[256];
        int[] large = new int[256];
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                if (small.length == 0) {
                    small[0] = i;
                } else {
                    small[small.length - 1] = i;
                }
            }
            if (freq[i] > 1) {
                if (large.length == 0) {
                    large[0] = i;
                } else {
                    large[large.length - 1] = i;
                }
            }
        }
        int[] result = new int[256];
        int i = 0;
        while (i < small.length) {
            result[i++] = small[i++];
            result[i++] = small[i++];
        }
        i = 0;
        while (i < large.length) {
            result[i++] = large[i++];
            result[i++] = large[i++];
        }
        i = 0;
        while (i < small.length) {
            result[i++] = small[i++];
        }
        i = 0;
        while (i < large.length) {
            result[i++] = large[i++];
        }
        return new String(arr);
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