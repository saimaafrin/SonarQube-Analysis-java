import java.util.*;

class Problem {
    /**
     * Given the size of the n-teresting space, the starting and ending n-tersection coordinates, and the paths between adjacent n-tersections, determine if it is possible to travel from the starting n-tersection to the ending n-tersection.
     * 
     * Parameters:
     * - n: the size of the n-teresting space
     * - start: the starting n-tersection coordinates
     * - end: the ending n-tersection coordinates
     * - paths: paths between adjacent n-tersections in the n-teresting space
     * 
     * Output:
     * - If travel is possible, return "can be travelled"
     * - If travel is not possible, return "cannot be travelled"
     */
    public static String canTravelMaze(int n, int[] start, int[] end, int[][] paths)  {
        int[][] adj = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = Integer.MAX_VALUE;
            }
        }

        // Set adjacency matrix values
        for (int[] path : paths) {
            adj[path[0]][path[1]] = 1;
            adj[path[1]][path[0]] = 1;
        }

        // Create an array of booleans to keep track of which nodes have been visited
        boolean[] visited = new boolean[n];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Start at the starting node
        queue.add(start[0]);

        // While queue is not empty
        while (!queue.isEmpty()) {
            // Get the first element in queue
            int curr = queue.poll();

            // If current element has not been visited
            if (!visited[curr]) {
                // Set visited to true
                visited[curr] = true;

                // If current element is the ending element
                if (curr == end[0]) {
                    // Return can be travelled
                    return "can be travelled";
                }

                // Add the neighbors of the current element to the queue
                for (int i = 0; i < n; i++) {
                    if (adj[curr][i] == 1 && !visited[i]) {
                        queue.add(i);
                    }
                }
            }
        }

        // If queue is empty, return cannot be travelled
        return "cannot be travelled";
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 2}, {1, 2, 2, 2}}).equals("can be travelled");
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 2, 1}, {2, 1, 2, 2}}).equals("can be travelled");
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 2, 1}}).equals("cannot be travelled");
        System.out.println("All tests passed");
    }
}