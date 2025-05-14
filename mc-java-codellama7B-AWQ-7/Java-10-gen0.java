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
        if(start == null || end == null || paths == null || paths.length == 0 || paths[0].length == 0) {
            return "cannot be travelled";
        }
        // Check if the starting and ending n-tersections are within the n-teresting space
        if(start[0] < 0 || start[0] >= n || start[1] < 0 || start[1] >= n || end[0] < 0 || end[0] >= n || end[1] < 0 || end[1] >= n) {
            return "cannot be travelled";
        }
        // Check if the paths is valid and do not have duplicate paths
        if(paths.length != n) {
            return "cannot be travelled";
        }
        // Check if all the paths are valid
        for(int i = 0; i < paths.length; i++) {
            if(paths[i] == null || paths[i].length == 0) {
                return "cannot be travelled";
            }
            for(int j = 0; j < paths[i].length; j++) {
                if(paths[i][j] < 0 || paths[i][j] >= n) {
                    return "cannot be travelled";
                }
            }
        }
        // Check if the start and end are adjacent to each other
        boolean isAdjacent = false;
        for(int i = 0; i < paths.length; i++) {
            for(int j = 0; j < paths[i].length; j++) {
                if(start[0] == paths[i][j] && start[1] == paths[i][j]) {
                    isAdjacent = true;
                    break;
                }
                if(end[0] == paths[i][j] && end[1] == paths[i][j]) {
                    isAdjacent = true;
                    break;
                }
            }
            if(isAdjacent) {
                break;
            }
        }
        if(!isAdjacent) {
            return "cannot be travelled";
        }
        // Check if the travel is possible
        // Create a 2D array of booleans to keep track of the n-terestions that have been visited
        boolean[][] visited = new boolean[n][n];
        // Initialize all the n-terestions to false
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }
        // Set the start n-terestion to true
        visited[start[0]][start[1]] = true;
        // Create a queue to store the coordinates of the n-terestions to be visited
        Queue<int[]> queue = new LinkedList<>();
        // Add the starting n-terestion to the queue
        queue.offer(start);
        // Loop until the queue is empty
        while(!queue.isEmpty()) {
            // Get the coordinates of the next n-terestion to be visited
            int[] temp = queue.poll();
            // If the n-terestion is the ending n-terestion, return "can be travelled"
            if(temp[0] == end[0] && temp[1] ==
    public static void main(String[] args) {
        // Test the function with different test cases
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 2}, {1, 2, 2, 2}}).equals("can be travelled");
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 2, 1}, {2, 1, 2, 2}}).equals("can be travelled");
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 2, 1}}).equals("cannot be travelled");
        System.out.println("All tests passed");
    }
}