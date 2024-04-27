package com.dong.tree;

/**
 * @author liudong 2024/4/27
 */
public class TreeMain {

    public static void main(String[] args) {
        // 树
        createTree();
        // 二叉树
        createBinaryTree();
        // 满二叉树
        createFullBinaryTree();
        // 完全二叉树
        createCompleteBinaryTree();
        // 二叉搜索树
        createBinarySearchTree();
        // 平衡二叉搜索树
        createBalancedBinarySearchTree();
    }

    /**
     * 创建普通树
     */
    private static void createTree() {
        TreeNode rootNode = new TreeNode(1);
        TreeNode childNode = new TreeNode(2);
        TreeNode childNode1 = new TreeNode(3);
        TreeNode childNode2 = new TreeNode(4);
        childNode1.setChildNode(new TreeNode(5), new TreeNode(6), new TreeNode(7), new TreeNode(8));
        rootNode.setChildNode(childNode, childNode1, childNode2);
        System.out.println(rootNode);
    }

    /**
     * 创建普通二叉树
     */
    private static void createBinaryTree() {
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode leftNode = new BinaryTreeNode(2);

        leftNode.setLeftNode(new BinaryTreeNode(4));

        BinaryTreeNode rightNode = new BinaryTreeNode(3);
        rightNode.setLeftNode(new BinaryTreeNode(5, new BinaryTreeNode(7), new BinaryTreeNode(8)));
        rightNode.setRightNode(new BinaryTreeNode(6));
        rootNode.setLeftNode(leftNode);
        rootNode.setRightNode(rightNode);
        System.out.println(rootNode);
    }

    /**
     * 满二叉树
     */
    private static void createFullBinaryTree() {
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode leftNode = new BinaryTreeNode(2);
        BinaryTreeNode rightNode = new BinaryTreeNode(3);
        leftNode.setLeftNode(new BinaryTreeNode(4));
        leftNode.setRightNode(new BinaryTreeNode(5));

        rightNode.setLeftNode(new BinaryTreeNode(6));
        rightNode.setRightNode(new BinaryTreeNode(7));

        rootNode.setLeftNode(leftNode);
        rootNode.setRightNode(rightNode);
        System.out.println(rootNode);
    }

    /**
     * 完全二叉树
     */
    private static void createCompleteBinaryTree() {
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode leftNode = new BinaryTreeNode(2);
        BinaryTreeNode rightNode = new BinaryTreeNode(3);
        leftNode.setLeftNode(new BinaryTreeNode(4));
        leftNode.setRightNode(new BinaryTreeNode(5));

        rightNode.setLeftNode(new BinaryTreeNode(6));

        rootNode.setLeftNode(leftNode);
        rootNode.setRightNode(rightNode);
        System.out.println(rootNode);
    }

    /**
     * 二叉搜索树
     */
    private static void createBinarySearchTree() {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        BinarySearchTreeNode leftNode = new BinarySearchTreeNode(5);
        BinarySearchTreeNode rightNode = new BinarySearchTreeNode(15);
        leftNode.setNode(new BinarySearchTreeNode(3));
        leftNode.setNode(new BinarySearchTreeNode(7));

        rightNode.setNode(new BinarySearchTreeNode(13));
        rightNode.setNode(new BinarySearchTreeNode(17));

        rootNode.setNode(leftNode);
        rootNode.setNode(rightNode);
        System.out.println(rootNode);
    }

    /**
     * 平衡二叉搜索树
     */
    private static void createBalancedBinarySearchTree() {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        BinarySearchTreeNode leftNode = new BinarySearchTreeNode(5);
        BinarySearchTreeNode rightNode = new BinarySearchTreeNode(15);
        leftNode.setNode(new BinarySearchTreeNode(3));
        leftNode.setNode(new BinarySearchTreeNode(7));

        rightNode.setNode(new BinarySearchTreeNode(13));
        rightNode.setNode(new BinarySearchTreeNode(17, new BinarySearchTreeNode(16), new BinarySearchTreeNode(18)));

        rootNode.setNode(leftNode);
        rootNode.setNode(rightNode);
        System.out.println(rootNode);
    }
}
