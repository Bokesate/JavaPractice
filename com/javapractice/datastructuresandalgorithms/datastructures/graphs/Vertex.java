package com.javapractice.datastructuresandalgorithms.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int vertexNumber;
    private int weight;
    private List<Vertex> adjacentList = new ArrayList<>();

    public Vertex(int vertexNumber, int weight){
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
        adjacentList.add(new Vertex(vertexNumber, weight));
    }

    public List<Vertex> getAdjacentListVertices(){
        return adjacentList;
    }

    public String toString(){
        return "Vertex: " + vertexNumber + " Weight: " + weight;
    }
}
