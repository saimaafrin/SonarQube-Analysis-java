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
    String str = Integer.toString(n);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      sb.append(str.charAt(i));
      if (i > 0 && (i + 1) % 3 == 0) {
        sb.append('.');
      }
    }
    return sb.toString();
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