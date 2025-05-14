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
    // Edge case
    if (s.length() < k) return false;

    // Create a set to store substrings
    Set<String> substrings = new HashSet<>();

    // Iterate over the string s
    for (int i = 0; i <= s.length() - k; i++) {
      // Get the substring
      String substring = s.substring(i, i + k);

      // If the substring is not in the set, add it to the set
      if (!substrings.contains(substring)) {
        substrings.add(substring);
      }
    }

    // If the set has exactly 2^k elements, return true
    return substrings.size() == (int) Math.pow(2, k);
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