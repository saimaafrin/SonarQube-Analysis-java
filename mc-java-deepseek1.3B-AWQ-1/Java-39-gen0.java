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
    while (num >= 10) {
      num = num / 10 + num % 10;
   
      // The process can be described as below.
      // If num is 38, then num % 10 gives the last digit which is 8.
      // num / 10 gives the first digit which is 3.
      // So, we add these two to get 38 / 10 which is 3 and add 8 to get 38 % 10 which is 8,
      // which gives us 38 / 10 which is 3 which is the first digit.
      // So, the final digit will be 3 + 8 = 9.
    }
    return num;
  }
  public static void main(String[] args) {
    assert addDigits(123) == 6 : "Test case 1 failed";
    assert addDigits(59) == 5 : "Test case 2 failed";
    assert addDigits(0) == 0 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}