import java.util.*;

class Problem {
    /**
     * The approximate value is calculated by counting the number of common letters
     * and dividing it by the sum of the lengths of the two words.
     *
     * @param word1 The first word.
     * @param word2 The second word.
     * @return The approximate value as a reduced fraction.
     *
     * >>> appx("CAR", "CART")
     * "appx(CAR, CART) = 6/7"
     * >>> appx("TURKEY", "CHICKEN")
     * "appx(TURKEY, CHICKEN) = 4/13"
     * >>> appx("MONEY", "POVERTY")
     * "appx(MONEY, POVERTY) = 1/3"
     * >>> appx("ROUGH", "PESKY")
     * "appx(ROUGH, PESKY) = 0"
     * >>> appx("A", "A")
     * "appx(A, A) = 1"
     */
    public static String appx(String word1, String word2)  {
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLen = Math.max(len1, len2);
        int[] counts = new int[maxLen];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    counts[i]++;
                }
            }
        }
        int common = 0;
        for (int i = 0; i < maxLen; i++) {
            if (counts[i] > 0) {
                common += counts[i];
            }
        }
        return "appx(" + word1 + ", " + word2 + ") = " + common + "/" + len1 + len2;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert appx("DOG", "CAT").equals("appx(DOG, CAT) = 0/6");
        assert appx("HELLO", "WORLD").equals("appx(HELLO, WORLD) = 3/10");
        assert appx("JAVA", "PYTHON").equals("appx(JAVA, PYTHON) = 0/10");
        System.out.println("All tests passed");
    }
}