package com.revision.graph;

import java.util.*;

public class DepthFirstSearch {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4));
        graph.put(3, Arrays.asList(1, 4));
        graph.put(4, Arrays.asList(2, 3));

        dfsIterative(1, graph);

        System.out.println();

        dfsRecursive(1, graph, new HashSet<>());

        System.out.println();

        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        dfsIterative(grid, 0, 0);

        int[][] grid2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println();
        dfsRecursive(grid2, 0, 0);
    }

    public static void dfsIterative(int start, Map<Integer, List<Integer>> graph){
        Deque<Integer> stack = new ArrayDeque<>();

        //Without visited set → INFINITE LOOP!
        Set<Integer>   visited = new HashSet<>();

        stack.push(start);
        visited.add(start);

        while(!stack.isEmpty()){
            int node = stack.pop();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }

    /*
        Recursive approach
     */
    public static void dfsRecursive(int start, Map<Integer, List<Integer>> graph, Set<Integer> visited){
        visited.add(start);

        System.out.print(start + " ");

        for (int neighbor : graph.get(start)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, graph, visited);
            }
        }
    }

    public static void dfsIterative(int[][] grid, int r, int c) {
        Deque<int[]> stack = new ArrayDeque<>();
        System.out.print(grid[r][c] + " ");
        stack.push(new int[]{r, c});    // add to TOP
        grid[r][c] = '0';               // mark visited

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();   // remove from TOP
            int row = curr[0];
            int col = curr[1];

            for (int[] dir : dirs) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] != '0') {
                    System.out.print(grid[nr][nc] + " ");
                    stack.push(new int[]{nr, nc}); // add to TOP
                    grid[nr][nc] = '0';            // mark visited
                }
            }
        }
    }

    public static void dfsRecursive(int[][] grid, int r, int c) {
        // base cases — when to STOP
        if (r < 0 || r >= grid.length ||
                c < 0 || c >= grid[0].length ||
                grid[r][c] == '0') return;

        System.out.print(grid[r][c] + " ");
        grid[r][c] = '0';              // mark visited

        dfsRecursive(grid, r-1, c);   // UP
        dfsRecursive(grid, r+1, c);   // DOWN
        dfsRecursive(grid, r, c-1);   // LEFT
        dfsRecursive(grid, r, c+1);   // RIGHT
    }
}
