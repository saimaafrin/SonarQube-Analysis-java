class Problem {
    /**
     * Given a list of logs representing folder operations,
     * return the minimum number of steps required to return to the main folder.
     *
     * Example:
     * Input: logs = ["d1/","d2/","../","d21/","./"]
     * Output: 2
     * Explanation: Perform the "../" operation twice to return to the main folder.
     *
     * Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
     * Output: 3
     *
     * Input: logs = ["d1/","../","../","../"]
     * Output: 0
     */
  public int minOperations(String[] logs)  {
    int count = 0;
    Stack<String> stack = new Stack<>();
    stack.push("");
    for (String log : logs) {
      String[] tokens = log.split("/");
      for (String token : tokens) {
        if (token.equals("..")) {
          if (!stack.isEmpty()) stack.pop();
        } else if (!token.equals("")) {
          stack.push(token);
        }
      }
    }
    return stack.size() - 1;
  }
  public static void main(String[] args) {
    Problem solution = new Problem();

    // Test the function with different test cases
    assert solution.minOperations(
      new String[] { "d1/", "d2/", "../", "d21/", "./", "../" }
    ) ==
    1;
    assert solution.minOperations(
      new String[] { "d1/", "d2/", "./", "d3/", "../", "d31/", "../" }
    ) ==
    2;
    assert solution.minOperations(
      new String[] { "d1/", "../", "../", "../", "d2/" }
    ) ==
    1;
    System.out.println("All tests passed");
  }
}