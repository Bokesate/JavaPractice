package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdjacencySetGraph implements Graph {
    private Set<SetVertex> vertexList = new HashSet<>();

    private int numVertices;
    private GraphType graphType;

    public AdjacencySetGraph(int numVertices, GraphType graphType){
        this.numVertices = numVertices;

        for(int i = 0; i < numVertices; i++){
            vertexList.add(new SetVertex(i, 0));
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
            getSetVertex(v2).addEdge(v1, weight);
        }
        getSetVertex(v1).addEdge(v2, weight);
    }

    @Override
    public List<Vertex> getAdjacentListVertices(int v) {
        return null;
    }

    @Override
    public Set<SetVertex> getAdjacentSetVertices(int v) {
        if(v < 0 || v >= numVertices){
            throw new IllegalArgumentException("Vertex number is not valid: " + v);
        }

        return getSetVertex(v).getAdjacentSetVertices();
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

        for(SetVertex vertex : vertexList){
            Set<SetVertex> adjacentVerticesList = vertex.getAdjacentSetVertices();
            for(SetVertex adjacentVertex : adjacentVerticesList){
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

        for(SetVertex vertex : vertexList){
            Set<SetVertex> adjacentVertices = vertex.getAdjacentSetVertices();

            System.out.println("Edges from "+ vertex.getVertexNumber() + " to : " + adjacentVertices);
        }
    }

    @Override
    public int getWeightedEdge(int v1, int v2) {
        return 0;
    }

    private SetVertex getSetVertex(int v){
        for(SetVertex sv : vertexList){
            if(sv.getVertexNumber() == v){
                return sv;
            }
        }
        return null;
    }
}
