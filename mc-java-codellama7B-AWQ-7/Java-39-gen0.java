class Problem {

  /**
   * Given a non-negative integer num, repeatedly add all its digits until the result is a single digit. Return the result.
   *
   * @param num The non-negative integer to perform the operation on.
   * @return The single digit result after repeatedly adding all digits.
   *
   * Example:
   * addDigits(38)
   * Output: 2
   */
  public static int addDigits(int num)  {
    if (num == 0) return 0;
    if (num < 10) return num;
    String numStr = String.valueOf(num);
    int result = 0;
    for (char c : numStr.toCharArray()) {
      result += c - '0';
    }
    return result;
  }
  public static void main(String[] args) {
    assert addDigits(123) == 6 : "Test case 1 failed";
    assert addDigits(59) == 5 : "Test case 2 failed";
    assert addDigits(0) == 0 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}