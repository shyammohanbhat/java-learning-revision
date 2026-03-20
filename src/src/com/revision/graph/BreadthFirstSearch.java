package com.revision.graph;

import java.util.*;

public class BreadthFirstSearch {
    public static void main() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4));
        graph.put(3, Arrays.asList(1, 4));
        graph.put(4, Arrays.asList(2, 3));

        bfs(1, graph);
    }

    /*
        ✅ Shortest path problems
        ✅ Level by level traversal
        ✅ Find nearest/closest node
        ✅ Connected components
        ✅ Grid problems (islands, distances)

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
}
