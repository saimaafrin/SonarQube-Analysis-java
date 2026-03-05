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
        // Write your solution here
        // 1. Initialize the variables
        int result = 0;
        int length = grid.length;
        int width = grid[0].length;
        boolean[][] visited = new boolean[length][width];
        Set<String> oilDeposits = new HashSet<>();

        // 2. Iterate through the grid
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                // 2.1. If the current character is an oil deposit, check its neighbors and add them to the set
                if (grid[i][j] == '@') {
                    Set<String> neighbors = new HashSet<>();
                    for (int k = 0; k < 8; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if (x >= 0 && x < length && y >= 0 && y < width) {
                            neighbors.add(grid[x][y] == '@' ? "1" : "0");
                        }
                    }
                    oilDeposits.add(neighbors.toString());
                }
                // 2.2. If the current character is not an oil deposit, mark it as visited
                else if (grid[i][j] == '*') {
                    visited[i][j] = true;
                }
            }
        }

        // 3. Count the oil deposits
        for (String deposit: oilDeposits) {
            result += (deposit.length() + 1);
        }

        return result;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert countOilDeposits(new char[][] {{'@', '@', '@'}, {'@', '*', '@'}, {'@', '@', '@'}}) == 1;
        assert countOilDeposits(new char[][] {{'@', '*', '@'}, {'*', '*', '*'}, {'@', '*', '@'}}) == 4;
        assert countOilDeposits(new char[][] {{'*', '*', '*', '*', '*'}, {'*', '@', '@', '@', '*'}, {'*', '@', '*', '@', '*'}, {'*', '@', '@', '@', '*'}, {'*', '*', '*', '*', '*'}}) == 1;
        System.out.println("All tests passed");
    }
}