package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.topologicalsort;

import com.javapractice.datastructuresandalgorithms.datastructures.graphs.AdjacencyMatrixGraph;
import com.javapractice.datastructuresandalgorithms.datastructures.graphs.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.topologicalsort.Methods.order;
import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.graphs.topologicalsort.Methods.sort;

public class Main {
    public static void main(String[] args) {
        Graph graph = new AdjacencyMatrixGraph(8, Graph.GraphType.DIRECTED);

        graph.addEdge(2, 7);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(0, 1);
        graph.addEdge(2, 1);
        graph.addEdge(1, 3);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 7);

        graph.displayGraph();

        System.out.println("\n--------------------------------------\n");

        System.out.println(sort(graph));

        System.out.println("\n--------------------------------------\n");

        List<String> courses = new ArrayList<>();

        courses.add("CS100");
        courses.add("CS101");
        courses.add("CS102");
        courses.add("CS103");
        courses.add("CS104");
        courses.add("CS105");
        courses.add("CS240");

        Map<String, List<String>> prereqs = new HashMap<>();
        List<String> list = new ArrayList<>();

        list.add("CS101");
        list.add("CS102");
        list.add("CS103");
        prereqs.put("CS100", list);

        list = new ArrayList<>();
        list.add("CS104");
        prereqs.put("CS101", list);

        list = new ArrayList<>();
        list.add("CS105");
        prereqs.put("CS103", list);

        list = new ArrayList<>();
        list.add("CS240");
        prereqs.put("CS102", list);

        List<String> courseSchedule = order(courses, prereqs);
        System.out.println("Valid schedule for CS Students: " + courseSchedule);
    }
}
