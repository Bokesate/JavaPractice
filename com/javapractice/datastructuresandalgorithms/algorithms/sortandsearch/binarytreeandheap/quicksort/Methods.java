package com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap.quicksort;

import java.util.Arrays;
import static com.javapractice.datastructuresandalgorithms.algorithms.sortandsearch.binarytreeandheap._constant.Methods.swap;

public class Methods {
    public static int partition(String[] listToSort, int low, int high){
        String pivot = listToSort[low];

        int l = low;
        int h = high;

        System.out.println("\nPivot = " + pivot);

        while (l < h){
            while ( listToSort[l].compareTo(pivot) <= 0 && l < h){
                l++;
            }

            while ( listToSort[h].compareTo(pivot) > 0){
                h--;
            }

            if ( l < h){
                swap(listToSort, l , h);

                System.out.print("Swapping: " + l + " " + h + " ");
                System.out.println(Arrays.toString(listToSort));
            }
        }

        if(low != h){
            swap(listToSort, low , h);

            System.out.print("Swapping: " + low + " " + h + " ");
            System.out.println(Arrays.toString(listToSort));
        }

        System.out.println("\nPartitioned: " + Arrays.toString(listToSort) + " around pivot: " + pivot);

        return h;
    }

    public static void quickSort(String[] listToSort, int low, int high){
        if (low >= high){
            return;
        }

        int pivotIndex = partition(listToSort,low,high);

        quickSort(listToSort, low, pivotIndex - 1);
        quickSort(listToSort, pivotIndex + 1, high);
    }
}
