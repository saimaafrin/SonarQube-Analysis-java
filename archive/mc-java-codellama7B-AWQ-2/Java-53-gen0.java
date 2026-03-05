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
    // Split the input string into an array of words
    String[] words = s.split(" ");
    // Reverse the order of the words in the array
    String[] reversedWords = new String[words.length];
    int i = 0;
    for (String word : words) {
      reversedWords[i++] = new StringBuilder(word).reverse().toString();
    }
    // Join the words back into a string
    String reversedString = String.join(" ", reversedWords);
    return reversedString;
  }
  public static void main(String[] args) {
    assert reverseWords("The quick brown fox").equals("ehT kciuq nworb xof") : "Test failed for input: The quick brown fox";
    assert reverseWords("Hello World").equals("olleH dlroW") : "Test failed for input: Hello World";
    assert reverseWords("a b c d e f").equals("a b c d e f") : "Test failed for input: a b c d e f";
    System.out.println("All tests passed");
  }
}