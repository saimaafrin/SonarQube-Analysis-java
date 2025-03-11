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
      int res = 0;
      for (String log: logs) {
          if (log.equals("../")) {
              if (res > 0) {
                  res -= 1;
              }
          } else if (!log.equals("./")) {
              res += 1;
          }
      }
      return res;
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