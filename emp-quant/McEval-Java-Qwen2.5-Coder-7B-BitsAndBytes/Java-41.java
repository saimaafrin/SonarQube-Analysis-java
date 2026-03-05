class Problem {

  /**
   * Given an integer n, add a dot ('.') as a thousand separator every three digits and return the result as a string.
   *
   * @param n The integer to add thousand separators to.
   * @return The string with thousand separators added.
   *
   * Example:
   * addThousandSeparator(987)
   * Output: "987"
   *
   * Example:
   * addThousandSeparator(1234)
   * Output: "1.234"
   *
   * Example:
   * addThousandSeparator(123456789)
   * Output: "123.456.789"
   *
   * Example:
   * addThousandSeparator(0)
   * Output: "0"
   */
  public static String addThousandSeparator(int n)  {
    // Convert the integer to a string
    String str = Integer.toString(n);

    // Initialize an empty string to store the result
    StringBuilder result = new StringBuilder();

    // Iterate over the string in reverse order
    for (int i = str.length() - 1; i >= 0; i--) {
      // Add the current character to the result
      result.append(str.charAt(i));

      // If we have added three characters, add a dot and reset the counter
      if ((str.length() - i) % 3 == 0 && i != 0) {
        result.append('.');
      }
    }

    // Reverse the result and return it
    return result.reverse().toString();
  }
  public static void main(String[] args) {
    assert "2.147.483.647".equals(
        addThousandSeparator(2147483647)
      ) : "Test case 1 failed";
    assert "10.000".equals(addThousandSeparator(10000)) : "Test case 2 failed";
    assert "999".equals(addThousandSeparator(999)) : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}