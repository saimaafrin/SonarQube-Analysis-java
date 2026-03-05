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
        // Initialize a boolean array with the size of the n-teresting space to false
        boolean[] visited = new boolean[n];
        // Set the starting n-tersection to true
        visited[start[0]] = true;
        
        // Initialize a queue and enqueue the starting n-tersection
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start[0]);

        // While there are elements in the queue
        while (!queue.isEmpty()) {
            // Dequeue the first n-tersection
            int current = queue.poll();

            // If the current n-tersection is the ending n-tersection
            if (current == end[0]) {
                return "can be travelled";
            }

            // For each path from the current n-tersection
            for (int path : paths[current]) {
                // If the path is not visited
                if (!visited[path]) {
                    // Mark the path as visited
                    visited[path] = true;
                    // Enqueue the path
                    queue.add(path);
                }
           
            }

        }

        // If we've reached here, it means that we haven't been able to reach the ending n-tersection from the starting n-tersection
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