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
    
    ArrayList<Integer> result = new ArrayList<>();
    int rows = mat.length;
    int cols = mat[0].length;
    boolean up = true; // Direction flag
    
    for (int i = 0; i < rows + cols - 1; i++) {
      if (up) {
        int r = Math.min(i, rows - 1);
        int c = i - r;
        while (r >= 0 && c < cols) {
          result.add(mat[r][c]);
          r--;
          c++;
        }
      } else {
        int c = Math.min(i, cols - 1);
        int r = i - c;
        while (c >= 0 && r < rows) {
          result.add(mat[r][c]);
          r++;
          c--;
        }
      }
      up = !up; // Toggle direction
    }
    
    // Convert ArrayList to array
    int[] ans = new int[result.size()];
    for (int j = 0; j < result.size(); j++) {
      ans[j] = result.get(j);
    }
    return ans;
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