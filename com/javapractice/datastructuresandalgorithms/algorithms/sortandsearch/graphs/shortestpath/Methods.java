package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.shortestpath;

import com.javapractice.datastructuresandalgorithms.datastructures.graphs.Graph;
import com.javapractice.datastructuresandalgorithms.datastructures.graphs.Vertex;

import java.util.*;

public class Methods {

    private static Map<Integer, DistanceEntry> buildDistanceTable(Graph graph, int source){
        Map<Integer, DistanceEntry> distanceTable = new HashMap<>();

        for(int j = 0; j < graph.getNumVertices(); j++){
            distanceTable.put(j, new DistanceEntry());
        }

        distanceTable.get(source).setDistance(0);
        distanceTable.get(source).setLastVertex(source);

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);

        while(!queue.isEmpty()){
            int currentVertex = queue.pollFirst();
            for(int i : graph.getAdjacentMatrixVertices(currentVertex)){
                int currentDistance = distanceTable.get(i).getDistance();

                if(currentDistance == -1){
                    currentDistance = 1 + distanceTable.get(currentVertex).getDistance();

                    distanceTable.get(i).setDistance(currentDistance);
                    distanceTable.get(i).setLastVertex(currentVertex);

                    if(!graph.getAdjacentMatrixVertices(i).isEmpty()){
                        queue.add(i);
                    }
                }
            }
        }

        return distanceTable;
    }

    public static void shortestPath(Graph graph, int source, int destination){
        Map<Integer, DistanceEntry> distanceTable = buildDistanceTable(graph, source);

        Stack<Integer> stack = new Stack<>();
        stack.push(destination);

        int previousVertex = distanceTable.get(destination).getLastVertex();

        while(previousVertex != -1 && previousVertex != source){
            stack.push(previousVertex);
            previousVertex = distanceTable.get(previousVertex).getLastVertex();
        }

        if(previousVertex == -1){
            System.out.println("There is no path from node: " + source + " to node: " + destination);
        }else{
            System.out.print("\n\nShortest path is " + source);

            while(!stack.isEmpty()){
                System.out.print(" => " + stack.pop());
            }

            System.out.println("\n\nShortest Path Unweighted Done!");
        }
    }

    public static Map<Integer, DistanceEntry> buildDistanceTableWeighed(Graph graph, int source){
        Map<Integer, DistanceEntry> distanceTable = new HashMap<>();

        PriorityQueue<VertexInfo> queue = new PriorityQueue<>(new Comparator<VertexInfo>(){
                @Override
                public int compare(VertexInfo v1, VertexInfo v2){
                    return ((Integer) v1.getDistance()).compareTo(v2.getDistance());
                }
        });

        for(int j = 0; j < graph.getNumVertices(); j++){
            distanceTable.put(j, new DistanceEntry());
        }

        distanceTable.get(source).setDistance(0);
        distanceTable.get(source).setLastVertex(source);

        VertexInfo sourceVertexInfo = new VertexInfo(source, 0);
        queue.add(sourceVertexInfo);

        Map<Integer, VertexInfo> vertexInfoMap = new HashMap<>();
        vertexInfoMap.put(source, sourceVertexInfo);

        while(!queue.isEmpty()){
            VertexInfo vertexInfo = queue.poll();
            int currentVertex = vertexInfo.getVertexId();

            for (Integer neighbor : graph.getAdjacentMatrixVertices(currentVertex)){
                int distance = distanceTable.get(currentVertex).getDistance() + graph.getWeightedEdge(currentVertex, neighbor);

                if(distanceTable.get(neighbor).getDistance() > distance){
                    distanceTable.get(neighbor).setDistance(distance);
                    distanceTable.get(neighbor).setLastVertex(currentVertex);

                    VertexInfo neightborVertexInfo = vertexInfoMap.get(neighbor);

                    if(neightborVertexInfo != null){
                        queue.remove(neightborVertexInfo);
                    }

                    neightborVertexInfo = new VertexInfo(neighbor, distance);

                    queue.add(neightborVertexInfo);
                    vertexInfoMap.put(neighbor, neightborVertexInfo);
                }
            }
        }
        return distanceTable;
    }
}
