package com.javapractice.datastructuresandalgorithms.datastructures.binaryheap;

public class MaxHeap <T extends Comparable<T>> extends Heap<T>{
    public MaxHeap(Class<T> clazz) {
        super(clazz);
    }

    @Override
    protected void siftDown(int index) {
        System.out.println("Sifting down: " + getElementAtIndex(index));

        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        //Note: find the largest of the left and right child element
        int largerIndex = -1;

        if(leftIndex != -1 && rightIndex != -1){
            T leftElement = getElementAtIndex(leftIndex);
            T rightElement = getElementAtIndex(rightIndex);

            largerIndex = leftElement.compareTo(rightElement) > 0 ? leftIndex : rightIndex;
        } else if (leftIndex != -1){
            largerIndex = leftIndex;
        } else if (rightIndex != -1){
            largerIndex = rightIndex;
        }

        // Note: if the left and right child do not exist stop sifting down.
        if(largerIndex == -1){
            System.out.println("Stop sifting down, found position");

            return;
        }

        System.out.println("Larger child: " + getElementAtIndex(largerIndex));

        //Note: compare the larger child with the current index to see if a swap and further sift down is needed.
        if(getElementAtIndex(largerIndex).compareTo(getElementAtIndex(index)) > 0){
            swap(largerIndex, index);
            System.out.println("Swap: " + this);
            siftDown(largerIndex);
        }
    }

    @Override
    protected void siftUp(int index) {
        System.out.println("Sifting up: " + getElementAtIndex(index));
        int parentIndex = getParentIndex(index);

        if(parentIndex == -1){
            System.out.println("Stop sifting up, found position");
            return;
        }

        System.out.println("Parent: " + getElementAtIndex(parentIndex));
        if(getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) > 0){
            swap(parentIndex, index);
            System.out.println(("Swap: " + this));
            siftUp(parentIndex);
        }
    }
}
