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
        class Position {
            int x;
            int y;
            boolean visited;
            Position(int x, int y) {
                this.x = x;
                this.y = y;
                visited = false;
            }
        }
        class GraphNode {
            Position position;
            List<GraphNode> connections = new ArrayList<GraphNode>();
            int depth = 0;
            GraphNode(Position position, int depth) {
                this.position = position;
                this.depth = depth;
            }
        }
        class Graph {
            List<GraphNode> nodes = new ArrayList<GraphNode>();
            void addNode(Position position, int depth) {
                GraphNode node = new GraphNode(position, depth);
                nodes.add(node);
                nodes.stream().filter(x -> x.position.x == position.x && x.position.y == position.y).forEach(x -> node.connections.add(x));
            }
            void addConnection(int x, int y, int depth) {
                nodes.stream().filter(x -> x.position.x == x && x.position.y == y).forEach(x -> nodes.stream().filter(y -> y.position.x == x && y.position.y == y).forEach(y -> x.connections.add(y)));
            }
        }
        Graph graph = new Graph();
        for (int[] path : paths) {
            graph.addConnection(path[0], path[1], 1);
        }
        Position startPosition = new Position(start[0], start[1]);
        Position endPosition = new Position(end[0], end[1]);
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(graph.nodes.stream().filter(x -> x.position.x == startPosition.x && x.position.y == startPosition.y).findFirst().get());
        while (!queue.isEmpty()) {
            GraphNode node = queue.remove();
            if (node.position.x == endPosition.x && node.position.y == endPosition.y) {
                return "can be travelled";
            }
            node.connections.stream().filter(x -> !x.visited).forEach(x -> {
                queue.add(x);
                x.visited = true;
            });
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