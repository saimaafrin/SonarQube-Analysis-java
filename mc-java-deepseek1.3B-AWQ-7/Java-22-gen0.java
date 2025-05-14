import java.util.*;

class Problem {
    /**
     * Given a binary string s and an integer k, return true if every binary string of length k is a substring of s, or false otherwise.
     *
     * Example 1:
     * Input: s = "00110110", k = 2
     * Output: true
     * Explanation: All binary strings of length 2 ("00", "01", "10", and "11") are substrings of s.
     *
     * Example 2:
     * Input: s = "0110", k = 1
     * Output: true
     * Explanation: All binary strings of length 1 ("0" and "1") are substrings of s.
     *
     * Example 3:
     * Input: s = "0110", k = 2
     * Output: false
     * Explanation: The binary string "00" is not a substring of s.
     */
  public boolean hasAllCodes(String s, int k)  {
        // This problem can be solved using sliding window and a hashset data structure.
        // First, we need to understand how to find all substrings in a binary string.
        // We can use a sliding window technique to find all substrings of length 'k' in the binary string 's'.
        // Then, we will use a hashset to store all possible substrings. If the hashset size is equal to 2^k, it means all substrings of length 'k' are present in the hashset.

        if (s.length() < k) return false;

        // create a hashset to store all possible substrings
        Set<String> subs = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            subs.add(s.substring(i, i + k));
        }

        // if the size of the hashset is not equal to 2^k, then return false
        return subs.size() == (1 << k);
    }
  public static void main(String[] args) {
    Problem solution = new Problem();

    // Test the function with different test cases
    assert solution.hasAllCodes("00110110", 3) == false;
    assert solution.hasAllCodes("00110110", 2) == true;
    assert solution.hasAllCodes(
      "1111111111111111111111111111111111111111111111111111111111111111",
      1
    ) ==
    false;
    System.out.println("All tests passed");
  }
}