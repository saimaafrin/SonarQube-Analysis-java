import java.util.ArrayList;

class Problem {

  /**
   * Return all elements in the matrix in diagonal order.
   *
   * @param mat The input matrix.
   * @return An array containing all elements in diagonal order.
   *
   * Example:
   * diagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})
   * Output: [1,2,4,7,5,3,6,8,9]
   */
  public static int[] diagonalOrder(int[][] mat)  {

    if (mat == null || mat.length == 0) return new int[0];

    int m = mat.length, n = mat[0].length;
    int[] res = new int[m * n];
    int k = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        res[k++] = mat[i][j];
        if (i + 1 < m && j + 1 < n) {
          res[k++] = mat[i + 1][j + 1];
       
        }
      }
   
    }
  
    return res;
  }
  public static void main(String[] args) {
    assert java.util.Arrays.equals(
      diagonalOrder(new int[][] { { 1, 2 }, { 3, 4 } }),
      new int[] { 1, 2, 3, 4 }
    );
    assert java.util.Arrays.equals(
      diagonalOrder(
        new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }
      ),
      new int[] { 1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12 }
    );
    assert java.util.Arrays.equals(
      diagonalOrder(new int[][] { { 1 }, { 2 }, { 3 } }),
      new int[] { 1, 2, 3 }
    );

    System.out.println("All tests passed");
  }
}