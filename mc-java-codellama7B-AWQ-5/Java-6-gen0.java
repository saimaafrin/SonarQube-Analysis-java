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
        final int m = grid.length;
        if (m == 0) return 0;
        final int n = grid[0].length;

        // Initialize a queue to hold the positions of the oil pockets.
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == '@') {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // A map to keep track of the oil pockets and their neighbors.
        final Map<String, int[]> oilPockets = new HashMap<>();

        // A set to keep track of the oil pockets that have already been visited.
        final Set<String> visited = new HashSet<>();

        // Iterate until the queue is empty.
        while (!queue.isEmpty()) {
            final int[] position = queue.poll();
            final String oilPocket = position[0] + ":" + position[1];

            // If the oil pocket has not been visited, mark it as visited and enqueue its neighbors.
            if (!visited.contains(oilPocket)) {
                visited.add(oilPocket);
                for (int i = 0; i < 8; ++i) {
                    final int x = position[0] + dx[i];
                    final int y = position[1] + dy[i];
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '@') {
                        queue.offer(new int[]{x, y});
                    }
                }

                // Add the oil pocket to the map.
                oilPockets.put(oilPocket, new int[]{position[0], position[1]});
            }
        }

        // Count the number of distinct oil pockets.
        return oilPockets.size();
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert countOilDeposits(new char[][] {{'@', '@', '@'}, {'@', '*', '@'}, {'@', '@', '@'}}) == 1;
        assert countOilDeposits(new char[][] {{'@', '*', '@'}, {'*', '*', '*'}, {'@', '*', '@'}}) == 4;
        assert countOilDeposits(new char[][] {{'*', '*', '*', '*', '*'}, {'*', '@', '@', '@', '*'}, {'*', '@', '*', '@', '*'}, {'*', '@', '@', '@', '*'}, {'*', '*', '*', '*', '*'}}) == 1;
        System.out.println("All tests passed");
    }
}