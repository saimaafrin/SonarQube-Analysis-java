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
    int rows = mat.length;
    int cols = mat[0].length;

    int result = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] == 0) continue;

        int left = 0, right = 0, top = 0, down = 0;

        while (i - left > 0 && mat[i - left][j] == 1) left++;
        while (j - left > 0 && mat[i][j - left] == 1) left++;

        while (i + right < rows && mat[i + right][j] == 1) right++;
        while (j + right < cols && mat[i][j + right] == 1) right++;

        while (i - top > 0 && j - top > 0 && mat[i - top][j - top] == 1) top++;
        while (i + down < rows && j + down < cols && mat[i + down][j + down] == 1) down++;

        result = Math.max(result, left + right + top + down + 1);
      }
    }

    return result;
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