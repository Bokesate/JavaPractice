package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.balancedbinarytree;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

import java.util.Map;

public class Methods {
    public static <T> boolean isBalanced(Node<T> root, Map<Node<?>, Integer> nodeHeightMap){
        if(root == null){
            return true;
        }

        boolean isLeftBalanced = isBalanced(root.getLeftChild(), nodeHeightMap);
        boolean isRightBalanced = isBalanced(root.getRightChild(), nodeHeightMap);

        int leftHeight = nodeHeightMap.getOrDefault(root.getLeftChild(),0);
        int rightHeight = nodeHeightMap.getOrDefault(root.getRightChild(),0);

        nodeHeightMap.put(root, Math.max(leftHeight, rightHeight) + 1);

        if (Math.abs(leftHeight - rightHeight) <= 1){
            return isLeftBalanced && isRightBalanced;
        }

        return false;
    }
}
