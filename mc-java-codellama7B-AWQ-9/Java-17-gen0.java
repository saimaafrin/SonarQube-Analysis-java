import java.util.*;

class Problem {

  /**
   * Given a tree with n nodes and edges, and a boolean array hasApple indicating if each node has an apple.
   * Starting from node 0, return the minimum time required to collect all the apples and return to node 0.
   *
   * Example:
   * Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,true,true,false]
   * Output: 8
   *
   * Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,false,true,false]
   * Output: 6
   *
   * Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,false,false,false,false,false]
   * Output: 0
   */
  List<Set<Integer>> tree;
  int[] res;

  public int minTime(int n, int[][] edges, boolean[] hasApple)  {
    List<Integer>[] adj = (List<Integer>[])new List[n];
    for (int i = 0; i < n; ++i) adj[i] = new ArrayList<>();
    for (int[] edge : edges) {
      adj[edge[0]].add(edge[1]);
      adj[edge[1]].add(edge[0]);
    }

    boolean[] visited = new boolean[n];
    res = new int[n];
    Arrays.fill(res, Integer.MAX_VALUE);

    dfs(adj, visited, 0, hasApple, 0);
    return res[0];
  }
  public static void main(String[] args) {
    Problem solution = new Problem();

    // Test the function with different test cases
    assert solution.minTime(
      7,
      new int[][] {
        { 0, 1 },
        { 0, 2 },
        { 1, 4 },
        { 1, 5 },
        { 2, 3 },
        { 2, 6 },
      },
      new boolean[] { true, false, true, false, true, true, false }
    ) ==
    8;
    assert solution.minTime(
      7,
      new int[][] {
        { 0, 1 },
        { 0, 2 },
        { 1, 4 },
        { 1, 5 },
        { 2, 3 },
        { 2, 6 },
      },
      new boolean[] { true, true, true, true, true, true, true }
    ) ==
    12;
    assert solution.minTime(
      7,
      new int[][] {
        { 0, 1 },
        { 0, 2 },
        { 1, 4 },
        { 1, 5 },
        { 2, 3 },
        { 2, 6 },
      },
      new boolean[] { false,false,true,false,false,true,false }
    ) ==
    6;

    assert solution.minTime(
      7,
      new int[][] {
        { 0, 1 },
        { 0, 2 },
        { 1, 4 },
        { 1, 5 },
        { 2, 3 },
        { 2, 6 },
      },
      new boolean[] { false,false,false,false,false,false,false }
    ) ==
    0;
    System.out.println("All tests passed");
  }
}