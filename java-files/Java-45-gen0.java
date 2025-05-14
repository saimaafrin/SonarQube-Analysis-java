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
    StringBuilder sb = new StringBuilder(Integer.toString(n));
    for (int i = n + 1; i < 10000; i++) {
      String s = Integer.toString(i);
      char[] ca = s.toCharArray();
      Arrays.sort(ca);
      StringBuilder sb2 = new StringBuilder();
      for (char c : ca) {
        sb2.append(c);
     
      }
      if (sb2.toString().equals(sb.toString())) {
        return i;
      }
   
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