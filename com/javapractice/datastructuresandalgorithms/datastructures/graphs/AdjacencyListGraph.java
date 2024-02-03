package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AdjacencyListGraph implements Graph{
    private List<Vertex> vertexList = new ArrayList<>();

    private int numVertices = 0;
    private GraphType graphType = GraphType.DIRECTED;

    public AdjacencyListGraph(int numVertices, GraphType graphType){
        this.numVertices = numVertices;

        for(int i = 0; i < numVertices; i++){
            vertexList.add(new Vertex(i, 0));
        }
        this.graphType = graphType;
    }

    @Override
    public void addEdge(int v1, int v2) {
        addEdge(v1,v2,1);
    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        if(v1 >= numVertices || v2 >= numVertices || v1 < 0 || v2 < 0){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        if(graphType == GraphType.UNDIRECTED){
            vertexList.get(v2).addEdge(v1, weight);
        }
        vertexList.get(v1).addEdge(v2, weight);
    }

    @Override
    public List<Vertex> getAdjacentListVertices(int v) {
        if(v < 0 || v >= numVertices){
            throw new IllegalArgumentException("Vertex number is not valid: " + v);
        }

        return vertexList.get(v).getAdjacentListVertices();
    }

    @Override
    public Set<SetVertex> getAdjacentSetVertices(int v) {
        return null;
    }

    @Override
    public List<Integer> getAdjacentMatrixVertices(int v) {
        return null;
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

    @Override
    public int getIndegree(int v) {
        int indegree = 0;

        for(Vertex vertex : vertexList){
            List<Vertex> adjacentVerticesList = vertex.getAdjacentListVertices();
            for(Vertex adjacentVertex : adjacentVerticesList){
                if(adjacentVertex.getVertexNumber() == v) {
                    indegree++;
                }
            }
        }
        return indegree;
    }

    @Override
    public void displayGraph() {
        System.out.println("Adjacency List\n");

        for(Vertex vertex : vertexList){
            List<Vertex> adjacentVertices = vertex.getAdjacentListVertices();

            System.out.println("Edges from "+ vertex.getVertexNumber() + " to : " + adjacentVertices);
        }
    }

    @Override
    public int getWeightedEdge(int v1, int v2) {
        return 0;
    }
}
