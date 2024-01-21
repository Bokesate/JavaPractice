package com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.mergesort;

import com.javapractice.datastructureandalgorithms.algorithms.sortandsearch._constant.InitialiseComponent;

import java.util.Arrays;

import static com.javapractice.datastructureandalgorithms.algorithms.sortandsearch.mergesort.Methods.mergeSort;

public class Main {
    public static void main(String[] args) {
        String[] unsortedList = InitialiseComponent.unsortedStringList();
        System.out.println(Arrays.toString(unsortedList));
        mergeSort(unsortedList);
    }
}
