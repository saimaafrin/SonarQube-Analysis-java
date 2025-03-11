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
        // Initialize a 2D array to keep track of visited n-tersections
        boolean[][] visited = new boolean[n][n];

        // Initialize a queue of n-tersections to visit
        Queue<int[]> queue = new LinkedList<>();

        // Mark the starting n-tersection as visited and add it to the queue
        visited[start[0]][start[1]] = true;
        queue.add(start);

        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Dequeue an n-tersection
            int[] current = queue.poll();

            // If the dequeued n-tersection is the ending n-tersection, return "can be travelled"
            if (Arrays.equals(current, end)) {
                return "can be travelled";
            }

            // Loop through the paths between adjacent n-tersections
            for (int[] path : paths) {
                // If the current n-tersection is not visited
                if (!visited[path[0]][path[1]]) {
                    // Mark the current n-tersection as visited and add it to the queue
                    visited[path[0]][path[1]] = true;
                    queue.add(path);
                }
            }
        }

        // If the ending n-tersection was not visited, return "cannot be travelled"
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