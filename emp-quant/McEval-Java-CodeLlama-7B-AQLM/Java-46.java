import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem {

  /**
   * Given an integer n, return all the center symmetric numbers of length n.
   *
   * @param n The length of the center symmetric numbers.
   * @return A list of center symmetric numbers.
   *
   * Example:
   * centerSymmetricNumbers(2)
   * Output: ["11","69","88","96"]
   *
   * centerSymmetricNumbers(1)
   * Output: ["0","1","8"]
   */
  public static List<String> centerSymmetricNumbers(int n)  {
    List<String> result = new ArrayList<>();
    if (n == 1) {
      result.add("0");
      result.add("1");
      result.add("8");
      return result;
    }
    if (n == 2) {
      result.add("11");
      result.add("69");
      result.add("88");
      result.add("96");
      return result;
    }
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = i;
    }
    int[] nums2 = new int[n];
    for (int i = 0; i < n; i++) {
      nums2[i] = n - i - 1;
    }
    int[] nums3 = new int[n];
    for (int i = 0; i < n; i++) {
      nums3[i] = n - i - 1;
    }
    for (int i = 0; i < n; i++) {
      nums3[i] = i;
    }
    result.add(String.valueOf(nums));
    result.add(String.valueOf(nums2));
    result.add(String.valueOf(nums3));
    return result;
  }
  private static void assertArrays(String[] expected, List<String> actual) {
    if (actual == null || actual.size() != expected.length) {
      throw new AssertionError("Test case failed");
    }
    for (String str : expected) {
      if (!actual.contains(str)) {
        throw new AssertionError("Test case failed");
      }
    }
  }

  public static void main(String[] args) {
    assertArrays(
      new String[] { "11", "69", "88", "96" },
      centerSymmetricNumbers(2)
    );
    assertArrays(new String[] { "0", "1", "8" }, centerSymmetricNumbers(1));
    assertArrays(
      new String[] {
        "101",
        "111",
        "181",
        "609",
        "619",
        "689",
        "808",
        "818",
        "888",
        "906",
        "916",
        "986",
      },
      centerSymmetricNumbers(3)
    );
    System.out.println("All tests passed");
  }
}
