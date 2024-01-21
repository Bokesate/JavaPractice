package com.javapractice.datastructureandalgorithms.binarytree.pathsum;

import com.javapractice.datastructureandalgorithms.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

public class Main {
    public static void main(String[] args) {
        Node<Integer> nodes = InitialiseNodes.initialiseNumberNodes();

        System.out.println();
        System.out.println("hasPathSum 3: " + hasPathSum(nodes,3));

        System.out.println();
        System.out.println("hasPathSum 25: " + hasPathSum(nodes,25));

        System.out.println();
        System.out.println("hasPathSum 19: " + hasPathSum(nodes,19));
    }

    public static boolean hasPathSum(Node<Integer> root, int currentSum){
        if(root == null){
            return false;
        }

        if(root.getLeftChild() == null && root.getRightChild() == null){
            return currentSum == root.getData();
        }

        boolean hasPathSumLeft = hasPathSum(root.getLeftChild(), currentSum - root.getData());
        boolean hasPathSumRight = hasPathSum(root.getRightChild(), currentSum - root.getData());

        boolean hasPathSum = hasPathSumLeft || hasPathSumRight;

        System.out.println(root +
                " hasPathSumLeft: " + hasPathSumLeft +
                " hasPathSumRight: " + hasPathSumRight +
                " hasPathSum: " + hasPathSum);

        return hasPathSum;
    }
}
