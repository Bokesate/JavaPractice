package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.insertionsort;

import com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.insertionsort.Methods.insertionSort;

public class Main {
    public static void main(String[] args) {
        int[] unsortedList = InitialiseComponent.unsortedIntegerList();
        System.out.println(Arrays.toString(unsortedList));
        insertionSort(unsortedList);
    }
}
