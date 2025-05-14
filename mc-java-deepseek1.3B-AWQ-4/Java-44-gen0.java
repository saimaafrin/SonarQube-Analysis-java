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
    if(mat.length == 0) return new int[0];

    int rows = mat.length;
    int cols = mat[0].length;

    int size = rows * cols;
    int[] res = new int[size];
    int resIdx = 0;

    ArrayList<Integer> diagonalOrder = new ArrayList<>(size);

    // Top Left to Right Bottom
    for(int i = 0; i < cols; i++){
      diagonalOrder.add(mat[0][i]);
    }
    resIdx = cols;

    // Right to Left (Top)
    for(int i = 1; i < rows; i++){
      diagonalOrder.add(mat[i][cols-1]);
   
    }
    resIdx++;

    // Bottom Right to Left
    for(int i = cols-2; i >= 0; i--){
      diagonalOrder.add(mat[rows-1][i]);
    }
    resIdx++;

    // Top Right to Bottom
    for(int i = rows-2; i >= 1; i--){
      diagonalOrder.add(mat[i][0]);
    }

    for(int num: diagonalOrder){
      res[resIdx++] = num;
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