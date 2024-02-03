package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AdjacencyMatrixGraph implements Graph {
    private int[][] adjacencyMatrix;
    private int numVertices = 0;
    private GraphType graphType;
    public AdjacencyMatrixGraph(int numVertices, GraphType graphType){
        this.numVertices = numVertices;
        this.graphType = graphType;
        this.adjacencyMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i ++){
            for (int j = 0; j < numVertices; j ++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        addEdge(v1, v2, 1);
    }
    @Override
    public void addEdge(int v1, int v2, int weight) {
        if(v1 >= numVertices || v2 >= numVertices || v1 < 0 || v2 < 0){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        if(graphType == GraphType.UNDIRECTED){
            adjacencyMatrix[v2][v1] = weight;
        }

        adjacencyMatrix[v1][v2] = weight;
    }

    @Override
    public List<Vertex> getAdjacentListVertices(int v) {
        return null;
    }

    @Override
    public Set<SetVertex> getAdjacentSetVertices(int v) {
        return null;
    }

    @Override
    public List<Integer> getAdjacentMatrixVertices(int v) {
        if(v < 0 || v >= numVertices){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        List<Integer> adjacentyVerticeList = new ArrayList<>();
        for(int i = 0; i < numVertices; i++){
            if(adjacencyMatrix[v][i] != 0){
                adjacentyVerticeList.add(i);
            }
        }

        Collections.sort(adjacentyVerticeList);

        return adjacentyVerticeList;
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

    @Override
    public int getIndegree(int v) {
        if( v < 0 || v >= numVertices){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        int indegree = 0;

        for (int i = 0; i < numVertices; i++){
            if(adjacencyMatrix[i][v] != 0){
                indegree++;
            }
        }

        return indegree;
    }

    @Override
    public void displayGraph() {
        System.out.println("Adjacency Matrix\n");
        for(int i = 0; i < numVertices; i++){
            for (int j = 0; j < numVertices; j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < numVertices; i++){
            System.out.print("Edges from " + i + " to : ");
            for (int j = 0; j < numVertices; j++){
                if(adjacencyMatrix[i][j] > 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public int getWeightedEdge(int v1, int v2){
        return adjacencyMatrix[v1][v2];
    }
}
