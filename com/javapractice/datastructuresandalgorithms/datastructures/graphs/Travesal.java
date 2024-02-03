package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Travesal {
    public static void breathFirstTraversal(Graph graph, int currentVertex){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentVertex);

        while(!queue.isEmpty()){
            int vertex = queue.remove();

            System.out.print(vertex + "->");

            List<Integer> list = graph.getAdjacentMatrixVertices(vertex);

            for (int v: list){
                queue.add(v);
            }
        }
    }

    public static void trackedBreathFirstTraversal(Graph graph, boolean[] visited, int currentVertex){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentVertex);

        while(!queue.isEmpty()){
            int vertex = queue.remove();

            if(visited[vertex]){
                continue;
            }

            System.out.print(vertex + "->");
            visited[vertex] = true;

            List<Integer> list = graph.getAdjacentMatrixVertices(vertex);

            for (int v: list){
                if(!visited[v]){
                    queue.add(v);
                }
            }
        }
    }

    public static void depthFirstTraversal(Graph graph, int currentVertex){
        List<Integer> list = graph.getAdjacentMatrixVertices(currentVertex);

        for(int vertex: list){
            depthFirstTraversal(graph, vertex);
        }

        System.out.print(currentVertex+"->");
    }

    public static void trackedDepthFirstTraversal(Graph graph, boolean[] visited, int currentVertex){
        if(visited[currentVertex]){
            return;
        }

        visited[currentVertex] = true;

        List<Integer> list = graph.getAdjacentMatrixVertices(currentVertex);

        for(int vertex: list){
            trackedDepthFirstTraversal(graph, visited, vertex);
        }

        System.out.print(currentVertex+"->");
    }
}
