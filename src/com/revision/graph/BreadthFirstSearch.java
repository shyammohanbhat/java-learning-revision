package com.revision.graph;

import java.util.*;

/*
        ✅ Shortest path problems
        ✅ Level by level traversal
        ✅ Find nearest/closest node
        ✅ Connected components
        ✅ Grid problems (islands, distances)
 */
public class BreadthFirstSearch {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4));
        graph.put(3, Arrays.asList(1, 4));
        graph.put(4, Arrays.asList(2, 3));

        bfs(1, graph);

        System.out.println();

        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        bfs(grid, 0, 0);

    }

    /*
        Time O(V + E) — visits every vertex and edge once
        Space O(V) — queue holds at most all vertices
     */
    public static void bfs(int start, Map<Integer, List<Integer>> graph){

        //Queue decides the ORDER of processing!
        //Queue REMEMBERS who is waiting to be processed!
        Queue<Integer> queue   = new LinkedList<>();

        //Without visited set → INFINITE LOOP!
        Set<Integer>   visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for(int neighbor : graph.get(node)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void bfs(int[][] grid, int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c, grid[r][c]});   // add to BACK
        grid[r][c] = '0';               // mark visited

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();  // remove from FRONT
            int row = curr[0];
            int col = curr[1];
            int val = curr[2];

            System.out.print(val + " ");

            for (int[] dir : dirs) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] != '0') {
                    queue.offer(new int[]{nr, nc, grid[nr][nc]}); // add to BACK
                    grid[nr][nc] = '0';             // mark visited
                }
            }
        }
    }
}
