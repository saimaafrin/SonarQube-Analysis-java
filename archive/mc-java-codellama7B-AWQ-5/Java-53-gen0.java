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
    if (s.isEmpty()) {
      return "";
    }

    StringBuilder result = new StringBuilder();
    StringBuilder word = new StringBuilder();
    boolean lastWasSpace = true;
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        if (!word.toString().isEmpty()) {
          result.append(reverseWord(word));
          word = new StringBuilder();
          lastWasSpace = true;
        } else if (!lastWasSpace) {
          result.append(' ');
          lastWasSpace = true;
        }
      } else {
        word.append(c);
        lastWasSpace = false;
      }
    }

    if (!word.toString().isEmpty()) {
      result.append(reverseWord(word));
    }

    return result.toString();
  }
  public static void main(String[] args) {
    assert reverseWords("The quick brown fox").equals("ehT kciuq nworb xof") : "Test failed for input: The quick brown fox";
    assert reverseWords("Hello World").equals("olleH dlroW") : "Test failed for input: Hello World";
    assert reverseWords("a b c d e f").equals("a b c d e f") : "Test failed for input: a b c d e f";
    System.out.println("All tests passed");
  }
}