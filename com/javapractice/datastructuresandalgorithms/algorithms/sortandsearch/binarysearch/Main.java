package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarysearch;

import com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch._constant.InitialiseComponent;

import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarysearch.Method.*;
import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.quicksort.Methods.quickSort;
import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.shellsort.Methods.shellSort;

public class Main {
    public static void main(String[] args) {
        String[] unsortedList = InitialiseComponent.unsortedStringList();

        System.out.println("\nElement index: " + linearSearch(unsortedList, "Ben"));

        quickSort(unsortedList, 0, unsortedList.length -1);

        System.out.println("\nBinarySearch...");
        System.out.println("\nElement index: " + binarySearch(unsortedList, "Ben"));

        System.out.println("\nBinarySearchRecursive...");
        System.out.println("\nElement index: " + binarySearchRecursive(unsortedList, "Gerald", 0, unsortedList.length - 1));

        System.out.println("\nJumpSearch...");
        int jumpLength = 6;
        System.out.println("\nElement index: " + jumpSearch(unsortedList, "Gerald", jumpLength));

        System.out.println("\nJumpSearch... N/M + (M-1)");
        jumpLength = (int) Math.sqrt(unsortedList.length);
        System.out.println("\nElement index: " + jumpSearch(unsortedList, "Gerald", jumpLength));

        System.out.println("\nInterpolationSearch...");
        int[] unsortedIntegerList = InitialiseComponent.unsortedIntegerList() ;
        shellSort(unsortedIntegerList);
        System.out.println("\nElement index: " + interpolationSearch(unsortedIntegerList, 90));


    }
}
