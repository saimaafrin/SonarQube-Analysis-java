class Problem {
    /**
     * Given a string s consisting of lowercase and uppercase English letters,
     * you need to make the string "good".
     * A string is considered "good" if there are no adjacent characters such that
     * one is a lowercase letter and the other is the corresponding uppercase letter.
     * You can choose any adjacent characters in the string and remove them until the string is "good".
     * Return the final "good" string.
     *
     * Example 1:
     * Input: s = "leEeetcode"
     * Output: "leetcode"
     * Explanation: You can remove "Ee" to make "leetcode".
     *
     * Example 2:
     * Input: s = "abBAcC"
     * Output: ""
     * Explanation: There are multiple possible solutions, such as:
     * - Remove "bB" to make "aAcC", then remove "cC" to make "aA", then remove "aA" to make "".
     * - Remove "aA" to make "abBAcC", then remove "bB" to make "aAcC", then remove "cC" to make "aA",
     *   then remove "aA" to make "".
     * No matter the choices, the result is an empty string.
     *
     * Example 3:
     * Input: s = "s"
     * Output: "s"
     * Explanation: The string is already "good".
     */
  public String makeGood(String s)  {
    if (s == null || s.isEmpty()) return "";

    String result = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (i == 0) {
        result += c;
      } else {
        char pre = result.charAt(result.length() - 1);
        if (Character.toLowerCase(c) == Character.toUpperCase(c)) {
          if (Character.toLowerCase(pre) == Character.toUpperCase(pre)) {
            result = result.substring(0, result.length() - 1);
          }
        } else {
          if (Character.toLowerCase(pre) != Character.toUpperCase(pre)) {
            result += c;
          }
        }
      }
    }
    return result;
  }
public static void main(String[] args) {
    Problem solution = new Problem();

    // Test the function with different test cases
    assert solution.makeGood("aAbBcC").equals("");
    assert solution.makeGood("AaBbCc").equals("");
    assert solution.makeGood("abcABC").equals("abcABC");
    System.out.println("All tests passed");
  }
}