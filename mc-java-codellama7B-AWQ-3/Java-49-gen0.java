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

    int energy = 0;
    int currentLength = 1;
    int maxLength = 1;

    for (int i = 0; i < s.length(); i++) {
      currentLength = 1;

      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(j) == s.charAt(i)) {
          currentLength++;
        } else {
          break;
        }
      }

      maxLength = Math.max(currentLength, maxLength);
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