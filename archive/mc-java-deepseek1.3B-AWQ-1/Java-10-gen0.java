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
        Set<Pair> pathSet = new HashSet<>();
        for (int[] path : paths) {
            pathSet.add(new Pair(path[0], path[1]));
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(start[0], start[1]));

        Set<Pair> visited = new HashSet<>();
        visited.add(new Pair(start[0], start[1]));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            if (Arrays.equals(current.toArray(), end)) {
                return "can be travelled";
            }

            for (int i = 0; i < n; i++) {
                Pair neighbour = new Pair(current.x + i, current.y + paths[i][0]);

                if (pathSet.contains(neighbour) && !visited.contains(neighbour)) {
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
           
            }
        }

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