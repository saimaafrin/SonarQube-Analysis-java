class Problem {

  /**
   * Given an integer n, return the minimum number of perfect square numbers that sum up to n.
   *
   * @param n The target integer.
   * @return The minimum number of perfect square numbers.
   *
   * Example:
   * minPerfectSquareSum(12)
   * Output: 3
   *
   * Example:
   * minPerfectSquareSum(13)
   * Output: 2
   */
  public static int minPerfectSquareSum(int n)  {
    // Create a list to keep track of the minimum perfect squares we have so far.
    List<Integer> squares = new ArrayList<>();

    // While we still have some squares left to add.
    while (n > 0) {
      // Try adding the smallest possible square that is still smaller than n.
      int square = findSmallestSquare(n, squares);
      // Add this square to the list of squares.
      squares.add(square);
      // Subtract the square from n.
      n -= square;
   
      // If n is now zero, we have found the minimum perfect squares that sum up to n.
      if (n == 0) {
        return squares.size();
      }
    }

    // This should never happen as we've checked all possible squares.
    return -1;
  }
  public static void main(String[] args) {
    assert minPerfectSquareSum(26) == 2 : "Test case 1 failed";
    assert minPerfectSquareSum(17) == 2 : "Test case 2 failed";
    assert minPerfectSquareSum(99) == 3 : "Test case 3 failed";
    System.out.println("All tests passed");
  }
}