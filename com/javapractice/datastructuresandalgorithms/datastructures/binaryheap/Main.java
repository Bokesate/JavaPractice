package com.javapractice.datastructuresandalgorithms.datastructures.binaryheap;

public class Main {
    public static void main(String[] args) throws HeapFullException, HeapEmptyException {
        MaxHeap<Integer> maxHeap = new MaxHeap<>(Integer.class);

        maxHeap.insert(9);
        maxHeap.insert(4);
        maxHeap.insert(17);
        maxHeap.insert(6);
        maxHeap.insert(100);
        maxHeap.insert(133);
        maxHeap.insert(47);
        maxHeap.insert(247);
        System.out.println(maxHeap);

        System.out.println("------------------------");

        System.out.println();
        System.out.println(maxHeap);
        System.out.println("Highest priority element: " + maxHeap.getHighestPriority());

        System.out.println();
        System.out.println(maxHeap);
        maxHeap.removeHighestPriority();

        System.out.println("-----------MinHeap now-------------");

        MinHeap<Integer> MinHeap = new MinHeap<>(Integer.class);
        MinHeap.insert(9);
        MinHeap.insert(4);
        MinHeap.insert(17);
        MinHeap.insert(6);
        MinHeap.insert(100);
        MinHeap.insert(3);
        MinHeap.insert(13);
        MinHeap.insert(23);

        System.out.println("------------------------");

        System.out.println();
        System.out.println(MinHeap);
        System.out.println("Highest priority element: " + MinHeap.getHighestPriority());

        System.out.println();
        System.out.println(MinHeap);
        MinHeap.removeHighestPriority();
    }
}
