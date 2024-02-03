package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.topologicalsort;

import com.javapractice.datastructuresandalgorithms.datastructures.graphs.AdjacencyMatrixGraph;
import com.javapractice.datastructuresandalgorithms.datastructures.graphs.Graph;
import com.javapractice.datastructuresandalgorithms.datastructures.graphs.Vertex;

import java.util.*;

public class Methods {
    public static List<Integer> sort(Graph graph){
        LinkedList<Integer> queue = new LinkedList<>();

        Map<Integer, Integer> indegreeMap = new HashMap<>();

        for (int vertex = 0; vertex < graph.getNumVertices(); vertex++){
            int indegree = graph.getIndegree(vertex);

            indegreeMap.put(vertex, indegree);

            if(indegree == 0){
                queue.add(vertex);
            }
        }

        List<Integer> sortedList = new ArrayList<>();

        while (!queue.isEmpty()){

            int vertex = queue.remove();

            sortedList.add(vertex);

            List<Integer> adjacentVertices = graph.getAdjacentMatrixVertices(vertex);

            for (Integer adjacentVertex : adjacentVertices){
                int updatedIndegree = indegreeMap.get(adjacentVertex) - 1;
                indegreeMap.put(adjacentVertex, updatedIndegree);
                if(updatedIndegree == 0){
                    queue.add(adjacentVertex);
                }
            }
        }

        if(sortedList.size() != graph.getNumVertices()){
            throw new RuntimeException(("The graph has a cycle!"));
        }

        return sortedList;
    }

    public static List<String> order(List<String> courseList, Map<String, List<String>> prereqs){
        Graph courseGraph = new AdjacencyMatrixGraph(courseList.size(), Graph.GraphType.DIRECTED);
        Map<String, Integer> courseIdMap = new HashMap<>();
        Map<Integer, String> idCourseMap = new HashMap<>();

        for(int i = 0; i < courseList.size(); i++){
            courseIdMap.put(courseList.get(i), i);
            idCourseMap.put(i, courseList.get(i));
        }

        for(Map.Entry<String, List<String>> prereq : prereqs.entrySet()){
            for (String course: prereq.getValue()){
                courseGraph.addEdge(courseIdMap.get(prereq.getKey()),courseIdMap.get(course));
            }
        }

        List<Integer> courseIdList = sort(courseGraph);
        List<String> courseScheduleList = new ArrayList<>();

        for(int courseId : courseIdList){
            courseScheduleList.add(idCourseMap.get(courseId));
        }

        return courseScheduleList;
    }
}
