class Problem {

  /**
   * Reverse the characters of each word in the given string while maintaining the original word order.
   *
   * @param s The input string containing words separated by spaces.
   * @return The string with characters of each word reversed.
   *
   * Example:
   * reverseWords("Mr Ding")
   * Output: "rM gniD"
   */
  public static String reverseWords(String s)  {
    // Write your solution here
    String[] words = s.split(" ");
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      if (str.length() > 0) {
        str.append(" ");
      }
      String word = words[i];
      for (int j = word.length() - 1; j >= 0; j--) {
        str.append(word.charAt(j));
      }
    }
    return str.toString();
  }
  public static void main(String[] args) {
    assert reverseWords("The quick brown fox").equals("ehT kciuq nworb xof") : "Test failed for input: The quick brown fox";
    assert reverseWords("Hello World").equals("olleH dlroW") : "Test failed for input: Hello World";
    assert reverseWords("a b c d e f").equals("a b c d e f") : "Test failed for input: a b c d e f";
    System.out.println("All tests passed");
  }
}