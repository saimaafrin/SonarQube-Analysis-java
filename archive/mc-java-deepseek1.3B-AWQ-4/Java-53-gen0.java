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
    // Initialize an empty StringBuilder
    StringBuilder sb = new StringBuilder();

    // Split the input string into words
    String[] words = s.split(" ");

    // For each word in the words array
    for (String word : words) {
      // Append the reversed word to the StringBuilder
      sb.append(new StringBuilder(word).reverse().toString());

      // Append a space to separate the words
      sb.append(" ");
   
    }

    // Return the resulting string after removing the last space
    return sb.toString().substring(0, sb.length() - 1);
  }
  public static void main(String[] args) {
    assert reverseWords("The quick brown fox").equals("ehT kciuq nworb xof") : "Test failed for input: The quick brown fox";
    assert reverseWords("Hello World").equals("olleH dlroW") : "Test failed for input: Hello World";
    assert reverseWords("a b c d e f").equals("a b c d e f") : "Test failed for input: a b c d e f";
    System.out.println("All tests passed");
  }
}