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
    
    // StringBuilder to hold the result
    StringBuilder result = new StringBuilder();
    
    // Iterate over each word
    for (String word : words) {
      // Convert word to char array and reverse it
      char[] chars = word.toCharArray();
      int left = 0, right = chars.length - 1;
      while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
      }
      
      // Append the reversed word to the result
      result.append(new String(chars)).append(" ");
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