import java.util.*;

class Problem {

    /**
     * Given a grid representing a land divided into square plots, determine the number of distinct oil deposits.
     * 
     * Parameters:
     *     grid (char[][]): The grid representing the land. Each character is either '*' for absence of oil or '@' for an oil pocket.
     * 
     * Returns:
     *     int: The number of distinct oil deposits in the grid.
     * 
     * Example:
     *     >>> countOilDeposits(new char[][] {{'*'}})
     *     0
     *     >>> countOilDeposits(new char[][] {{'*', '@', '*', '@', '*'}, {'*', '*', '@', '*', '*'}, {'*', '@', '*', '@', '*'}})
     *     1
     *     >>> countOilDeposits(new char[][] {{'@', '@', '*', '*', '*', '*', '@', '*'}})
     *     2
     */
    private static final int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
    private static final int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
    public static int countOilDeposits(char[][] grid)  {
        int m = grid.length, n = grid[0].length, count = 0;
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == '@') {
                    StringBuilder builder = new StringBuilder();
                    boolean found = false;
                    for (int k = 0; k < 8; ++k) {
                        int x = i + dx[k], y = j + dy[k];
                        if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '@') {
                            builder.append(x).append(y);
                            if (!seen.contains(builder.toString())) {
                                found = true;
                                seen.add(builder.toString());
                                count++;
                            }
                        }
                    }
                    if (!found) {
                        seen.add(Integer.toString(i) + Integer.toString(j));
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert countOilDeposits(new char[][] {{'@', '@', '@'}, {'@', '*', '@'}, {'@', '@', '@'}}) == 1;
        assert countOilDeposits(new char[][] {{'@', '*', '@'}, {'*', '*', '*'}, {'@', '*', '@'}}) == 4;
        assert countOilDeposits(new char[][] {{'*', '*', '*', '*', '*'}, {'*', '@', '@', '@', '*'}, {'*', '@', '*', '@', '*'}, {'*', '@', '@', '@', '*'}, {'*', '*', '*', '*', '*'}}) == 1;
        System.out.println("All tests passed");
    }
}