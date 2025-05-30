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
        // if the length of the string is less than k, return false
        if (s.length() < k) return false;

        // count to store the counts of all substrings of length k
        int count = 0;

        // substring of length k in s
        Set<String> subs = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            subs.add(s.substring(i, i + k));
        }

        // if the count of all substrings of length k is less than 2^k, return false
        if (subs.size() < 2 ^ k) return false;

        // if all substrings of length k are in s, return true
        return true;
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