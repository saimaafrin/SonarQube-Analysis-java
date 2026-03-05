import java.lang.Math;

class Problem {

  /**
   * Find and return the nth ugly number.
   *
   * @param n The index of the ugly number to find.
   * @return The nth ugly number.
   *
   * Example:
   * findNthUglyNumber(10)
   * Output: 12
   */
  public static int findNthUglyNumber(int n)  {
    // Initialize a vector to store the ugly numbers.
    int[] uglyNumbers = new int[n];

    // Initialize an array to store the factors of 2, 3, and 5.
    int[] factors = new int[3];
    factors[0] = 2;
    factors[1] = 3;
    factors[2] = 5;

    // Initialize an array to store the product of the current factors.
    int[] products = new int[n];

    // Initialize the first ugly number.
    uglyNumbers[0] = 1;

    // Initialize the product of the first factors.
    products[0] = 2 * 3 * 5;

    // Loop through each index in the uglyNumbers array.
    for (int i = 1; i < n; i++) {
      // Find the minimum product of the current factors.
      int minProduct = Math.min(uglyNumbers[i - 1] / factors[0],
                                Math.min(uglyNumbers[i - 1] / factors[1],
                                        uglyNumbers[i - 1] / factors[2]));

      // Add the minimum product to the products array.
      products[i] = minProduct;

      // Add the minimum product to the uglyNumbers array.
      uglyNumbers[i] = products[i];
    }

    // Return the last product in the uglyNumbers array.
    return uglyNumbers[n - 1];
  }
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
