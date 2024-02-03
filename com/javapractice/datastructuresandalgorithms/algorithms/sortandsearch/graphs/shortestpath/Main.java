package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.shortestpath;

import com.javapractice.datastructuresandalgorithms.datastructures.graphs.AdjacencyMatrixGraph;
import com.javapractice.datastructuresandalgorithms.datastructures.graphs.Graph;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.shortestpath.Methods.shortestPath;

public class Main {
    public static void main(String[] args) {
        Graph graph = new AdjacencyMatrixGraph(8, Graph.GraphType.DIRECTED);

        graph.addEdge(2, 7);
        graph.addEdge(3, 0);
        graph.addEdge(0, 4);
        graph.addEdge(0, 1);
        graph.addEdge(2, 1);
        graph.addEdge(1, 3);
        graph.addEdge(3, 5);
        graph.addEdge(6, 3);
        graph.addEdge(4, 7);

        graph.displayGraph();

        shortestPath(graph, 1, 7);

        Graph weightedGraph = new AdjacencyMatrixGraph(8, Graph.GraphType.DIRECTED);

        weightedGraph.addEdge(0, 3,2);
        weightedGraph.addEdge(0, 4,2);
        weightedGraph.addEdge(0, 1,1);
        weightedGraph.addEdge(1, 3,2);
        weightedGraph.addEdge(2, 7,4);
        weightedGraph.addEdge(2, 1,3);
        weightedGraph.addEdge(3, 6,3);
        weightedGraph.addEdge(4, 7,2);
        weightedGraph.addEdge(7, 5,4);

        weightedGraph.displayGraph();

        shortestPath(weightedGraph, 0, 5);
    }
}
