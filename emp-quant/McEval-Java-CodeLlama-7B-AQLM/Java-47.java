class Problem {

  /**
   * Determine if the given points form a boomerang on the X-Y plane.
   *
   * @param points An array of points where points[i] = [xi, yi].
   * @return True if the points form a boomerang, false otherwise.
   *
   * Example:
   * isBoomerang(new int[][]{{1,1},{2,3},{3,2}})
   * Output: true
   */
  public static boolean isBoomerang(int[][] points)  {
    if (points.length < 3) {
      return false;
    }

    int[][] sortedPoints = new int[points.length][2];
    for (int i = 0; i < points.length; i++) {
      sortedPoints[i] = new int[] {points[i][0], points[i][1]};
    }

    Arrays.sort(sortedPoints, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

    int[][] sortedPointsWithDuplicates = new int[points.length][2];
    for (int i = 0; i < points.length; i++) {
      sortedPointsWithDuplicates[i] = new int[] {sortedPoints[i][0], sortedPoints[i][1]};
    }

    return !Arrays.equals(sortedPoints, sortedPointsWithDuplicates);
  }
  public static void main(String[] args) {
    assert isBoomerang(new int[][] { { 0, 0 }, { 2, 2 }, { 1, 1 } }) ==
    false : "Test case 1 failed";
    assert isBoomerang(new int[][] { { 1, 1 }, { 2, 4 }, { 3, 1 } }) ==
    true : "Test case 2 failed";
    assert isBoomerang(new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 } }) ==
    true : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}