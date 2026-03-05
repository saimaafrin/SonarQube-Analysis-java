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
        int startX = start[0];
        int startY = start[1];
        int endX = end[0];
        int endY = end[1];
        
        // BFS
        Queue<int[]> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        queue.add(new int[]{startX, startY});
        visited.add(startX + "," + startY);
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = current[0] + dx[i];
                int newY = current[1] + dy[i];
                if (newX == endX && newY == endY) {
                    return "can be travelled";
                }
                String newPosition = newX + "," + newY;
                if (visited.contains(newPosition)) {
                    continue;
                }
                visited.add(newPosition);
                boolean isPathExist = false;
                for (int[] path : paths) {
                    if (path[0] == newX && path[1] == newY) {
                        isPathExist = true;
                        queue.add(new int[]{newX, newY});
                        break;
                    }
                }
                if (!isPathExist) {
                    visited.remove(newPosition);
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