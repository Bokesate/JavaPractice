package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.mergesort;

import com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.mergesort.Methods.mergeSort;

public class Main {
    public static void main(String[] args) {
        String[] unsortedList = InitialiseComponent.unsortedStringList();
        System.out.println(Arrays.toString(unsortedList));
        mergeSort(unsortedList);
    }
}
