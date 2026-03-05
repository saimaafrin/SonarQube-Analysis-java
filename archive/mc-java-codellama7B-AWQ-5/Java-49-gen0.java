class Problem {

  /**
   * Calculate the energy of the string, which is defined as the length of the longest non-empty substring containing only one character.
   *
   * @param s The input string.
   * @return The energy of the string.
   *
   * Example:
   * calculateEnergy("aabbccdd")
   * Output: 2
   */
  public static int calculateEnergy(String s)  {
    if (s == null || s.length() == 0) {
      return 0;
    }

    int maxLength = 0;
    int length = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        length++;
      } else if (c == ')') {
        length--;
      }

      if (length > maxLength) {
        maxLength = length;
      }
    }

    return maxLength;
  }
  public static void main(String[] args) {
    // Test cases
    assert calculateEnergy("aabbccdd") == 2 : "Test case 1 failed"; // Contains two characters 'aa', 'bb', 'cc', 'dd'
    assert calculateEnergy("horizon") == 1 : "Test case 2 failed"; // All characters are unique
    assert calculateEnergy("success") == 2 : "Test case 3 failed"; // Contains three characters 'ccc'

    System.out.println("All tests passed");
  }
}