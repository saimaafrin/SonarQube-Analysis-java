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
        if (grid.length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        int oilDeposits = 0;
        Set<String> oilDepositLocations = new HashSet<>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '@') {
                    oilDeposits++;
                    oilDepositLocations.add(i + "," + j);
                    
                    int x = i, y = j;
                    while (true) {
                        int nx = x + dx[grid[x][y]], ny = y + dy[grid[x][y]];
                        if (nx < 0 || nx >= rows || ny < 0 || ny >= cols || grid[nx][ny] == '*') {
                            break;
                        }
                        
                        oilDepositLocations.add(nx + "," + ny);
                        x = nx;
                        y = ny;
                    }
                }
            }
        }
        
        return oilDeposits;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert countOilDeposits(new char[][] {{'@', '@', '@'}, {'@', '*', '@'}, {'@', '@', '@'}}) == 1;
        assert countOilDeposits(new char[][] {{'@', '*', '@'}, {'*', '*', '*'}, {'@', '*', '@'}}) == 4;
        assert countOilDeposits(new char[][] {{'*', '*', '*', '*', '*'}, {'*', '@', '@', '@', '*'}, {'*', '@', '*', '@', '*'}, {'*', '@', '@', '@', '*'}, {'*', '*', '*', '*', '*'}}) == 1;
        System.out.println("All tests passed");
    }
}