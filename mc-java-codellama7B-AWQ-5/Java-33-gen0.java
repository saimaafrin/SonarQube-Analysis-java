import java.util.*;

class Problem {
    /**
     * Return the lexicographically smallest string of length n and value k.
     * The value of a string is the sum of the positions of its characters in the alphabet (starting from 1).
     * Example:
     * >>> getSmallestString(3, 27)
     * "aay"
     * >>> getSmallestString(5, 73)
     * "aaszz"
     */
    public String getSmallestString(int n, int k)  {
        if (n <= 1) {
            return " ";
        }

        Map<Integer, Character> map = new TreeMap<Integer, Character>();
        StringBuffer buffer = new StringBuffer();
        int index = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            map.put(i, (char) (index + 'a' - 1));
            buffer.append((char) (index + 'a' - 1));
            sum += index++;
        }

        while (k > sum) {
            k -= sum;
            Iterator<Map.Entry<Integer, Character>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Character> entry = iterator.next();
                int temp = entry.getKey();
                sum -= temp;
                if (sum > k) {
                    map.put(temp, map.get(temp) + 1);
                    buffer.setCharAt(buffer.length() - 1, map.get(temp));
                    break;
                } else if (sum == k) {
                    map.put(temp, map.get(temp) + 1);
                    buffer.setCharAt(buffer.length() - 1, map.get(temp));
                    break;
                } else if (sum < k) {
                    buffer.append(map.get(temp));
                    map.put(temp, map.get(temp) + 1);
                    break;
                }
            }
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.getSmallestString(3, 27).equals("aay");
        assert solution.getSmallestString(5, 73).equals("aaszz");
        assert solution.getSmallestString(3, 30).equals("acz");
        System.out.println("All tests passed");
    }
}