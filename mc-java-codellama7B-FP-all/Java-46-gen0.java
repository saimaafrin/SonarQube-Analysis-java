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
    // 0000
    // 0100
    // 0010
    // 0001

    // 1010
    // 1100
    // 1001
    // 1011
    // 0101
    // 0110
    // 0011

    // 8888
    // 8988
    // 8898
    // 8889
    // 8998
    // 8899
    // 8989
    // 8999
    // 9888
    // 9988
    // 9898
    // 9889
    // 9998
    // 9989
    // 9899
    // 9999

    // 1234
    // 1232
    // 1243
    // 1223
    // 1231
    // 1242
    // 1234
    // 1222
    // 1224
    // 1244
    // 1242
    // 1233
    // 1234
    // 1243
    // 1232
    // 1223
    // 1213
    // 1241
    // 1212
    // 1214
    // 1241
    // 1231
    // 1221
    // 1222
    // 1224
    // 1244
    // 1242
    // 1233
    // 1234
    // 1243
    // 1232
    // 1223
    // 1213
    // 1241
    // 1212
    // 1214
    // 1241
    // 1231
    // 1221
    // 1222
    // 1224
    // 1244
    // 1242
    // 1233
    // 1234
    // 1243
    // 1232
    // 1223
    // 1213
    // 1241
    // 1212
    // 1214
    // 1241
    // 1231
    // 1221
    // 1222
    // 1224
    // 1244
    // 1242
    // 1233
    // 1234
    // 1243
    // 1232
    // 1223
    // 1213
    // 1241
    // 1212
    // 1214
    // 1241
    // 1231
    // 1221
    // 1222
    // 1224
    // 1244
    // 1242
    // 1233
    // 1234
    // 1243
    // 1232
    // 1223
    //
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
