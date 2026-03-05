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
        // Initialize the visited array
        boolean[] visited = new boolean[n * n];
        // Initialize the queue
        Queue<int[]> queue = new LinkedList();
        // Add the starting n-tersection to the queue
        queue.add(start);
        // Initialize the visited array
        visited[start[0] * n + start[1]] = true;
        // Initialize the path
        int[] path = new int[n * n];
        // Initialize the path length
        int pathLength = 0;
        // Initialize the current n-tersection
        int[] current = new int[2];
        // Initialize the current n-tersection
        current[0] = start[0];
        current[1] = start[1];
        // Initialize the current n-tersection
        int[] next = new int[2];
        // Initialize the next n-tersection
        next[0] = start[0];
        next[1] = start[1];
        // Initialize the next n-tersection
        int[][] nexts = new int[n * n][2];
        // Initialize the next n-tersection
        nexts[0][0] = start[0];
        nexts[0][1] = start[1];
        // Initialize the next n-tersection
        nexts[1][0] = start[0];
        nexts[1][1] = start[1];
        // Initialize the next n-tersection
        nexts[2][0] = start[0];
        nexts[2][1] = start[1];
        // Initialize the next n-tersection
        nexts[3][0] = start[0];
        nexts[3][1] = start[1];
        // Initialize the next n-tersection
        nexts[4][0] = start[0];
        nexts[4][1] = start[1];
        // Initialize the next n-tersection
        nexts[5][0] = start[0];
        nexts[5][1] = start[1];
        // Initialize the next n-tersection
        nexts[6][0] = start[0];
        nexts[6][1] = start[1];
        // Initialize the next n-tersection
        nexts[7][0] = start[0];
        nexts[7][1] = start[1];
        // Initialize the next n-tersection
        nexts[8][0] = start[0];
        nexts[8][1] = start[1];
        // Initialize the next n-tersection
        nexts[9][0] = start[0];
        nexts[9][1] = start[1];
        // Initialize the next n-tersection
        nexts[10][0] = start[0];
        nexts[10][1] = start[1];
        // Initialize the next n-tersection
        nexts[11][0] = start[0];
        nexts[11][1] = start[1];
        // Initialize the next n-tersection
        nexts[12][0] = start[0];
        nexts[12][1] = start[1];
        // Initialize the next n-tersection
        nexts[13][0] = start[0];
        nexts[13][1] = start[1];
        // Initialize the next n-tersection
    public static void main(String[] args) {
        // Test the function with different test cases
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 2}, {1, 2, 2, 2}}).equals("can be travelled");
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 2, 1}, {2, 1, 2, 2}}).equals("can be travelled");
        assert canTravelMaze(2, new int[]{0, 0}, new int[]{2, 2}, new int[][]{{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 2, 1}}).equals("cannot be travelled");
        System.out.println("All tests passed");
    }
}