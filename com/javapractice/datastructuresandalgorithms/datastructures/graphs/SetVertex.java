package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.HashSet;
import java.util.Set;

public class SetVertex {
    private int vertexNumber;
    private int weight;
    private Set<SetVertex> adjacentList = new HashSet<>();

    public SetVertex(int vertexNumber, int weight){
        this.vertexNumber = vertexNumber;
        this.weight = weight;
    }

    public int getVertexNumber(){
        return vertexNumber;
    }

    public int getWeight(){
        return weight;
    }

    public void addEdge(int vertexNumber, int weight){
        adjacentList.add(new SetVertex(vertexNumber, weight));
    }

    public Set<SetVertex> getAdjacentSetVertices(){
        return adjacentList;
    }

    public String toString(){
        return "Vertex: " + vertexNumber + " Weight: " + weight;
    }
}
