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
    ArrayList<Integer> diagonalOrder = new ArrayList<Integer>();

    for(int i=0; i<mat.length; i++) {
      for(int j=0; j<mat[0].length; j++) {
        if(i == j) {
          diagonalOrder.add(mat[i][j]);
        }
        if(i + j == mat.length - 1) {
          diagonalOrder.add(mat[i][j]);
        }
      }
    }

    int[] output = new int[diagonalOrder.size()];
    for(int i=0; i<output.length; i++) {
      output[i] = diagonalOrder.get(i);
    }
    return output;
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