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
    // Split the string into words
    String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();

    // Iterate through each word
    for (String word : words) {
      // Reverse the characters of the word
      String reversedWord = new StringBuilder(word).reverse().toString();
      // Append the reversed word to the result
      result.append(reversedWord).append(" ");
    }

    // Remove the trailing space and return the result
    return result.toString().trim();
  }
  public static void main(String[] args) {
    assert reverseWords("The quick brown fox").equals("ehT kciuq nworb xof") : "Test failed for input: The quick brown fox";
    assert reverseWords("Hello World").equals("olleH dlroW") : "Test failed for input: Hello World";
    assert reverseWords("a b c d e f").equals("a b c d e f") : "Test failed for input: a b c d e f";
    System.out.println("All tests passed");
  }
}