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
    int[][] horizontal = new int[m][n];
    int[][] vertical = new int[m][n];
    int[][] diagonal = new int[m][n];
    int[][] antiDiagonal = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1) {
          horizontal[i][j] = (j > 0 ? horizontal[i][j-1] : 0) + 1;
          vertical[i][j] = (i > 0 ? vertical[i-1][j] : 0) + 1;
          diagonal[i][j] = (i > 0 && j > 0 ? diagonal[i-1][j-1] : 0) + 1;
          antiDiagonal[i][j] = (i > 0 && j < n - 1 ? antiDiagonal[i-1][j+1] : 0) + 1;
        }
      }
    }

    int max = 0;
    for (int[] row : horizontal) {
      for (int val : row) {
        max = Math.max(max, val);
      }
    }

    for (int[] row : vertical) {
      for (int val : row) {
        max = Math.max(max, val);
      }
    }

    for (int[] row : diagonal) {
      for (int val : row) {
        max = Math.max(max, val);
      }
    }

    for (int[] row : antiDiagonal) {
      for (int val : row) {
        max = Math.max(max, val);
      }
    }

    return max;
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