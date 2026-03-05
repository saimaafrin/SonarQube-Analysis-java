class Problem {

  /**
   * Find the smallest integer that can be formed by rearranging the digits of the given positive integer n, which is greater than n.
   *
   * @param n The input positive integer.
   * @return The smallest rearranged integer greater than n, or -1 if not possible.
   *
   * Example:
   * findSmallestInteger(12)
   * Output: 21
   */
  public static int findSmallestInteger(int n)  {
    if (n == 0) return 0;

    String s = String.valueOf(n);
    char[] arr = s.toCharArray();
    int l = 0, r = arr.length - 1;

    while (l < r) {
      if (arr[l] != arr[r]) {
        for (int i = r; i > l; i--) {
          if (arr[i] != arr[r]) {
            arr[i] = arr[r];
            String str = new String(arr, l, r - l + 1);
            return Integer.parseInt(str);
          }
       
        }
        arr[l] = arr[r];
        String str = new String(arr, l + 1, r - l);
        return Integer.parseInt(str);
      }
      l++;
      r--;
    }
    return -1;
  }
  public static void main(String[] args) {
    assert findSmallestInteger(123) == 132;
    assert findSmallestInteger(531) == -1;
    assert findSmallestInteger(2071) == 2107;

    System.out.println("All tests passed");
  }
}