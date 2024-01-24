package com.javapractice.datastructuresandalgorithms.datastructures.binaryheap;

import java.util.Arrays;

public class HeapifyAndHeapSort {
    private static int getParentIndex(int index, int endIndex){
        if(index < 0 || index > endIndex){
            return -1;
        }
        return (index -1) / 2;
    }

    private static int getLeftChildIndex(int index, int endIndex){
        int leftChildIndex = 2 * index + 1;
        if(leftChildIndex > endIndex){
            return -1;
        }
        return leftChildIndex;
    }
    private static int getRightChildIndex(int index, int endIndex){
        int rightChildIndex = 2 * index + 2;
        if(rightChildIndex > endIndex){
            return -1;
        }
        return rightChildIndex;
    }

    private static void swap(int[] array, int index1, int index2){
        int tempValue = array[index1];

        array[index1] = array[index2];
        array[index2] = tempValue;
    }

    private static void percolateDown(int[] array, int index, int endIndex){
        int leftChildIndex = getLeftChildIndex(index, endIndex);
        int rightChildIndex = getRightChildIndex(index, endIndex);

        //Note: find the largest of the left and right child element
        int largerIndex = -1;

        if(leftChildIndex != -1 && rightChildIndex != -1){
            largerIndex = array[leftChildIndex] > array[rightChildIndex] ? leftChildIndex : rightChildIndex;
        } else if (leftChildIndex != -1){
            largerIndex = leftChildIndex;
        } else if (rightChildIndex != -1){
            largerIndex = rightChildIndex;
        }

        // Note: if the left and right child do not exist stop sifting down.
        if(largerIndex == -1){
            System.out.println("Stop sifting down, found position");
            return;
        }

        //Note: compare the larger child with the current index to see if a swap and further sift down is needed.
        if(array[largerIndex] > array[index]){
            swap(array, largerIndex, index);
            System.out.println("Swap: " + Arrays.toString(array));
            percolateDown(array, largerIndex, endIndex);
        }
    }

    public static void heapify(int[] array, int endIndex){
        int index = getParentIndex(endIndex, endIndex);

        System.out.println("Child: " + array[endIndex]);
        System.out.println("Parent: " + array[index]);

        while (index >= 0){
            System.out.println("\nProcessing index: " + index + " Array: " + Arrays.toString(array));
            percolateDown(array, index, endIndex);

            index--;
        }
    }

    public static void heapSort(int[] array){
        heapify(array, array.length - 1);
        System.out.println("----------------------");
        int endIndex = array.length - 1;
        while(endIndex > 0){
            System.out.println("\nEnd of heap: " + array[endIndex] + " Array: " + Arrays.toString(array));

            System.out.println("\nMove " + array[0] + " to the end");

            swap(array, 0 , endIndex);
            System.out.println("\nAfter swap: " + Arrays.toString(array));

            endIndex--;

            percolateDown(array, 0 , endIndex);
        }
    }

    public static void main(String[] args){
        int[] array = { 4,6,9,2,10,56,12,5,1,17,14};
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }
}
