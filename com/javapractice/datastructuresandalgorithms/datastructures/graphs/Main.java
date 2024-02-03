package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import static com.javapractice.datastructuresandalgorithms.datastructures.graphs.Travesal.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = new AdjacencyMatrixGraph(8, Graph.GraphType.UNDIRECTED);

        graph.addEdge(1, 0, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 5, 3);

        graph.addEdge(3, 4);

        graph.addEdge(2, 7);
        graph.addEdge(2, 4, 5);
        graph.addEdge(2, 3, 4);

        graph.addEdge(5, 6, 2);

        graph.addEdge(6, 3);

        graph.displayGraph();

        System.out.println("\nIndegree of 1: " + graph.getIndegree(1));
        System.out.println("\nIndegree of 3: " + graph.getIndegree(3));
        System.out.println("\nIndegree of 5: " + graph.getIndegree(5));

        System.out.println("\nVerticies adjacent to 1: " + graph.getAdjacentMatrixVertices(1));
        System.out.println("\nVerticies adjacent to 2: " + graph.getAdjacentMatrixVertices(2));
        System.out.println("\nVerticies adjacent to 5: " + graph.getAdjacentMatrixVertices(5));
        System.out.println("\nVerticies adjacent to 7: " + graph.getAdjacentMatrixVertices(7));

        Graph listGraph = new AdjacencyListGraph(8, Graph.GraphType.DIRECTED);

        listGraph.addEdge(1, 0,2);
        listGraph.addEdge(1, 2,1);
        listGraph.addEdge(1, 5,3);

        listGraph.addEdge(3, 4);

        listGraph.addEdge(2, 7);
        listGraph.addEdge(2, 4);
        listGraph.addEdge(2, 3,5);

        listGraph.addEdge(5, 6,4);

        listGraph.addEdge(6, 3,2);

        listGraph.displayGraph();

        System.out.println("\nIndegree of 1: " + listGraph.getIndegree(1));
        System.out.println("\nIndegree of 3: " + listGraph.getIndegree(3));
        System.out.println("\nIndegree of 5: " + listGraph.getIndegree(5));

        System.out.println("\nVerticies adjacent to 1: " + listGraph.getAdjacentListVertices(1));
        System.out.println("\nVerticies adjacent to 2: " + listGraph.getAdjacentListVertices(2));
        System.out.println("\nVerticies adjacent to 5: " + listGraph.getAdjacentListVertices(5));
        System.out.println("\nVerticies adjacent to 7: " + listGraph.getAdjacentListVertices(7));

        Graph SetGraph = new AdjacencySetGraph(8, Graph.GraphType.DIRECTED);

        SetGraph.addEdge(1, 0,2);
        SetGraph.addEdge(1, 2,1);
        SetGraph.addEdge(1, 5,3);

        SetGraph.addEdge(3, 4);

        SetGraph.addEdge(2, 7);
        SetGraph.addEdge(2, 4);
        SetGraph.addEdge(2, 3,5);

        SetGraph.addEdge(5, 6,4);

        SetGraph.addEdge(6, 3,2);

        SetGraph.displayGraph();

        System.out.println("\nIndegree of 1: " + SetGraph.getIndegree(1));
        System.out.println("\nIndegree of 3: " + SetGraph.getIndegree(3));
        System.out.println("\nIndegree of 5: " + SetGraph.getIndegree(5));

        System.out.println("\nVerticies adjacent to 1: " + SetGraph.getAdjacentListVertices(1));
        System.out.println("\nVerticies adjacent to 2: " + SetGraph.getAdjacentListVertices(2));
        System.out.println("\nVerticies adjacent to 5: " + SetGraph.getAdjacentListVertices(5));
        System.out.println("\nVerticies adjacent to 7: " + SetGraph.getAdjacentListVertices(7));

        Graph graphTraversal = new AdjacencyMatrixGraph(8, Graph.GraphType.DIRECTED);

        graphTraversal.addEdge(1, 0);
        graphTraversal.addEdge(1, 2);
        graphTraversal.addEdge(1, 5);
        graphTraversal.addEdge(3, 4);
        graphTraversal.addEdge(2, 7);
        graphTraversal.addEdge(2, 4);
        graphTraversal.addEdge(2, 3);
        graphTraversal.addEdge(5, 6);
        graphTraversal.addEdge(6, 3);

        graphTraversal.displayGraph();

        System.out.println("\n--------------------------------------\n");

        breathFirstTraversal(graphTraversal,1);

        System.out.println("\n--------------------------------------\n");

        boolean[] visited = new boolean[graphTraversal.getNumVertices()];
        trackedBreathFirstTraversal(graphTraversal, visited,1);

        System.out.println("\n--------------------------------------\n");

        depthFirstTraversal(graphTraversal,1);

        System.out.println("\n--------------------------------------\n");

        boolean[] visitedDepth = new boolean[graphTraversal.getNumVertices()];
        trackedDepthFirstTraversal(graphTraversal,visitedDepth,1);

        System.out.println("\n--------------------------------------\n");

    }
}
