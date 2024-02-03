package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.List;
import java.util.Set;

public interface Graph {
    enum GraphType{
        DIRECTED,
        UNDIRECTED
    }

    void addEdge(int v1, int v2);
    void addEdge(int v1, int v2, int weight);

    List<Integer> getAdjacentMatrixVertices(int v);
    List<Vertex> getAdjacentListVertices(int v);
    Set<SetVertex> getAdjacentSetVertices(int v);
    int getNumVertices();

    int getIndegree(int v);

    void displayGraph();

    int getWeightedEdge(int v1, int v2);
}
