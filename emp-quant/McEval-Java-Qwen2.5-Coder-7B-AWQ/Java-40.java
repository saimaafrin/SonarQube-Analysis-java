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

    // Arrays to store the lengths of consecutive 1s in each direction
    int[] horizontal = new int[cols];
    int[] vertical = new int[rows];
    int[] diagonal = new int[rows + cols - 1];
    int[] antiDiagonal = new int[rows + cols - 1];

    int maxLength = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] == 1) {
          // Update horizontal count
          horizontal[j] = (j > 0 ? horizontal[j - 1] : 0) + 1;
          // Update vertical count
          vertical[i] = (i > 0 ? vertical[i - 1] : 0) + 1;
          // Update diagonal count
          diagonal[i + j] = ((i > 0 && j > 0) ? diagonal[i - 1 + j - 1] : 0) + 1;
          // Update anti-diagonal count
          antiDiagonal[i - j + cols - 1] = ((i > 0 && j < cols - 1) ? antiDiagonal[i - 1 - j + cols - 1] : 0) + 1;

          // Update the maximum length found so far
          maxLength = Math.max(maxLength, Math.max(horizontal[j], Math.max(vertical[i], Math.max(diagonal[i + j], antiDiagonal[i - j + cols - 1]))));
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