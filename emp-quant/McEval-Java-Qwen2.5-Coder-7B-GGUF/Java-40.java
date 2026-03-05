class Problem {

  /**
   * Given a binary matrix mat of size m x n, return the length of the longest continuous line of 1s in the matrix.
   * The line could be horizontal, vertical, diagonal, or anti-diagonal.
   *
   * @param mat The binary matrix.
   * @return The length of the longest continuous line of 1s.
   *
   * Example:
   * longestLine(new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,1}})
   * Output: 3
   */
  public static int longestLine(int[][] mat)  {
    if (mat == null || mat.length == 0 || mat[0].length == 0) {
      return 0;
    }

    int m = mat.length;
    int n = mat[0].length;
    int maxLen = 0;

    // Arrays to store the lengths of continuous 1s in different directions
    int[] horizontal = new int[n];
    int[] vertical = new int[m];
    int[] diagonal = new int[m + n - 1];
    int[] antiDiagonal = new int[m + n - 1];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1) {
          // Update horizontal length
          horizontal[j] = (j > 0 ? horizontal[j - 1] : 0) + 1;
          // Update vertical length
          vertical[i] = (i > 0 ? vertical[i - 1] : 0) + 1;
          // Update diagonal length
          diagonal[i + j] = (i > 0 && j > 0 ? diagonal[i + j - 1] : 0) + 1;
          // Update anti-diagonal length
          antiDiagonal[i - j + n - 1] = (i > 0 && j < n - 1 ? antiDiagonal[i - j + n - 2] : 0) + 1;

          // Update the maximum length
          maxLen = Math.max(maxLen, Math.max(horizontal[j], Math.max(vertical[i], Math.max(diagonal[i + j], antiDiagonal[i - j + n - 1]))));
        }
      }
    }

    return maxLen;
  }
  public static void main(String[] args) {
    assert longestLine(
      new int[][] {
        { 1, 1, 0, 0 },
        { 0, 1, 1, 0 },
        { 0, 0, 0, 1 },
        { 1, 0, 0, 0 },
      }
    ) ==
    3;
    assert longestLine(
      new int[][] {
        { 1, 0, 0, 1 },
        { 0, 1, 1, 0 },
        { 1, 1, 0, 0 },
        { 1, 0, 1, 1 },
      }
    ) ==
    4;
    assert longestLine(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }) ==
    1;

    System.out.println("All tests passed");
  }
}