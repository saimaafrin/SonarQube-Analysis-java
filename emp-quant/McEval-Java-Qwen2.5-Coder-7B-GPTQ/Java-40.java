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

    int rows = mat.length;
    int cols = mat[0].length;
    int maxLength = 0;

    // Arrays to store the lengths of consecutive 1s in different directions
    int[] horizontal = new int[cols];
    int[] vertical = new int[rows];
    int[] diagonal = new int[rows + cols - 1];
    int[] antiDiagonal = new int[rows + cols - 1];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] == 1) {
          // Update the lengths in all four directions
          horizontal[j]++;
          vertical[i]++;
          diagonal[i + j]++;
          antiDiagonal[i - j + cols - 1]++;

          // Calculate the maximum length so far
          maxLength = Math.max(maxLength, horizontal[j]);
          maxLength = Math.max(maxLength, vertical[i]);
          maxLength = Math.max(maxLength, diagonal[i + j]);
          maxLength = Math.max(maxLength, antiDiagonal[i - j + cols - 1]);
        } else {
          // Reset the lengths when encountering a 0
          horizontal[j] = 0;
          vertical[i] = 0;
          diagonal[i + j] = 0;
          antiDiagonal[i - j + cols - 1] = 0;
        }
      }
    }

    return maxLength;
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