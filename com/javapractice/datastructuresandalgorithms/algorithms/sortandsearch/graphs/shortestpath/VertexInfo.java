package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.shortestpath;

public class VertexInfo {
    private int vertexId;
    private int distance;

    public VertexInfo(int vertexId, int distance) {
        this.vertexId = vertexId;
        this.distance = distance;
    }

    public int getVertexId() {
        return vertexId;
    }

    public int getDistance() {
        return distance;
    }

    public String toString(){
        return "Vertex: " + vertexId + " Edge weight: " + distance;
    }
}
