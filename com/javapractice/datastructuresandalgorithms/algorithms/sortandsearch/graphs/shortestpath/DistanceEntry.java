package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.shortestpath;

public class DistanceEntry {
    private int distance;
    private int lastVertex;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getLastVertex() {
        return lastVertex;
    }

    public void setLastVertex(int lastVertex) {
        this.lastVertex = lastVertex;
    }

    public DistanceEntry(boolean weighted){
        distance = Integer.MAX_VALUE;
        lastVertex = -1;
    }

    public DistanceEntry(){
        distance = -1;
        lastVertex = -1;
    }
}
