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
        // base case: if the start and end points are equal, it means that the maze is a point, so travel is possible
        if(start[0] == end[0] && start[1] == end[1]) {
            return "can be travelled";
        }

        // create an adjacency matrix based on the paths
        int[][] adjMatrix = new int[n][n];
        for(int i = 0; i < paths.length; i++) {
            adjMatrix[paths[i][0]][paths[i][1]] = 1;
        }

        // create a queue of the starting point and a set of points already visited
        Queue<int[]> q = new LinkedList<int[]>();
        Set<int[]> visited = new HashSet<int[]>();
        q.add(start);
        visited.add(start);

        // while there are still points to visit, continue to visit adjacent points
        while(!q.isEmpty()) {
            int[] curPoint = q.remove();
            for(int i = 0; i < n; i++) {
                if(adjMatrix[curPoint[0]][i] == 1 && !visited.contains(new int[]{curPoint[0], i})) {
                    q.add(new int[]{curPoint[0], i});
                    visited.add(new int[]{curPoint[0], i});
                }
            }
        }

        // if the ending point has been visited, then travel is possible
        if(visited.contains(end)) {
            return "can be travelled";
        }

        // otherwise, travel is not possible
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