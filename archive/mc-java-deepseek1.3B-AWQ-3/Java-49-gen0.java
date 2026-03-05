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
    int energy = 0;
    int maxLength = 0;
    int[] charCount = new int[256];

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);

      if (charCount[currentChar] != 0) {
        if (charCount[currentChar] <= maxLength) {
          energy++;
        }
        charCount[currentChar] = 0;
     
        maxLength = 0;
      } else {
        charCount[currentChar]++;
        maxLength++;
      }
   
    }

    return energy;
  }
  public static void main(String[] args) {
    // Test cases
    assert calculateEnergy("aabbccdd") == 2 : "Test case 1 failed"; // Contains two characters 'aa', 'bb', 'cc', 'dd'
    assert calculateEnergy("horizon") == 1 : "Test case 2 failed"; // All characters are unique
    assert calculateEnergy("success") == 2 : "Test case 3 failed"; // Contains three characters 'ccc'

    System.out.println("All tests passed");
  }
}