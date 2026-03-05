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
    // Write your solution here.
    int m = mat.length;
    int n = mat[0].length;
    int max = 0;
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        if(mat[i][j] == 1) {
          int row = i;
          int col = j;
          int len = 1;
          while(row >= 0 && col < n && mat[row][col] == 1) {
            row--;
            col++;
            len++;
          }
          row = i;
          col = j;
          while(row < m && col >= 0 && mat[row][col] == 1) {
            row++;
            col--;
            len++;
          }
          row = i;
          col = j;
          while(row >= 0 && col < n && mat[row][col] == 1) {
            row--;
            col++;
            len++;
          }
          row = i;
          col = j;
          while(row < m && col >= 0 && mat[row][col] == 1) {
            row++;
            col--;
            len++;
          }
          max = Math.max(len, max);
        }
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