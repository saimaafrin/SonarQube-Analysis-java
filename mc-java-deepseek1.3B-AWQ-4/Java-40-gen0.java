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
    int max = 0;
    if (mat.length == 0 || mat[0].length == 0) return max;

    int[][] horizontal = new int[mat.length][mat[0].length];
    int[][] vertical = new int[mat.length][mat[0].length];
    int[][] diagonal = new int[mat.length][mat[0].length];
    int[][] antiDiagonal = new int[mat.length][mat[0].length];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (i == 0 || j == 0) horizontal[i][j] = mat[i][j];
        else horizontal[i][j] = mat[i][j] == 1 ? horizontal[i-1][j-1] + 1 : 0;
        vertical[i][j] = mat[i][j] == 1 ? vertical[i-1][j] + 1 : 0;
        diagonal[i][j] = mat[i][j] == 1 ? diagonal[i-1][j-1] + 1 : 0;
        antiDiagonal[i][j] = mat[i][j] == 1 ? antiDiagonal[i-1][j+1] + 1 : 0;
     
        max = Math.max(max, horizontal[i][j]);
        max = Math.max(max, vertical[i][j]);
        max = Math.max(max, diagonal[i][j]);
        max = Math.max(max, antiDiagonal[i][j]);
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