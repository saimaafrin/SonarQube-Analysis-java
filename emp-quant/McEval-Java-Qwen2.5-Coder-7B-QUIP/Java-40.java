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
    int m = mat.length;
    int n = mat[0].length;
    int maxLength = 0;

    // Check horizontal lines
    for (int i = 0; i < m; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1) {
          count++;
        } else {
          maxLength = Math.max(maxLength, count);
          count = 0;
        }
      }
      maxLength = Math.max(maxLength, count);
    }

    // Check vertical lines
    for (int j = 0; j < n; j++) {
      int count = 0;
      for (int i = 0; i < m; i++) {
        if (mat[i][j] == 1) {
          count++;
        } else {
          maxLength = Math.max(maxLength, count);
          count = 0;
        }
      }
      maxLength = Math.max(maxLength, count);
    }

    // Check diagonal lines
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i + 1 < m && j + 1 < n && mat[i][j] == 1) {
          int count = 0;
          while (i + 1 < m && j + 1 < n && mat[i + 1][j + 1] == 1) {
            i++;
            j++;
            count++;
          }
          maxLength = Math.max(maxLength, count);
        }
      }
    }

    // Check anti-diagonal lines
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i + 1 < m && j - 1 >= 0 && mat[i][j] == 1) {
          int count = 0;
          while (i + 1 < m && j - 1 >= 0 && mat[i + 1][j - 1] == 1) {
            i++;
            j--;
            count++;
          }
          maxLength = Math.max(maxLength, count);
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